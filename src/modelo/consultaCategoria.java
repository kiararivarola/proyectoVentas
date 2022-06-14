
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class consultaCategoria {
    Connection con;
    conexion cn = new conexion();
    PreparedStatement ps;
    ResultSet rs;
 
     public List ListarCat(String valor) {
        List<categoria> lista = new ArrayList();
        try {
            con = cn.getConexion();
            if ("".equalsIgnoreCase(valor)) {
                String sql = "SELECT * FROM categoria ORDER BY estado ASC";
                ps = con.prepareStatement(sql);
            } else {
                String sql = "SELECT * FROM categoria WHERE nombre_categoria LIKE '%" 
                        + valor + "%' OR estado_categoria LIKE '%" + valor + "%'";
                ps = con.prepareStatement(sql);
            }
            rs = ps.executeQuery();
            while (rs.next()) {
               categoria cat = new categoria();
                cat.setId(rs.getInt("id"));
                cat.setNombre_categoria(rs.getString("nombre"));
                cat.setEstado_categoria(rs.getString("estado"));
                lista.add(cat);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return lista;
    }

    public boolean registrar(categoria cat) {
        String consulta = "SELECT * FROM categoria WHERE nombre_categoria = ?";
        String sql = "INSERT INTO categoria (nombre_categoria) VALUES (?)";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, cat.getNombre_categoria());
            ps.execute();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }

    public boolean modificar(categoria cat) {

        String sql = "UPDATE categoria SET nombre = ? WHERE id = ?";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, cat.getNombre_categoria());
            ps.setInt(2, cat.getId());
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }

    public boolean accion(String estado, int id) {
        String sql = "UPDATE categoria SET estado = ? WHERE id = ?";
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
