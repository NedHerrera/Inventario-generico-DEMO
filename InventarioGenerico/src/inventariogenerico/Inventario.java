/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventariogenerico;
import java.util.Calendar;//Para crear un objeto calendar de la fecha de ingreso y salida
import javax.swing.JOptionPane;//Para dar mensajes de error
import java.util.InputMismatchException;//Para verificar errores
import inventariogenerico.BaseDeDatos;
import static inventariogenerico.BaseDeDatos.contador_productos;
import inventariogenerico.Producto;

/**
 * Clase interfaz de inventario
 * @author valer
 */
public class Inventario extends javax.swing.JFrame {
//variables o atributos globales
    
    String nombre="", id="";
    static String Pedro="";
    int cantidad=0, diaIngreso=0, diaFinal=0, mesIngreso=0, mesFinal=0, anioIngreso=0, anioFinal=0;
    double coste=0.0;
    Calendar calI= Calendar.getInstance(), calF= Calendar.getInstance();//Para la fecha de ingreso y caducidad del producto

    /**
     * Creates new form Caja
     */
    public Inventario() {
        initComponents();
        showProduct();
        this.setLocationRelativeTo(null);
    }
    
    
    /**
     * Este metodo sirve para desplegar un mensaje de error
     * @param texto 
     */
    public void mensaje(String texto){
        JOptionPane.showMessageDialog(null, texto);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cantidadField = new javax.swing.JTextField();
        productoField = new javax.swing.JTextField();
        Agregar = new javax.swing.JButton();
        Quitar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        diaI = new javax.swing.JComboBox<>();
        mesI = new javax.swing.JComboBox<>();
        anioI = new javax.swing.JComboBox<>();
        diaF = new javax.swing.JComboBox<>();
        mesF = new javax.swing.JComboBox<>();
        anioF = new javax.swing.JComboBox<>();
        CostoField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaTextArea = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        regresar = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        Lista = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 0, 48)); // NOI18N
        jLabel1.setText("Inventario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(654, 654, 654)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        cantidadField.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        cantidadField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadFieldActionPerformed(evt);
            }
        });

        productoField.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        productoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productoFieldActionPerformed(evt);
            }
        });

        Agregar.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        Quitar.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        Quitar.setText("Quitar");
        Quitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel2.setText("Cantidad:");

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel3.setText("Clave Producto:");

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel4.setText("Fecha Ingreso:");

        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel5.setText("Fecha Caducidad:");

        diaI.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        diaI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        mesI.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        mesI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        anioI.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        anioI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031" }));

        diaF.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        diaF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        mesF.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        mesF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        anioF.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        anioF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035" }));

        CostoField.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel6.setText("Precio:");

        idField.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel7.setText("Id:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cantidadField, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(productoField, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(148, 148, 148))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(CostoField)
                        .addGap(39, 39, 39)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(diaF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mesF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(diaI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mesI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(anioI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anioF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addComponent(Agregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Quitar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(anioI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(mesI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(diaI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4))
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(cantidadField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idField)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(productoField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Quitar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addComponent(diaF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(mesF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(anioF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(CostoField))))
                .addContainerGap())
        );

        listaTextArea.setBackground(new java.awt.Color(204, 255, 255));
        listaTextArea.setColumns(20);
        listaTextArea.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        listaTextArea.setRows(5);
        jScrollPane1.setViewportView(listaTextArea);

        jPanel3.setBackground(new java.awt.Color(0, 153, 204));

        regresar.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        regresar.setText("Regresar");

        limpiar.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        Lista.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        Lista.setText("Lista");
        Lista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(regresar)
                .addGap(554, 554, 554)
                .addComponent(Lista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(limpiar)
                .addGap(86, 86, 86))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limpiar)
                    .addComponent(regresar)
                    .addComponent(Lista))
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cantidadFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadFieldActionPerformed

    private void productoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productoFieldActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        // TODO add your handling code here:
        boolean indicador = false;
        //Paso 1 tomar el texto de todos los componentes
        try
        {
            cantidad= Integer.parseInt(cantidadField.getText());
            coste= Double.parseDouble(CostoField.getText());
        }
        catch (Exception ex)
        {
            mensaje("Favor de ingresar solamente numeros\n" + ex.getMessage());
        }
        
        diaIngreso=diaI.getSelectedIndex();
        mesIngreso=mesI.getSelectedIndex();
        anioIngreso=anioI.getSelectedIndex();
        calI.set(anioIngreso+2020,mesIngreso,diaIngreso);//Definir la fecha de ingreso en un objeto de calendario
        diaFinal=diaF.getSelectedIndex();
        mesFinal=mesF.getSelectedIndex();
        anioFinal=anioF.getSelectedIndex();
        calF.set(anioFinal+2020,mesFinal,diaFinal);//Definir la fecha de final en un objeto de calendario
        nombre=productoField.getText();
        id=idField.getText();
        
        InventarioGenerico.BD.newProducto(nombre, id, coste, cantidad, calI, calF); 
        
        showProduct();
        
        /*for (int i = 0; i < contador_productos; i++) {
            if (BaseDeDatos.productos[i].getNombre().equals(nombre)) {
                BaseDeDatos.productos[i].agregar(cantidad);
                indicador = true;
            }
        }
        //return indicador;
        id=idField.getText();
        System.out.println("Los valores a enviar son: "+nombre+", "+cantidad+", "+coste+", "+calI+", "+calF);
        if(productoField.getText().isEmpty() || cantidadField.getText().isEmpty() || CostoField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Favor de rellenar todos los datos solicitados");
        }else{
            //Paso 2 Crear el objeto
           BaseDeDatos.productos[BaseDeDatos.contador_productos]=new Producto(nombre, id, coste, cantidad,calI,calF);
           BaseDeDatos.contador_productos++;
        }*/
    }//GEN-LAST:event_AgregarActionPerformed

    /*public boolean agregarProducto(String nombre, int cantidad_a_agregar)
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
    }*/
    
    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        // TODO add your handling code here:
        //Paso 1 limpiar componentes graficos
        diaI.setSelectedIndex(0);
        mesI.setSelectedIndex(0);
        anioI.setSelectedIndex(0);
        diaF.setSelectedIndex(0);
        mesF.setSelectedIndex(0);
        anioF.setSelectedIndex(0);
        productoField.setText("");
        cantidadField.setText("");
        CostoField.setText("");
        idField.setText("");
        //Paso 2 Reiniciar las variables
        diaIngreso=0;
        mesIngreso=0;
        anioIngreso=0;
        diaFinal=0;
        mesFinal=0;
        anioFinal=0;
        nombre="";
        cantidad=0;
        coste=0;  
        id="";
        listaTextArea.setText("");
    }//GEN-LAST:event_limpiarActionPerformed

    private void ListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaActionPerformed
        // TODO add your handling code here:
        //Paso 1 Obtener los datos
        //Ciclo para obtener todos los empleados
        for (int i = 0; i < contador_productos; i++) {
            Pedro=Pedro + BaseDeDatos.productos[i].show();
            //Paso 2 Asignar los datos a los componentes graficos
        }
        listaTextArea.setText(Pedro);
        Pedro="";
    }//GEN-LAST:event_ListaActionPerformed

    private void QuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitarActionPerformed
        // TODO add your handling code here:
        String nombre_del_producto = productoField.getText();
        int cantidad_ = Integer.parseInt(cantidadField.getText());
        InventarioGenerico.BD.quitarProducto(nombre_del_producto, cantidad_);
        showProduct();
    }//GEN-LAST:event_QuitarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventario().setVisible(true);
            }
        });
    }

    /*
     Podr??as usar la variable de imprimirDatos para realizar polimorfismo y sobrecarga
     y que abstract 
     */

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JTextField CostoField;
    private javax.swing.JButton Lista;
    private javax.swing.JButton Quitar;
    private javax.swing.JComboBox<String> anioF;
    private javax.swing.JComboBox<String> anioI;
    private javax.swing.JTextField cantidadField;
    private javax.swing.JComboBox<String> diaF;
    private javax.swing.JComboBox<String> diaI;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextArea listaTextArea;
    private javax.swing.JComboBox<String> mesF;
    private javax.swing.JComboBox<String> mesI;
    private javax.swing.JTextField productoField;
    private javax.swing.JButton regresar;
    // End of variables declaration//GEN-END:variables

    public void showProduct()
    {
        listaTextArea.setText("");
        listaTextArea.setText(InventarioGenerico.BD.showProductos());
    }

}
