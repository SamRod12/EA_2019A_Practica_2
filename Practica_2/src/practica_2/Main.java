/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_2;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import practica_2.Templates.Producto;
import practica_2.data.ArchivoProductos;

/**
 *
 * @author xam-lx
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    ArrayList<Producto> arrayProductos = new ArrayList<>();
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldProductoCrearNombre = new javax.swing.JTextField();
        jTextFieldProductoCrearPrecio = new javax.swing.JTextField();
        jTextFieldProductoCrearPeso = new javax.swing.JTextField();
        jTextFieldProductoCrearVolumen = new javax.swing.JTextField();
        jButtonCrearProductos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonLimpiarListaProductos = new javax.swing.JButton();
        jButtonGuardarProductos = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        jLabel2.setText("Precio");

        jLabel3.setText("Peso");

        jLabel4.setText("Volumen");

        jTextFieldProductoCrearNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldProductoCrearNombreActionPerformed(evt);
            }
        });

        jTextFieldProductoCrearPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldProductoCrearPrecioActionPerformed(evt);
            }
        });

        jTextFieldProductoCrearPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldProductoCrearPesoActionPerformed(evt);
            }
        });

        jTextFieldProductoCrearVolumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldProductoCrearVolumenActionPerformed(evt);
            }
        });

        jButtonCrearProductos.setText("CREAR");
        jButtonCrearProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearProductosActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Precio", "Peso", "Volumen"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButtonLimpiarListaProductos.setText("LIMPIAR LISTA");
        jButtonLimpiarListaProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarListaProductosActionPerformed(evt);
            }
        });

        jButtonGuardarProductos.setText("GUARDAR");
        jButtonGuardarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarProductosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldProductoCrearNombre)
                            .addComponent(jTextFieldProductoCrearPrecio)
                            .addComponent(jTextFieldProductoCrearPeso, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldProductoCrearVolumen, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonGuardarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGap(39, 39, 39)
                                .addComponent(jButtonCrearProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(49, 49, 49)
                                .addComponent(jButtonLimpiarListaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldProductoCrearNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCrearProductos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldProductoCrearPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLimpiarListaProductos))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldProductoCrearPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldProductoCrearVolumen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButtonGuardarProductos)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Crear", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 651, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 442, Short.MAX_VALUE)
        );

        jTabbedPane5.addTab("Modificar", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 651, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 442, Short.MAX_VALUE)
        );

        jTabbedPane5.addTab("Borrar", jPanel3);

        jTabbedPane1.addTab("Productos", jTabbedPane5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldProductoCrearNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldProductoCrearNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldProductoCrearNombreActionPerformed

    private void jTextFieldProductoCrearPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldProductoCrearPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldProductoCrearPrecioActionPerformed

    private void jTextFieldProductoCrearPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldProductoCrearPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldProductoCrearPesoActionPerformed

    private void jTextFieldProductoCrearVolumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldProductoCrearVolumenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldProductoCrearVolumenActionPerformed

    private void jButtonCrearProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearProductosActionPerformed
        arrayProductos.add(new Producto(
        jTextFieldProductoCrearNombre.getText(),
        Float.valueOf(jTextFieldProductoCrearPrecio.getText()),
        jTextFieldProductoCrearPeso.getText(),
        jTextFieldProductoCrearVolumen.getText()
        ));
        
        cleanTable();
        fillTable();
    }//GEN-LAST:event_jButtonCrearProductosActionPerformed

    private void jButtonLimpiarListaProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarListaProductosActionPerformed
        cleanTable();
        arrayProductos.clear();
    }//GEN-LAST:event_jButtonLimpiarListaProductosActionPerformed

    private void jButtonGuardarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarProductosActionPerformed
        ArchivoProductos archivoProductos = new ArchivoProductos();
        archivoProductos.guardarProductos(arrayProductos);
    }//GEN-LAST:event_jButtonGuardarProductosActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Main main = new Main();
                main.setLocationRelativeTo(null);
                main.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCrearProductos;
    private javax.swing.JButton jButtonGuardarProductos;
    private javax.swing.JButton jButtonLimpiarListaProductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldProductoCrearNombre;
    private javax.swing.JTextField jTextFieldProductoCrearPeso;
    private javax.swing.JTextField jTextFieldProductoCrearPrecio;
    private javax.swing.JTextField jTextFieldProductoCrearVolumen;
    // End of variables declaration//GEN-END:variables

    public void cleanTable () {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        for (int i = model.getRowCount() -1; i >= 0; i--) {
            model.removeRow(i);
        }
    }
    
    public void fillTable () {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object rowData[] = new Object[4];
        for (int i = 0; i < arrayProductos.size(); i++) {
            rowData[0] = arrayProductos.get(i).nombre;
            rowData[1] = arrayProductos.get(i).precio;
            rowData[2] = arrayProductos.get(i).peso;
            rowData[3] = arrayProductos.get(i).volumen;
            model.addRow(rowData);
        }
    }

}
