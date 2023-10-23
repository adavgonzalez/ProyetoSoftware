package proyectosoftware;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class Atributos {
    
    String nombre_Cliente,apellido_Cliente,nombre_Proveedor,apellido_Proveedor,
            correo_Cliente,correo_Proveedor,contraseña_Cliente,contraseña_Proveedor,
            direccion_Proveedor,nombre_Servicio, telefono_Cliente,telefono_Proveedor;

    public String getTelefono_Cliente() {
        return telefono_Cliente;
    }

    public void setTelefono_Cliente(String telefono_Cliente) {
        this.telefono_Cliente = telefono_Cliente;
    }

    public String getTelefono_Proveedor() {
        return telefono_Proveedor;
    }

    public void setTelefono_Proveedor(String telefono_Proveedor) {
        this.telefono_Proveedor = telefono_Proveedor;
    }

    public String getNombre_Cliente() {
        return nombre_Cliente;
    }

    public void setNombre_Cliente(String nombre_Cliente) {
        this.nombre_Cliente = nombre_Cliente;
    }

    public String getApellido_Cliente() {
        return apellido_Cliente;
    }

    public void setApellido_Cliente(String apellido_Cliente) {
        this.apellido_Cliente = apellido_Cliente;
    }

    public String getNombre_Proveedor() {
        return nombre_Proveedor;
    }

    public void setNombre_Proveedor(String nombre_Proveedor) {
        this.nombre_Proveedor = nombre_Proveedor;
    }

    public String getApellido_Proveedor() {
        return apellido_Proveedor;
    }

    public void setApellido_Proveedor(String apellido_Proveedor) {
        this.apellido_Proveedor = apellido_Proveedor;
    }

    public String getCorreo_Cliente() {
        return correo_Cliente;
    }

    public void setCorreo_Cliente(String correo_Cliente) {
        this.correo_Cliente = correo_Cliente;
    }

    public String getCorreo_Proveedor() {
        return correo_Proveedor;
    }

    public void setCorreo_Proveedor(String correo_Proveedor) {
        this.correo_Proveedor = correo_Proveedor;
    }

    public String getContraseña_Cliente() {
        return contraseña_Cliente;
    }

    public void setContraseña_Cliente(String contraseña_Cliente) {
        this.contraseña_Cliente = contraseña_Cliente;
    }

    public String getContraseña_Proveedor() {
        return contraseña_Proveedor;
    }

    public void setContraseña_Proveedor(String contraseña_Proveedor) {
        this.contraseña_Proveedor = contraseña_Proveedor;
    }

    public String getDireccion_Proveedor() {
        return direccion_Proveedor;
    }

    public void setDireccion_Proveedor(String direccion_Proveedor) {
        this.direccion_Proveedor = direccion_Proveedor;
    }

    public String getNombre_Servicio() {
        return nombre_Servicio;
    }

    public void setNombre_Servicio(String nombre_Servicio) {
        this.nombre_Servicio = nombre_Servicio;
    }
    
    public void MostrarServicios(JTable paramTablaServicios){
        
        Conexion ObjetoConexion = new Conexion();
        
        DefaultTableModel modelo = new DefaultTableModel();
        String sql = "";
        
        modelo.addColumn("Servicio");
        modelo.addColumn("Proveedor");
        modelo.addColumn("Telefono");

        paramTablaServicios.setModel(modelo);
        
        sql = "select nombre_servicio,nombre,telefono from proveedor;";
        
        String [] datos = new String[3];
        Statement st;
        
        try {
            
            st = ObjetoConexion.establecerConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                
                
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                
                
                modelo.addRow(datos);
            }
            paramTablaServicios.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error"+e.toString());
        }
    }
        
        public void insertarCliente(JTextField paramNombreCliente, JTextField paramApellidoCliente
        ,JTextField paramCorreoCliente, JTextField paramContraseñaCliente, JTextField paramTelefonoCliente){
            
            setNombre_Cliente(paramNombreCliente.getText());
            setApellido_Cliente(paramApellidoCliente.getText());
            setCorreo_Cliente(paramCorreoCliente.getText());
            setContraseña_Cliente(paramContraseñaCliente.getText());
            setTelefono_Cliente(paramTelefonoCliente.getText());
            
            Conexion objetoConexion = new Conexion();
            
            String consulta = "insert into cliente(nombre, apellido, correo, contraseña, telefono) values (?,?,?,?,?);";
            
            try {
                
                CallableStatement cs1 = objetoConexion.establecerConexion().prepareCall(consulta);
                cs1.setString(1, getNombre_Cliente());
                cs1.setString(2, getApellido_Cliente());
                cs1.setString(3, getCorreo_Cliente());
                cs1.setString(4, getContraseña_Cliente());
                cs1.setString(5, getTelefono_Cliente());
                
                cs1.execute();
                
                JOptionPane.showMessageDialog(null, "Usuario Creado con exito");
                     
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al crear el usuario\n"
                        + "verifique si el correo o el telefono\n ya se encuentran en uso");
            }
            

            
        }
        
        public void insertarProveedor(JTextField paramNombreProveedor, JTextField paramDireccionProveedor,JTextField paramServicio
        ,JTextField paramCorreoProveedor, JTextField paramContraseñaProveedor, JTextField paramTelefonoProveedor){
            
            setNombre_Proveedor(paramNombreProveedor.getText());
            setDireccion_Proveedor(paramDireccionProveedor.getText());
            setNombre_Servicio(paramServicio.getText());
            setCorreo_Proveedor(paramCorreoProveedor.getText());
            setContraseña_Proveedor(paramContraseñaProveedor.getText());
            setTelefono_Proveedor(paramTelefonoProveedor.getText());
            
            Conexion objetoConexion = new Conexion();
            
            String consulta2 = "insert into proveedor(nombre,direccion,nombre_servicio,correo,contraseña,telefono) values (?,?,?,?,?,?);";
            
            try {
                
                CallableStatement cs2 = objetoConexion.establecerConexion().prepareCall(consulta2);
                cs2.setString(1, getNombre_Proveedor());
                cs2.setString(2, getDireccion_Proveedor());
                cs2.setString(3, getNombre_Servicio());
                cs2.setString(4, getCorreo_Proveedor());
                cs2.setString(5, getContraseña_Proveedor());
                cs2.setString(6, getTelefono_Proveedor());
                
                
                cs2.execute();
                
                JOptionPane.showMessageDialog(null, "Usuario Creado con exito");
                     
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al crear el usuario\n"
                        + "verifique si el correo o el telefono\n ya se encuentran en uso");
            }
            

            
        }
        
    
}
