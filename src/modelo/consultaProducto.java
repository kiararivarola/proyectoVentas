
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
public class consultaProducto {
    Connection con;
    conexion cn = new conexion();
    PreparedStatement ps;
    ResultSet rs;

    public List ListarMed(String valor) {
        List<producto> lista = new ArrayList();
        try {
            con = cn.getConexion();
            if ("".equalsIgnoreCase(valor)) {
                String sql = "SELECT * FROM producto ORDER BY estado_producto ASC";
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
            } else {
                String sql = "SELECT * FROM producto WHERE nombre_producto LIKE '%" 
                        + valor + "%' OR estado_producto LIKE '%" + valor + "%'";
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
            }
            while (rs.next()) {
                producto prod = new producto();
                prod.setId(rs.getInt("id"));
                prod.setNombre_producto(rs.getString("nombre_producto"));
                prod.setEstado_producto(rs.getString("estado_producto"));
                lista.add(prod);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return lista;
    }

    public boolean registrar(producto prod) {
        String sql = "INSERT INTO producto (nombre_producto) VALUES (?,?)";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, prod.getNombre_producto());
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }

    public boolean modificar(producto prod) {
        con = cn.getConexion();
        String sql = "UPDATE producto SET nombre_producto = ?, WHERE id = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, prod.getNombre_producto());
            ps.setInt(2, prod.getId());
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }

    public boolean accion(String estado, int id) {

        String sql = "UPDATE producto SET estado_producto = ? WHERE id = ?";
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
