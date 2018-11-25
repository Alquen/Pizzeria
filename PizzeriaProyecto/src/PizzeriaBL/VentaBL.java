/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PizzeriaBL;

/**
 *
 * @author alque
 */
public class VentaBL {

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getFolio() {
        return Folio;
    }

    public void setFolio(String Folio) {
        this.Folio = Folio;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public int getId_pizza() {
        return Id_pizza;
    }

    public void setId_pizza(int Id_pizza) {
        this.Id_pizza = Id_pizza;
    }

    public int getId_comprador() {
        return Id_comprador;
    }

    public void setId_comprador(int Id_comprador) {
        this.Id_comprador = Id_comprador;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
    public int Id;
    public String Folio;
    public String Fecha;
    public int Id_pizza;
    public int Id_comprador;
    public int Cantidad;

    public int getTotal() {
        return Total;
    }

    public void setTotal(int Total) {
        this.Total = Total;
    }
    public int Total;
}
