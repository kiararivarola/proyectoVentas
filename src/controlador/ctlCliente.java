/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.cliente;
import modelo.consultaCliente;
import vista.menu;



/**
 *
 * @author Usuario
 */
public class ctlCliente {
    private cliente cl;
    private consultaCliente clCon;
    private menu vista;

    public ctlCliente(cliente cl, consultaCliente clCon, menu vista) {
        this.cl = cl;
        this.clCon = clCon;
        this.vista = vista;
    }
    
    

    
    
}
