/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc.modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests if the factory returns somethings that's not a null value.
 * @author Martin & Aitor
 */
public class ModelFactoryTest {
    
    public ModelFactoryTest() {
    }
    
    
    @Test
    public void testGetModel() {
        System.out.println("getModel");
        int n = 0;
        ModelFactory instance = new ModelFactory();
        Model expResult =  null;
        Model result = instance.getModel(n);
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
