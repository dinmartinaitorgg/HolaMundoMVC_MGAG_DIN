/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc.modelo;

/**
 *
 * @author 2dam
 */
public class ModelFactory {
    public Model getModel(){
    return new ModelImplementation();
    }
    
}