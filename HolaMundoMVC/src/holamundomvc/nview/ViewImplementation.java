/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc.nview;

/**
 * An implementation that shows the greeting in a text like UI.
 * @author 2dam
 */
public class ViewImplementation implements View{
/**
     * Shows the message in the UI
     * @param greeting is a string that hosts the greet that will be shown. 
     */
    
    @Override
    public void showGreeting(String greeting) {
        System.out.println(greeting);
    }



}
    
    
