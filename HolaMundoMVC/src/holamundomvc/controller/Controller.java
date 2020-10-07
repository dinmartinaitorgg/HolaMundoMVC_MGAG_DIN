/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc.controller;

import holamundomvc.modelo.Model;
import holamundomvc.nview.View;
import holamundomvc.nview.utilidades.Util;


/**
 * Controlador donde se obtiene el saludo y se muestra por pantalla.
 * @author Martin & Aitor
 */
public class Controller {
    public void run (View vista, Model modelo){
        /**
         * Primero se obtiene el saludo con el metodo getGreeting
         * Se ejecuta mediante el showGreeting
         */

            String saludo = modelo.getGreeting();
            vista.showGreeting(saludo);
 
        
    }
    
    
}
