
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.consultaUsuario;
import modelo.usuario;
import vista.frmLogin;
import vista.menu;


public class ctlLogin implements ActionListener{
    private usuario us;
    private consultaUsuario usCon;
    private frmLogin vista;

    public ctlLogin(usuario us, consultaUsuario usCon, frmLogin vista) {
        this.us = us;
        this.usCon = usCon;
        this.vista = vista;
        this.vista.btnIngresar.addActionListener(this);
        this.vista.setLocationRelativeTo(null);
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
         if (e.getSource() == vista.btnIngresar) {
            if (vista.txtUsuario.getText().equals("") 
                || String.valueOf(vista.txtContrasena.getPassword()).equals("")) {
                JOptionPane.showMessageDialog(null, "Los campos estan vacios");
            }else{
                String usuario = vista.txtUsuario.getText();
                String contrasena = String.valueOf(vista.txtContrasena.getPassword());
                us = usCon.login(usuario, contrasena);
                if (us.getUsuario() != null) {
                    menu admin = new menu();
                    admin.setVisible(true);
                    this.vista.dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "usuario o contraseña incorrecta");
                }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
         }
    }

