/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

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
public class contatoTest {
    
    public contatoTest() {
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
     * Test of setId method, of class contato.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        contato instance = new contato();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class contato.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        contato instance = new contato();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTelefone method, of class contato.
     */
    @Test
    public void testSetTelefone() {
        System.out.println("setTelefone");
        Integer telefone = null;
        contato instance = new contato();
        instance.setTelefone(telefone);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipo method, of class contato.
     */
    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        String tipo = "";
        contato instance = new contato();
        instance.setTipo(tipo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class contato.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        contato instance = new contato();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class contato.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        contato instance = new contato();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTelefone method, of class contato.
     */
    @Test
    public void testGetTelefone() {
        System.out.println("getTelefone");
        contato instance = new contato();
        Integer expResult = null;
        Integer result = instance.getTelefone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipo method, of class contato.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        contato instance = new contato();
        String expResult = "";
        String result = instance.getTipo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class contato.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        contato instance = new contato();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
