/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc.modelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Scanner;


/**
 *Contains the method to get the greeting message, which is sent back as a String.
 * @author MartinGros
 */
public class ModelImplementation implements Model{

    @Override
    public String getGreeting() {
        /**
         * Reads the greeting from a properties file which is hosted in one of the devices directories
         */
        String greeting = ResourceBundle.getBundle("holamundomvc.modelo.cadena").getString("saludo.greeting");
        /*Properties prop = new Properties();
        InputStream is = null;
        
        
		
		try {
			is = new FileInputStream("c:\\properties\\cadena.properties"); //Especificar directorio!!!!!
			prop.load(is);
		} catch(IOException e) {
			System.out.println(e.toString());
		}
                //System.err.println(prop.getProperty("saludo.greeting"));
                greeting=prop.getProperty("saludo.greeting");
*/

        return greeting;
    }
    
}
