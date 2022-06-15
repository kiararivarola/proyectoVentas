/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.consultaUsuario;
import modelo.usuario;
import vista.menu;



/**
 *
 * @author Usuario
 */
public class ctlUsuario {
    private usuario us;
    private consultaUsuario usCon;
    private menu vista;

    public ctlUsuario(usuario us, consultaUsuario usCon, menu vista) {
        this.us = us;
        this.usCon = usCon;
        this.vista = vista;
    }

   
    
}
