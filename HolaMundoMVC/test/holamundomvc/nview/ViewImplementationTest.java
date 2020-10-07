/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc.nview;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests if the console implementations works.
 * @author Martin & Aitor
 */
public class ViewImplementationTest {
    
    public ViewImplementationTest() {
    }
    
  
    @Test
    public void testShowGreeting() {
        System.out.println("showGreeting");
        String greeting = "holamundo;";
        ViewImplementation instance = new ViewImplementation();
        instance.showGreeting(greeting);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
