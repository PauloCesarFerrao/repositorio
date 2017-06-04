/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

import java.util.List;
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
public class contatoDAOTest {
    
    public contatoDAOTest() {
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
     * Test of getALL method, of class contatoDAO.
     */
    @Test
    public void testGetALL() throws Exception {
        System.out.println("getALL");
        contatoDAO instance = new contatoDAO();
        List<contato> expResult = null;
        List<contato> result = instance.getALL();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of incluir method, of class contatoDAO.
     */
    @Test
    public void testIncluir() throws Exception {
        System.out.println("incluir");
        contato obj = null;
        contatoDAO instance = new contatoDAO();
        instance.incluir(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of excluir method, of class contatoDAO.
     */
    @Test
    public void testExcluir() throws Exception {
        System.out.println("excluir");
        contato obj = null;
        contatoDAO instance = new contatoDAO();
        instance.excluir(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editar method, of class contatoDAO.
     */
    @Test
    public void testEditar() throws Exception {
        System.out.println("editar");
        contato obj = null;
        contatoDAO instance = new contatoDAO();
        instance.editar(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVisible method, of class contatoDAO.
     */
    @Test
    public void testSetVisible() {
        System.out.println("setVisible");
        boolean b = false;
        contatoDAO instance = new contatoDAO();
        instance.setVisible(b);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
