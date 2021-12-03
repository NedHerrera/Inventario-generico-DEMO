/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventariogenerico;

/**
 *
 * @author tesco
 */
public class InventarioGenerico
{

    static public BaseDeDatos BD = new BaseDeDatos();
    
    public static void main(String[] args) 
    {
        BD.newGerente("admin", "admin@admin.com", "1234");
        BD.newEmpleado("empleado", "empleado@empleado.com", "1234");
        BD.login("admin@admin.com", "1234");
        BD.whoami();
        //BD.newProducto("","Galletas", 5);
        //BD.showProductos();
        //BD.quitarProducto("1", 11);
        BD.showProductos();

        
        LoginWindow lw = new LoginWindow();
        lw.setVisible(true);
        
        System.out.println("adios");
        
    }
    //Otro metodo que tiene que ver con la ventana
    /*public abstact String imprimeDatos();
       
    
    

    return " Curp: "+this.curp+" Nombre: "+this.nombre+" Apellido paterno: "+this.apellidoPaterno+" Apellido materno: "
            +this.apellidoMaterno+" Preferencia Sexual: "+this.preferenciaSexual+" Sueldo: "+this.sueldo
            +" Sueldo mensual: "+this.sueldoMensual+" Dias laborados: "+this.diasLaborados+" Fecha de ingreso: "
            +this.fechaIngreso.get(this.fechaIngreso.DAY_OF_MONTH)+"/"+this.fechaIngreso.get(this.fechaIngreso.MONTH)+"/"+this.fechaIngreso.get(this.fechaIngreso.YEAR);
    }
}*/
}
