
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.consultaUsuario;
import modelo.usuario;
import vista.menu;



public class ctlUsuario implements ActionListener, MouseListener{
    private usuario us;
    private consultaUsuario usCon;
    private menu vista;
    
    DefaultTableModel modelo = new DefaultTableModel();
    


    public ctlUsuario(usuario us, consultaUsuario usCon, menu vista) {
        this.us = us;
        this.usCon = usCon;
        this.vista = vista;
        this.vista.btnRegistrarUsuario.addActionListener(this);
        this.vista.tableUsuario.addMouseListener(this);
        listarUsuarios();
         
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnRegistrarUsuario) {
            if (vista.txtUsuarioUsu.getText().equals("") 
                    ||vista.txtNombreUsu.getText().equals("")
                    ||String.valueOf(vista.txtContrasenaUsu.getPassword()).equals("")) {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            } else {
                us.setUsuario(vista.txtUsuarioUsu.getText());
                us.setNombre_usuario(vista.txtNombreUsu.getText());
                us.setContrasena_usuario(String.valueOf(vista.txtContrasenaUsu.getPassword()));
                us.setCaja_usuario(vista.cbxCajaUsu.getSelectedItem().toString());
                us.setRol_usuario(vista.cbxRolUsu.getSelectedItem().toString());
                if (usCon.registrar(us)) {
                    JOptionPane.showMessageDialog(null, "Usuario registrado con exito");
                }else {
                    JOptionPane.showMessageDialog(null, "Error al registrar usuario");
                }
            }
                    
        }
    
    }
    
    public void listarUsuarios() {
        List<usuario>listaUsu = usCon.ListaUsuario();
        modelo = (DefaultTableModel) vista.tableUsuario.getModel();
        Object[] ob = new Object[6];
        for (int i = 0; i<listaUsu.size(); i++) {
            ob[0] = listaUsu.get(i).getId();
            ob[1] = listaUsu.get(i).getUsuario();
            ob[2] = listaUsu.get(i).getNombre_usuario();
            ob[3] = listaUsu.get(i).getCaja_usuario();
            ob[4] = listaUsu.get(i).getRol_usuario();
            ob[5] = listaUsu.get(i).getEstado_usuario();
            modelo.addRow(ob);  
        }
        vista.tableUsuario.setModel(modelo);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == vista.tableUsuario) {
            int fila = vista.tableUsuario.rowAtPoint(e.getPoint());
            vista.txtIdUsu.setText(vista.tableUsuario.getValueAt(fila, 0).toString());
            vista.txtUsuarioUsu.setText(vista.tableUsuario.getValueAt(fila, 1).toString());
            vista.txtNombreUsu.setText(vista.tableUsuario.getValueAt(fila, 2).toString());
            vista.cbxCajaUsu.setSelectedItem(vista.tableUsuario.getValueAt(fila, 3).toString());
            vista.cbxRolUsu.setSelectedItem(vista.tableUsuario.getValueAt(fila, 4).toString());
            vista.txtContrasenaUsu.setEnabled(false);
        }
        }

    @Override
    public void mousePressed(MouseEvent me) {
        }

    @Override
    public void mouseReleased(MouseEvent me) {
       }

    @Override
    public void mouseEntered(MouseEvent me) {
       }

    @Override
    public void mouseExited(MouseEvent me) {
        
    }
    
}
