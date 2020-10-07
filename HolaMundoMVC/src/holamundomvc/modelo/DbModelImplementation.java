/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc.modelo;

import holamundomvc.nview.utilidades.db.DAO;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *Class where the method to the greeting from the database is allocated
 * @author Martin & Aitor
 */
public class DbModelImplementation implements Model {
/**
 * DAO object is created which will access the db and get the greeting
 * This greeting is set into a String
 * @return greeting (String)
 */
    @Override
    public String getGreeting() {
        DAO daos = new DAO();
        String greeting = null;
        try {
            greeting = daos.getSaludo();
        } catch (Exception ex) {
            Logger.getLogger(DbModelImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("------------");
        return greeting;
    }
    
}
