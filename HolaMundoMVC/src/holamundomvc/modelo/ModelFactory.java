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
    public Model getModel(int n){
        if (n==1){
            return new ModelImplementation();}
        else{
            return new DbModelImplementation();
        }
    }
    
}
