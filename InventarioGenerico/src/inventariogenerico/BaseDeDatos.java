package inventariogenerico;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniela
 */
public class BaseDeDatos 
{

    /**
     * usuarios (nombre, email, password)
     * productos (id, nombre, precio, cantidad)
     * factura (ventas, fecha)
     * venta (id, cantidad)
     */
    
    usuario usuarios[];
    int contador_usuarios = 0;
    usuario usuarioLogeado;
    
    static Producto[] productos=new Producto[500];
    static int contador_productos = 0;
    
    public BaseDeDatos() 
    {
        this.usuarios = new usuario[100];
        this.usuarioLogeado = new Gerente("root", "root", "root");
        
        this.productos = new Producto[100];
    }
    
    public void newGerente(String nombre, String email, String password)
    {
        if (this.usuarioLogeado.getTipo().equals("Gerente")) 
        {
            Gerente new_gerente = new Gerente(nombre, email, password);
            this.usuarios[contador_usuarios] = new_gerente;
            this.contador_usuarios++;
        }
        else
        {
            System.out.println("No tienes permiso para hacer esto");
        }
    }
    
    public void newEmpleado(String nombre, String email, String password)
    {
        
        if (this.usuarioLogeado.getTipo().equals("Gerente")) 
        {
            Empleado new_empleado = new Empleado(nombre, email, password);
            this.usuarios[contador_usuarios] = new_empleado;
            this.contador_usuarios++;
        }
        else
        {
            System.out.println("No tienes permiso para hacer esto");
        }
    }
    
    public void showUsuarios()
    {
        for (int i = 0; i < contador_usuarios; i++) {
            System.out.println("--------------");
            this.usuarios[i].show();
        }
    }
    
    public boolean login(String email_, String password_)
    {
        boolean indicador = false;
        for (int i = 0; i < contador_usuarios; i++) 
        {
            String validador = this.usuarios[i].validarSesion(email_, password_);
            if (validador.equals("Exitoso")) 
            {
                JOptionPane.showMessageDialog(null, "Usuario " + email_ + ", login exitoso");
                this.usuarioLogeado = this.usuarios[i];
                indicador = true;
            }
        }
        if (!indicador) {
            JOptionPane.showMessageDialog(null, "Usuario " + email_ + ", login fallido");
        }
        
        return indicador;
    }
    
    public void whoami()
    {
        System.out.println("Usuario logeado :::");
        this.usuarioLogeado.show();
    }
    
    
    public void newProducto(String nombre, String id, double coste, int cantidad, Calendar calI, Calendar calF)
    {
        boolean indicador = false;
        for (int i = 0; i < contador_productos; i++) 
        {
            if (this.productos[i].getNombre().equals(nombre)) {
                this.productos[i].agregar(cantidad);
                indicador = true;
                break;
            }
        }
        
        if (indicador) 
        {
        }
        else
        {
            Producto new_producto = new Producto(nombre, id, coste, cantidad, calI, calF);
            this.productos[contador_productos] = new_producto;
            this.contador_productos++;
        }
    }
    
    
    public String showProductos()
    {
        String recolector = "";
        for (int i = 0; i < contador_productos; i++) 
        {
            recolector = recolector + this.productos[i].show();
        }
        return recolector;
    }
    
    public boolean agregarProducto(String nombre, int cantidad_a_agregar)
    {
        boolean indicador = false;
        for (int i = 0; i < contador_productos; i++) 
        {
            if (this.productos[i].getNombre().equals(nombre)) {
                this.productos[i].agregar(cantidad_a_agregar);
                indicador = true;
            }
        }
        return indicador;
    }
    
    public boolean quitarProducto(String nombre, int cantidad_a_quitar)
    {
        boolean indicador = false;
        for (int i = 0; i < contador_productos; i++) 
        {
            if (this.productos[i].getNombre().equals(nombre)) 
            {
                if (this.productos[i].getCantidad() >= cantidad_a_quitar) {
                    this.productos[i].quitar(cantidad_a_quitar);
                    indicador = true;
                }
                else{
                    indicador = false;
                }
            }
        }
        return indicador;
    }
    
}
