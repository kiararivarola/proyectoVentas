/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.consultaProducto;
import modelo.producto;
import vista.menu;

/**
 *
 * @author Usuario
 */
public class ctlProducto {
    private producto prod;
    private consultaProducto prodCon;
    private menu vista;

    public ctlProducto(producto prod, consultaProducto prodCon, menu vista) {
        this.prod = prod;
        this.prodCon = prodCon;
        this.vista = vista;
    }
    
    
    
}
