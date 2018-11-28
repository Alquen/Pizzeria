/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PizzeriaDAL;
import PizzeriaBL.PizzaBL;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author SistemasV2
 */
public class PizzaDAL {
    ConexionDAL conex = new ConexionDAL();
    
    public int Agregar(PizzaBL Pizza){
        int ComandoEjecutado = conex.EjecutarComandoSQL("INSERT INTO tblPizzas (nombre,foto,precio,descripcion,codigo) VALUES"+
                "('"+ Pizza.getNombre() +"', '"+ Pizza.getFoto() +"', '"+ Pizza.getPrecio()+"', '"+ Pizza.getDescripcion()+"','"+ 
                Pizza.getCodigo()+"')");
        conex.Desconectar();
        return ComandoEjecutado;
     }
    
    public int Modificar(PizzaBL Pizza){
        int ComandoEjecutado = conex.EjecutarComandoSQL("UPDATE tblPizzas set nombre = '"+ Pizza.getNombre()+"',foto = '"+ 
                Pizza.getFoto()+"',precio = '"+ Pizza.getPrecio()+"',descripcion = '"+ Pizza.getDescripcion()+"',codigo = '"+ Pizza.getCodigo()+
                "' WHERE ID = '"+ Pizza.getId()+"'");
        conex.Desconectar();
        return ComandoEjecutado;
    }
    
     public int Eliminar(PizzaBL Pizza){
        int ComandoEjecutado = conex.EjecutarComandoSQL("DELETE FROM tblPizzas WHERE ID = '"+ Pizza.getId()+"'");
        conex.Desconectar();
        return ComandoEjecutado;
    }
    public DefaultTableModel Mostrar(){
        DefaultTableModel dtm = new DefaultTableModel(
                new Object [][]{},
                new String []{
                    "id","nombre","foto","precio","descripcion","codigo"
                }
        ){ @Override
        public boolean isCellEditable(int row, int column){
            return false;
        }};
        try{
            ConexionDAL objConexion = new ConexionDAL();
            ResultSet resultado = objConexion.EjecutarSentenciaSQL("SELECT id,nombre,foto,precio,descripcion,codigo FROM tblPizzas");
            while(resultado.next()){
                Object[] Fila ={
                    resultado.getString(1),
                    resultado.getString(2),
                    resultado.getString(3),
                    resultado.getString(4),
                    resultado.getString(5),    
                    resultado.getString(6), 
                };
            dtm.addRow(Fila);
            }
            return dtm;
        }catch(SQLException e){
            return null;
        }
    
    
    
    
}}
