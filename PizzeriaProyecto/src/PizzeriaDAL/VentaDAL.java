/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PizzeriaDAL;
import PizzeriaBL.VentaBL;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author alque
 */
public class VentaDAL {
    
    ConexionDAL conex = new ConexionDAL();
    
    public int Cobrar(VentaBL ObjVenta){
        int Comando = conex.EjecutarComandoSQL("INSERT INTO tblTicket(folio, id_cliente, fecha, total )"+
                "VALUES ('"+ ObjVenta.getFolio()+"', '"+ ObjVenta.getId_comprador()+"','"+ ObjVenta.getFecha() +"', '"+ ObjVenta.getTotal()+"' )");
        conex.Desconectar();
        return Comando;
    }
    
    public int Pizza (VentaBL ObjVenta){
        int Comando = conex.EjecutarComandoSQL("INSERT INTO tblVenta(folio, id_pizza, cantidad )"+
                "VALUES ('"+ ObjVenta.getFolio()+"', '"+ ObjVenta.getId_pizza()+"','"+ ObjVenta.getCantidad() +"' )");
        conex.Desconectar();
        return Comando;
    }
    
    public String LastFolio(){
        try{
            String res = "";
                ResultSet result = conex.EjecutarSentenciaSQL("");
            while(result.next()){
                String[] Folio = {
                    result.getString(1)
                };
                res = Folio[1];
            }
           
             return res; 
        }catch(SQLException e){
            return null;
        }
    }
    
}
