package inventariogenerico;

/**
 *
 * @author Daniela
 */
public class Gerente extends usuario{
    
    public Gerente(String nombre, String email, String password) {
        super(nombre, email, password);
    }
    
    @Override
    public String getTipo(){
        return "Gerente";
    }
    
    @Override
    public void show()
    {
        System.out.println("Usuario: Gerente");
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
