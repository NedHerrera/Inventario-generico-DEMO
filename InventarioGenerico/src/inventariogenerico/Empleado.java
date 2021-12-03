package inventariogenerico;

/**
 *
 * @author Daniela
 */
public class Empleado extends usuario{
    
    public Empleado(String nombre, String email, String password) {
        super(nombre, email, password);
    }
    
    @Override
    public String getTipo(){
        return "Empleado";
    }
    
    @Override
    public void show()
    {
        System.out.println("Usuario: Empleado");
        System.out.println("Nombre: " + nombre);
        System.out.println("Email: " + email);
    }
    
    @Override
    public String validarSesion(String email_, String password_)
    {
        if ((email_.equals(email)) && (password_.equals(password))) {
            return "Exitoso";
        } else {
            return "Fallido";
        }
    }
    
}
