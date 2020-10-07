/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc.nview;

/**
 * Contains the method to show the greeting, Which are meant to be used by the controller.
 * @author MartinGros
 */
public interface View {
    /**
     * Shows the message in the UI
     * @param greeting is a string that hosts the greet that will be shown. 
     */
    public void showGreeting (String greeting);
    
}
