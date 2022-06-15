/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.consultaProveedor;
import modelo.proveedor;
import vista.menu;



/**
 *
 * @author Usuario
 */
public class ctlProveedor {
    private final proveedor prov;
    private final consultaProveedor provCon;
    private final menu vista;

    public ctlProveedor(proveedor prov, consultaProveedor provCon, menu vista) {
        this.prov = prov;
        this.provCon = provCon;
        this.vista = vista;
    }
    
    

    
    
}
