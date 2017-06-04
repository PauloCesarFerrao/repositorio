/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

import java.sql.Connection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author BMGJYC
 */
public class ConexaoBDTest {
    
    public ConexaoBDTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCon method, of class ConexaoBD.
     */
    @Test
    public void testGetCon() {
        System.out.println("getCon");
        ConexaoBD instance = null;
        Connection expResult = null;
        Connection result = instance.getCon();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInstance method, of class ConexaoBD.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        ConexaoBD expResult = null;
        ConexaoBD result = ConexaoBD.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
