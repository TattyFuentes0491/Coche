/*
2. Crear una clase Coche, a través de la cual se pueda conocer el color del coche, la marca, el modelo, 
el número de caballos, el número de puertas y la matricula. Crear el constructor del coche, así como los métodos 
que considere necesarios. Crear una clase (JFrame Form) Prueba_Coche que instancie varios coches, 
cambiándole el color a lo largo de la vida a algunos de ellos y mostrándolo por pantalla (utilizando JTable, 
utilice con JPoPMenu las opciones de modificar y eliminar, además utilice archivo de texto en Java 
para almacenar y cargar la información).
 */
package Coche;
import java.awt.geom.Area;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
//import Coche.CCoche;

public class Prueba_CCoche extends javax.swing.JFrame {
    //instanciamos la clase coche
    CCoche coche = new CCoche();  
    
    public Prueba_CCoche() {
        initComponents();
        jBtnActualizar.setVisible(false);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        Modificar = new javax.swing.JMenuItem();
        Eliminar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTxtFldColor = new javax.swing.JTextField();
        jTxtFldMarca = new javax.swing.JTextField();
        jTxtFldModelo = new javax.swing.JTextField();
        jTxtFldNoCaballos = new javax.swing.JTextField();
        jTxtFldNoPuertas = new javax.swing.JTextField();
        jTxtFldMatricula = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCoche = new javax.swing.JTable();
        jBtnGuardar = new javax.swing.JButton();
        jButtonExportardatos = new javax.swing.JButton();
        jBtnActualizar = new javax.swing.JButton();

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Modificar);

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Eliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Color");

        jLabel2.setText("Marca");

        jLabel3.setText("Modelo");

        jLabel4.setText("No. Caballos");

        jLabel5.setText("No. Puertas");

        jLabel6.setText("Matricula");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Registrar Coche");

        jTxtFldMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtFldMatriculaActionPerformed(evt);
            }
        });

        jTableCoche.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Color", "Marca", "Modelo", "No. Caballos", "No. Puertas", "Matricula"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableCoche.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(jTableCoche);
        if (jTableCoche.getColumnModel().getColumnCount() > 0) {
            jTableCoche.getColumnModel().getColumn(0).setMinWidth(50);
            jTableCoche.getColumnModel().getColumn(0).setMaxWidth(50);
            jTableCoche.getColumnModel().getColumn(1).setMinWidth(50);
            jTableCoche.getColumnModel().getColumn(1).setMaxWidth(50);
            jTableCoche.getColumnModel().getColumn(2).setMinWidth(70);
            jTableCoche.getColumnModel().getColumn(2).setMaxWidth(70);
            jTableCoche.getColumnModel().getColumn(3).setMaxWidth(70);
            jTableCoche.getColumnModel().getColumn(4).setMaxWidth(70);
            jTableCoche.getColumnModel().getColumn(5).setMinWidth(80);
            jTableCoche.getColumnModel().getColumn(5).setMaxWidth(80);
        }

        jBtnGuardar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jBtnGuardar.setText("Guardar Datos");
        jBtnGuardar.setBorder(null);
        jBtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuardarActionPerformed(evt);
            }
        });

        jButtonExportardatos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonExportardatos.setText("Exportar Registros");
        jButtonExportardatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExportardatosActionPerformed(evt);
            }
        });

        jBtnActualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtnActualizar.setText("Actualizar");
        jBtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel7))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTxtFldColor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtFldNoCaballos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTxtFldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtFldNoPuertas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonExportardatos)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jTxtFldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jTxtFldMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBtnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel7)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTxtFldColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTxtFldNoCaballos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTxtFldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTxtFldNoPuertas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTxtFldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTxtFldMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnGuardar)
                    .addComponent(jBtnActualizar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonExportardatos))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtFldMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtFldMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtFldMatriculaActionPerformed

    private void jBtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGuardarActionPerformed
        // añadimos registro a la tabla  
        String c,ma,mo,mat;
        int cab,ptas;
        c=jTxtFldColor.getText();
        ma=jTxtFldMarca.getText();
        mo=jTxtFldModelo.getText();
        cab=Integer.parseInt(jTxtFldNoCaballos.getText());
        ptas=Integer.parseInt(jTxtFldNoPuertas.getText());
        mat=jTxtFldMatricula.getText();
        coche.llenarTablaCoche(c, ma, mo, cab, ptas, mat, jTableCoche);
        limpiarCajaTexto();
    }//GEN-LAST:event_jBtnGuardarActionPerformed
    
    private void limpiarCajaTexto(){
        //limpiamos las cajas de texto
        jTxtFldColor.setText(null);
        jTxtFldMarca.setText(null);
        jTxtFldModelo.setText(null);
        jTxtFldNoCaballos.setText(null);
        jTxtFldNoPuertas.setText(null);
        jTxtFldMatricula.setText(null);
    }
    
    private void jButtonExportardatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExportardatosActionPerformed
        //exportar datos a un archivo de texto
        coche.crearArchivo(jTableCoche);
    }//GEN-LAST:event_jButtonExportardatosActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        //instanciamos la tabla
        DefaultTableModel tb = (DefaultTableModel) jTableCoche.getModel();
        if (jTableCoche.getSelectedRow()>=0){ // nos paramos ne la fila seleccionada
            //reasignamos en las cajas de texto los valores de la tabla
            jTxtFldColor.setText(jTableCoche.getValueAt(jTableCoche.getSelectedRow(), 0).toString());
            jTxtFldMarca.setText(jTableCoche.getValueAt(jTableCoche.getSelectedRow(), 1).toString());
            jTxtFldModelo.setText(jTableCoche.getValueAt(jTableCoche.getSelectedRow(), 2).toString());
            jTxtFldNoCaballos.setText(jTableCoche.getValueAt(jTableCoche.getSelectedRow(), 3).toString());
            jTxtFldNoPuertas.setText(jTableCoche.getValueAt(jTableCoche.getSelectedRow(), 4).toString());
            jTxtFldMatricula.setText(jTableCoche.getValueAt(jTableCoche.getSelectedRow(), 5).toString());
        } 
        jBtnActualizar.setVisible(true);
    }//GEN-LAST:event_ModificarActionPerformed
    
    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        // eliminar un registro
        coche.eliminaRegistro(jTableCoche);
    }//GEN-LAST:event_EliminarActionPerformed

    private void jBtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnActualizarActionPerformed
        //creamos atributos
        String co, ma, mo, mat;
        int ca, pt;
        co=jTxtFldColor.getText();
        ma=jTxtFldMarca.getText();
        mo=jTxtFldModelo.getText();
        ca=Integer.parseInt(jTxtFldNoCaballos.getText());
        pt=Integer.parseInt(jTxtFldNoPuertas.getText());
        mat=jTxtFldMatricula.getText();
        //guaradr datos modificados
        int filaSelec=0;
        //filaSelec=;
        coche.guardarDatosModificados(jTableCoche, filaSelec,co,ma,mo,ca,pt,mat);
        limpiarCajaTexto();
    }//GEN-LAST:event_jBtnActualizarActionPerformed

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
            java.util.logging.Logger.getLogger(Prueba_CCoche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prueba_CCoche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prueba_CCoche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prueba_CCoche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prueba_CCoche().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Eliminar;
    private javax.swing.JMenuItem Modificar;
    private javax.swing.JButton jBtnActualizar;
    private javax.swing.JButton jBtnGuardar;
    private javax.swing.JButton jButtonExportardatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCoche;
    private javax.swing.JTextField jTxtFldColor;
    private javax.swing.JTextField jTxtFldMarca;
    private javax.swing.JTextField jTxtFldMatricula;
    private javax.swing.JTextField jTxtFldModelo;
    private javax.swing.JTextField jTxtFldNoCaballos;
    private javax.swing.JTextField jTxtFldNoPuertas;
    // End of variables declaration//GEN-END:variables

  
}
