package PizzeriaBL;

/**
 *
 * @author omar
 */
public class PizzaBL {
    
    public String Id;
    public String Nombre;
    public String Foto;
    public String Precio;
    public String Descripcion;
    public String Codigo;
    
   public String getId() {
        return Id;
    }
    public void setID(String Id){
    this.Id=Id;}
    
    public String getNombre(){
    return Nombre;}
    
    public void setNombre(String Nombre){
    this.Nombre= Nombre;}
    
    public String getFoto() {
        return Foto;}

    public void setFoto(String Foto) {
        this.Foto = Foto;}
    
    public String getPrecio(){
    return Precio;}
    
    public void setPrecio(String Precio){
    this.Precio= Precio;}
    
    
    public String getDescripcion(){
    return Descripcion;}
    
    public void  setDescripcion(String Descripcion){
    this.Descripcion=Descripcion;}
    
    public String getCodigo(){
    return Codigo;}
    
    public void setCodigo(String Codigo){
    this.Codigo=Codigo;}
    
}
