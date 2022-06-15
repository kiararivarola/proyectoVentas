/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.categoria;
import modelo.consultaCategoria;
import vista.menu;



/**
 *
 * @author Usuario
 */
public class ctlCategoria implements ActionListener, MouseListener, KeyListener {
    private final categoria cat;
    private final consultaCategoria catCon;
    private final menu vista;
    DefaultTableModel modelo = new DefaultTableModel();

    public ctlCategoria(categoria cat, consultaCategoria catCon, menu vista) {
        this.cat = cat;
        this.catCon = catCon;
        this.vista = vista;
        this.vista.btnRegistrarCate.addActionListener(this);
        this.vista.btnNuevoCate.addActionListener(this);
        this.vista.btnModificarCate.addActionListener(this);
        this.vista.tableCate.addMouseListener(this);
        this.vista.jLabelCategoria.addMouseListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    }
    
    

   
    

