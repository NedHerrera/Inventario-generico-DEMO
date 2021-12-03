package inventariogenerico;

/**
 *
 * @author Daniela
 */
public class usuario 
{
    String nombre;
    String email;
    String password;

    public usuario(String nombre, String email, String password) 
    {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    
    public String getTipo(){
        return "";
    }
    
    public void show()
    {

    }
    
    public String validarSesion(String email_, String password_)
    {
        return "";
    }
 
}
