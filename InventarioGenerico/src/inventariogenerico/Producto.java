package inventariogenerico;
import java.util.Calendar;
/**
 *
 * @author Daniela
 */
public class Producto 
{
    String nombre, id;
    double coste;
    int cantidad;
    Calendar calI, calF;
    

    public Producto(String nombre, String id, double coste, int cantidad, Calendar calI, Calendar calF) {
        this.id = id;
        this.nombre = nombre;
        this.coste = coste;
        this.cantidad = cantidad;
        this.calI = calI;
        this.calF = calF;
    }


    public String getNombre() {
        return nombre;
    }

    public String getId(){
        return id;
    }
    
    public double getCoste() {
        return coste;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    public Calendar getCalI(){
        return calI;
    }
    
    public Calendar getCalF(){
        return calF;
    }
    
    public String show()
    {
        return "\nNombre: "+this.nombre+" Id: "+this.id+" Coste: "+this.coste+" Cantidad: "
            +this.cantidad+" Fecha de ingreso: "+this.calI+" Fecha de caducidad: "+this.calF;
    }
    
    
    public void agregar(int cantidad_a_agregar)
    {
        this.cantidad = this.cantidad + cantidad_a_agregar;
    }
    
    public void quitar(int cantidad_a_agregar)
    {
        this.cantidad = this.cantidad - cantidad_a_agregar;
    }
    
}
