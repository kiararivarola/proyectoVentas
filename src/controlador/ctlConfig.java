
package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import vista.menu;



public class ctlConfig implements MouseListener{
    private menu vista;
    
    public ctlConfig (menu vista) {
        this.vista = vista;
        this.vista.jLabelCategoria.addMouseListener(this);
        this.vista.jLabelClientes.addMouseListener(this);
        this.vista.jLabelConfiguracion.addMouseListener(this);
        this.vista.jLabelNuevaCompra.addMouseListener(this);
        this.vista.jLabelNuevaVenta.addMouseListener(this);
        this.vista.jLabelProveedores.addMouseListener(this);
        this.vista.jLabelUsuarios.addMouseListener(this);
        this.vista.jLabelProductos.addMouseListener(this);
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
}
