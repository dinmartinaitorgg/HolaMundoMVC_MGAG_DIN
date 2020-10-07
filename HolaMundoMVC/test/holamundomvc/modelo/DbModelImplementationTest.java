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
 *Tests if the greeting matches, the greeting obtained from the DB.
 * @author Aitor & Martin
 */
public class DbModelImplementationTest {
    

    @Test
    public void testGetGreeting() {
        System.out.println("getGreeting");
        DbModelImplementation instance = new DbModelImplementation();
        String expResult = "Egun on Aitor";
        String result = instance.getGreeting();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
