
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class consultaCliente {
    conexion cn = new conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean registrar(cliente cl) {
        String sql = "INSERT INTO cliente (nombre_cliente, telefono_cliente, direccion_cliente) VALUES (?,?,?)";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, cl.getNombre_cliente());
            ps.setString(2, cl.getTelefono_cliente());
            ps.setString(3, cl.getDireccion_cliente());
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    
    public List ListaClientes() {
        List<cliente> listaCli = new ArrayList();
        String sql = "SELECT * FROM cliente ORDER BY estado_cliente ASC";
        //String buscar = "SELECT * FROM cliente WHERE nombre_cliente LIKE '%"
                //+valor+"%' OR telefono_cliente LIKE '%"+valor+"%'";
        try {
            con = cn.getConexion();
           // if (valor.equalsIgnoreCase("")) {
               ps = con.prepareStatement(sql);
               rs = ps.executeQuery(); 
           // }else{
              // ps = con.prepareStatement(buscar);
               //rs = ps.executeQuery(); 
            //}
            while (rs.next()) {
                cliente cl = new cliente();
                cl.setId(rs.getInt("id"));
                cl.setNombre_cliente(rs.getString("nombre_cliente"));
                cl.setTelefono_cliente(rs.getString("telefono_cliente"));
                cl.setDireccion_cliente(rs.getString("direccion_cliente"));
                cl.setEstado_cliente(rs.getString("estado_cliente"));
                listaCli.add(cl);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return listaCli;
    }

    public boolean modificar(cliente cl) {
        String sql = "UPDATE cliente SET nombre_cliente = ?, telefono_cliente = ?, direccion_cliente = ? WHERE id_cliente = ?";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, cl.getNombre_cliente());
            ps.setString(2, cl.getTelefono_cliente());
            ps.setString(3, cl.getDireccion_cliente());
            ps.setInt(4, cl.getId());
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }

    public boolean accion(String estado, int id) {
        String sql = "UPDATE cliente SET estado_cliente = ? WHERE id_cliente = ?";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, estado);
            ps.setInt(2, id);
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
}
