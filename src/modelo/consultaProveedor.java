
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class consultaProveedor {
    Connection con;
    conexion cn = new conexion();
    PreparedStatement ps;
    ResultSet rs;

    public List ListarProveedor(String valor) {
        List<proveedor> listaProveedor = new ArrayList();
        try {
            con = cn.getConexion();
            if ("".equalsIgnoreCase(valor)) {
                String sql = "SELECT * FROM proveedor ORDER BY estado_proveedor ASC";
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
            } else {
                String sql = "SELECT * FROM proveedor WHERE ruc_proveedor LIKE '%" 
                        + valor + "%' OR nombre_proveedor LIKE '%" + valor + "%'";
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
            }
            while (rs.next()) {
                proveedor pr = new proveedor();
                pr.setId(rs.getInt("id"));
                pr.setRuc_proveedor(rs.getString("ruc_proveedor"));
                pr.setNombre_proveedor(rs.getString("nombre_proveedor"));
                pr.setTelefono_proveedor(rs.getString("telefono_proveedor"));
                pr.setDireccion_proveedor(rs.getString("direccion_proveedor"));
                pr.setEstado_proveedor(rs.getString("estado_proveedor"));
                listaProveedor.add(pr);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return listaProveedor;
    }

    public boolean registrar(proveedor pr) {
        String sql = "INSERT INTO proveedor (ruc_proveedor, nombre_proveedor, telefono_proveedor, direccion_proveedor) VALUES (?,?,?,?)";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, pr.getRuc_proveedor());
            ps.setString(2, pr.getNombre_proveedor());
            ps.setString(3, pr.getTelefono_proveedor());
            ps.setString(4, pr.getDireccion_proveedor());
            ps.execute();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }

    public boolean modificar(proveedor pr) {

        String sql = "UPDATE proveedor SET ruc_proveedor = ?, nombre_proveedor = ?, telefono_proveedor = ?, direccion_proveedor = ? WHERE id = ?";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, pr.getRuc_proveedor());
            ps.setString(2, pr.getNombre_proveedor());
            ps.setString(3, pr.getTelefono_proveedor());
            ps.setString(4, pr.getDireccion_proveedor());
            ps.setInt(5, pr.getId());
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }

    public boolean accion(String estado, int id) {
        String sql = "UPDATE proveedor SET estado_proveedor = ? WHERE id = ?";
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
