
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class consultaUsuario {
    conexion cn = new conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public usuario login(String usuario, String contrasena_usuario) {
        String sql = "SELECT * FROM usuario WHERE usuario = ? AND contrasena_usuario = ?";
        usuario us = new usuario();
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, contrasena_usuario);
            rs = ps.executeQuery();
            if (rs.next()) {
                us.setId(rs.getInt("id_usuario"));
                us.setUsuario(rs.getString("usuario"));
                us.setNombre_usuario(rs.getString("nombre_usuario"));
                us.setCaja_usuario(rs.getString("caja_usuario"));
                us.setRol_usuario(rs.getString("rol_usuario"));
                us.setEstado_usuario(rs.getString("estado_usuario"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return us;
    }

    public boolean registrar(usuario us) {
        String sql = "INSERT INTO usuario (usuario, nombre_usuario, contrasena_usuario, caja_usuario, rol_usuario) VALUES (?,?,?,?,?)";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, us.getUsuario());
            ps.setString(2, us.getNombre_usuario());
            ps.setString(3, us.getContrasena_usuario());
            ps.setString(4, us.getCaja_usuario());
            ps.setString(5, us.getRol_usuario());
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }

    public List ListaUsuario(String valor) {
        List<usuario> listaUsers = new ArrayList();
        String sql = "SELECT * FROM usuario ORDER BY estado_usuario ASC";
        String buscar = "SELECT * FROM usuario WHERE usuario LIKE '%"+valor+"%' OR nombre_usuario LIKE '%"+valor+"%'";
        try {
            con = cn.getConexion();
            if (valor.equalsIgnoreCase("")) {
               ps = con.prepareStatement(sql);
               rs = ps.executeQuery(); 
            }else{
               ps = con.prepareStatement(buscar);
               rs = ps.executeQuery(); 
            }
            while (rs.next()) {
                usuario us = new usuario();
                us.setId(rs.getInt("id"));
                us.setUsuario(rs.getString("usuario"));
                us.setNombre_usuario(rs.getString("nombre_usuario"));
                us.setCaja_usuario(rs.getString("caja_usuario"));
                us.setRol_usuario(rs.getString("rol_usuario"));
                us.setEstado_usuario(rs.getString("estado_usuario"));
                listaUsers.add(us);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return listaUsers;
    }

    public boolean modificar(usuario us) {
        String sql = "UPDATE usuario SET usuario = ?, nombre_usuario = ?, caja_usuario = ?, rol_usuario = ? WHERE id = ?";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, us.getUsuario());
            ps.setString(2, us.getNombre_usuario());
            ps.setString(3, us.getCaja_usuario());
            ps.setString(4, us.getRol_usuario());
            ps.setInt(5, us.getId());
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }

    public boolean accion(String estado, int id) {
        String sql = "UPDATE usuario SET estado_usuario = ? WHERE id = ?";
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
