/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.cliente;
import modelo.consultaCliente;
import modelo.usuario;
import vista.menu;



/**
 *
 * @author Usuario
 */
public class ctlCliente implements ActionListener, MouseListener {
    private cliente cl;
    private consultaCliente clCon;
    private menu vista;
    
    DefaultTableModel modelo = new DefaultTableModel();

    public ctlCliente(cliente cl, consultaCliente clCon, menu vista) {
        this.cl = cl;
        this.clCon = clCon;
        this.vista = vista;
        this.vista.btnRegistrarCliente.addActionListener(this);
        this.vista.tableClientes.addMouseListener(this);
        listarClientes();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if (e.getSource() == vista.btnRegistrarCliente) {
            if (vista.txtNombreCliente.getText().equals("") 
                    ||vista.txtTelefonoCliente.getText().equals("")
                    ||vista.txtDireccionCliente.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            } else {
                cl.setNombre_cliente(vista.txtNombreCliente.getText());
                cl.setTelefono_cliente(vista.txtTelefonoCliente.getText());
                cl.setDireccion_cliente(vista.txtDireccionCliente.getText());
                if (clCon.registrar(cl)) {
                    listarClientes();
                    JOptionPane.showMessageDialog(null, "Cliente registrado con exito");
                }else {
                    JOptionPane.showMessageDialog(null, "Error al registrar cliente");
                }
            }
                    
        }
           
    }

    private void listarClientes() {
        List<cliente>listaCli = clCon.ListaClientes();
        modelo = (DefaultTableModel) vista.tableClientes.getModel();
        Object[] ob = new Object[6];
        for (int i = 0; i<listaCli.size(); i++) {
            ob[0] = listaCli.get(i).getNombre_cliente();
            ob[1] = listaCli.get(i).getTelefono_cliente();
            ob[2] = listaCli.get(i).getDireccion_cliente();
            modelo.addRow(ob);  
        }
        vista.tableClientes.setModel(modelo);
    }

    private void limpiar() {
   
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == vista.tableClientes) {
            int fila = vista.tableClientes.rowAtPoint(e.getPoint());
            vista.txtNombreCliente.setText(vista.tableClientes.getValueAt(fila, 0).toString());
            vista.txtTelefonoCliente.setText(vista.tableClientes.getValueAt(fila, 1).toString());
            vista.txtDireccionCliente.setText(vista.tableClientes.getValueAt(fila, 2).toString());
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
