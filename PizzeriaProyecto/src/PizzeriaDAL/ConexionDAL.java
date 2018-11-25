package PizzeriaDAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexionDAL {
    
    String CadenaConexion="jdbc:sqlite:C:\\Users\\alque\\Desktop\\7D\\Programacion\\practica3.db";
    Connection conn=null;
    
    public ConexionDAL(){
    
    }
    public Connection Conectar(){
        try {
            Class.forName("org.sqlite.JDBC");
            this.conn= DriverManager.getConnection(CadenaConexion);
        } catch (Exception e) {
            System.out.println("Problemas al conectarse"+e);
        }
      return this.conn;
    }
    
    public int probar(){
        try{
              Class.forName("org.sqlite.JDBC");
              Connection c = DriverManager.getConnection(CadenaConexion);
        }catch (Exception e){
            return 0;
        }
        return 1;
    }
    
    public void Desconectar(){
        this.conn=null;
    }
    
   
    public int EjecutarComandoSQL(String Sentencia){
        try {
         PreparedStatement pstm=Conectar().prepareStatement(Sentencia);
         pstm.execute();
         return 1;
        }catch (SQLException e) {
            System.out.println(e);
            return 0;
        }
    
    }
    public ResultSet EjecutarSentenciaSQL(String Sentencia){
     try {
         PreparedStatement pstm=Conectar().prepareStatement(Sentencia);
         pstm.execute();
          ResultSet Resultado=pstm.executeQuery();
           return Resultado;
        }catch (SQLException e) {
            System.out.println(e);
         return null;   
        }
    }
}
