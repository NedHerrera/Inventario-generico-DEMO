/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventariogenerico;

import java.util.Calendar;

/**
 *
 * @author tesco
 */
public class InventarioGenerico
{

    static public BaseDeDatos BD = new BaseDeDatos();
    
    public static void main(String[] args) 
    {
        Calendar calI= Calendar.getInstance(), calF= Calendar.getInstance();
        BD.newGerente("admin", "admin@admin.com", "1234");
        BD.newEmpleado("empleado", "empleado@empleado.com", "1234");
        BD.login("admin@admin.com", "1234");
        BD.whoami();
        calI.set(1+2020,5,6);
        calF.set(1+2020,5,6);
        BD.newProducto("galleta1","id1", 5.2, 5, calI, calF);
        BD.newProducto("galleta2","id2", 5.2, 5, calI, calF);
        //BD.showProductos();
        //BD.quitarProducto("1", 11);
        //System.out.println("Lista:" + BD.showProductos());

        
        //LoginWindow lw = new LoginWindow();
        //lw.setVisible(true);
        
        Inventario inv = new Inventario();
        inv.setVisible(true);
        
        //System.out.println("adios");
        
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
