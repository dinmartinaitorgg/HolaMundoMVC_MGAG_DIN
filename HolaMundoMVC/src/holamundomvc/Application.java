/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc;

import holamundomvc.controller.Controller;
import holamundomvc.modelo.Model;
import holamundomvc.modelo.ModelFactory;
import holamundomvc.nview.View;
import holamundomvc.nview.ViewFactory;
import holamundomvc.nview.ViewImplementation;
import holamundomvc.nview.utilidades.Util;
import holamundomvc.nview.utilidades.db.DAO;

/**
 * View, model, including their corresponding factory objects are created.
 * The user is shown whether he'd like to use the console style-ish way or the graphic implementation.
 * Following this the factory will generate and return an implementation from the previous elected kind.
 * Same for the model, the user will choose either if he'd rather to get the greeting from a properties file or databsase
 * Following this as well the model's factory will generate and return one of the implementations.
 * Both the model on the view are sent to the controller
 * 
 * @author Martin & Aitor
 */
public class Application {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        
        
        
        View vista;
        ViewFactory vistaFac = new ViewFactory();
        Model modelo;
        ModelFactory modelFac = new ModelFactory();

        int opc=0;
        System.out.println("Console mode press: 1");
        System.out.println("Graphic mode press: 2");
        opc=Util.leerInt(1, 2);
        vista = vistaFac.getView(opc);
        
        System.out.println("To obtain the data from the properties file press: 1");
        System.out.println("TO obtain the data from the database press: 2");
        opc=Util.leerInt(1, 2);
        modelo = modelFac.getModel(opc);
        
        Controller controlador = new Controller();
        
        controlador.run(vista, modelo);
    }
    
}
