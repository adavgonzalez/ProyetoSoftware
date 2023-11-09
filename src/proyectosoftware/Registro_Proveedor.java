/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectosoftware;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Registro_Proveedor extends javax.swing.JFrame {

    Conexion cc = new Conexion();
    Connection con = cc.establecerConexion();
    public Registro_Proveedor() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Telefono_proveedor = new javax.swing.JTextField();
        Nombre_proveedor = new javax.swing.JTextField();
        Correo_proveedor = new javax.swing.JTextField();
        Direccion_proveedor = new javax.swing.JTextField();
        Servicio_proveedor = new javax.swing.JTextField();
        Contraseña_proveedor = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Telefono_proveedor.setBackground(new java.awt.Color(234, 241, 246));
        Telefono_proveedor.setBorder(null);
        Telefono_proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Telefono_proveedorActionPerformed(evt);
            }
        });
        getContentPane().add(Telefono_proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 190, 20));

        Nombre_proveedor.setBackground(new java.awt.Color(234, 241, 246));
        Nombre_proveedor.setBorder(null);
        Nombre_proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nombre_proveedorActionPerformed(evt);
            }
        });
        getContentPane().add(Nombre_proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 190, 20));

        Correo_proveedor.setBackground(new java.awt.Color(234, 241, 246));
        Correo_proveedor.setBorder(null);
        Correo_proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Correo_proveedorActionPerformed(evt);
            }
        });
        getContentPane().add(Correo_proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 190, -1));

        Direccion_proveedor.setBackground(new java.awt.Color(234, 241, 246));
        Direccion_proveedor.setBorder(null);
        Direccion_proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Direccion_proveedorActionPerformed(evt);
            }
        });
        getContentPane().add(Direccion_proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 190, 20));

        Servicio_proveedor.setBackground(new java.awt.Color(234, 241, 246));
        Servicio_proveedor.setBorder(null);
        Servicio_proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Servicio_proveedorActionPerformed(evt);
            }
        });
        getContentPane().add(Servicio_proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 190, 20));

        Contraseña_proveedor.setBackground(new java.awt.Color(234, 241, 246));
        Contraseña_proveedor.setBorder(null);
        getContentPane().add(Contraseña_proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 200, 20));

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 120, 30));

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 70, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Pictures\\Imagenes Mano_amiga\\Registro_Proveedores.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    public void agregarUsuario(){
        
        String pass = String.valueOf(Contraseña_proveedor.getPassword());
        long tel_proveedor = Long.parseLong(Telefono_proveedor.getText());
        String consulta = "insert into proveedor(nombre,telefono,correo,contraseña,direccion,nombre_servicio) values (?,?,?,?,?,?);";
        
        try {
            PreparedStatement pst = con.prepareStatement(consulta);
            pst.setString(1,Nombre_proveedor.getText());
            pst.setLong(2,tel_proveedor);
            pst.setString(3,Correo_proveedor.getText());
            pst.setString(4,pass);
            pst.setString(5,Direccion_proveedor.getText());
            pst.setString(6,Servicio_proveedor.getText());
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Proveedor registrado con exito");
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error de registro"+e.getMessage());
        }

    }
    private void Telefono_proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Telefono_proveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Telefono_proveedorActionPerformed

    private void Nombre_proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nombre_proveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nombre_proveedorActionPerformed

    private void Correo_proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Correo_proveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Correo_proveedorActionPerformed

    private void Direccion_proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Direccion_proveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Direccion_proveedorActionPerformed

    private void Servicio_proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Servicio_proveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Servicio_proveedorActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        agregarUsuario();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        Iniciar_Sesion a = new Iniciar_Sesion();
        a.setVisible(true);
        a.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(Registro_Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro_Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro_Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro_Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro_Proveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Contraseña_proveedor;
    private javax.swing.JTextField Correo_proveedor;
    private javax.swing.JTextField Direccion_proveedor;
    private javax.swing.JTextField Nombre_proveedor;
    private javax.swing.JTextField Servicio_proveedor;
    private javax.swing.JTextField Telefono_proveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
