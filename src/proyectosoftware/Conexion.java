package proyectosoftware;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    
    Connection conectar = null;
    
    String usuario = "postgres";
    String contraseña = "Politecnico123*";
    String bd = "Mano_Amiga";
    String ip = "localhost";
    String puerto = "5432";
    
    String cadena = "jdbc:postgresql://"+ip+":"+puerto+"/"+bd;
    
    public Connection establecerConexion(){
        
        try {
            Class.forName("org.postgresql.Driver");
            
            conectar = DriverManager.getConnection(cadena, usuario,contraseña);
            
            
            
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "No");
        }
        
        return conectar;
        
    }
    
}
