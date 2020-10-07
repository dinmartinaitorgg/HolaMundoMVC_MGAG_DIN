/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc.modelo;

/**
 *Contains the method to get the greeting message, which is sent back as a String.
 * @author MartinGros
 */
public interface Model {
    /**
     *
     * @return Send the greeting message back as a string.
     */
    public String getGreeting();
    
}
