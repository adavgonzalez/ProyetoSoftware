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
public class Registro_Cliente extends javax.swing.JFrame {

    Conexion cc = new Conexion();
    Connection con = cc.establecerConexion();
    public Registro_Cliente() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        telefono = new javax.swing.JTextField();
        correo_usuario = new javax.swing.JTextField();
        apellido_usuario = new javax.swing.JTextField();
        nombre_usuario = new javax.swing.JTextField();
        contraseña_cliente = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        telefono.setBackground(new java.awt.Color(234, 241, 246));
        telefono.setBorder(null);
        telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoActionPerformed(evt);
            }
        });
        getContentPane().add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 190, 20));

        correo_usuario.setBackground(new java.awt.Color(234, 241, 246));
        correo_usuario.setBorder(null);
        correo_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correo_usuarioActionPerformed(evt);
            }
        });
        getContentPane().add(correo_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 190, 20));

        apellido_usuario.setBackground(new java.awt.Color(234, 241, 246));
        apellido_usuario.setBorder(null);
        apellido_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellido_usuarioActionPerformed(evt);
            }
        });
        getContentPane().add(apellido_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 286, 190, -1));

        nombre_usuario.setBackground(new java.awt.Color(234, 241, 246));
        nombre_usuario.setBorder(null);
        nombre_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_usuarioActionPerformed(evt);
            }
        });
        getContentPane().add(nombre_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 246, 190, -1));

        contraseña_cliente.setBackground(new java.awt.Color(234, 241, 246));
        contraseña_cliente.setBorder(null);
        contraseña_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseña_clienteActionPerformed(evt);
            }
        });
        getContentPane().add(contraseña_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 190, 20));

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, 100, 20));

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 80, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Pictures\\Imagenes Mano_amiga\\Registro_cliente.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void agregarUsuario(){
        
        String pass = String.valueOf(contraseña_cliente.getPassword());
        long tel_cliente = Long.parseLong(telefono.getText());
        String consulta = "insert into cliente(telefono,nombre,apellido,correo,contraseña) values (?,?,?,?,?);";
        
        try {
            PreparedStatement pst = con.prepareStatement(consulta);
            pst.setLong(1,tel_cliente);
            pst.setString(2,nombre_usuario.getText());
            pst.setString(3,correo_usuario.getText());
            pst.setString(4,apellido_usuario.getText());
            pst.setString(5,pass);
            
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Cliente registrado con exito");
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error de registro"+e.getMessage());
        }

    }
    private void correo_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correo_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correo_usuarioActionPerformed

    private void telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoActionPerformed

    private void apellido_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellido_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellido_usuarioActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        agregarUsuario();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void nombre_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_usuarioActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        Iniciar_Sesion a = new Iniciar_Sesion();
        a.setVisible(true);
        a.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void contraseña_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseña_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraseña_clienteActionPerformed

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
            java.util.logging.Logger.getLogger(Registro_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro_Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellido_usuario;
    private javax.swing.JPasswordField contraseña_cliente;
    private javax.swing.JTextField correo_usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField nombre_usuario;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
