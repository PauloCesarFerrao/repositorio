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
public class usuarioTest {
    
    public usuarioTest() {
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
     * Test of setId method, of class usuario.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        usuario instance = new usuario();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class usuario.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        usuario instance = new usuario();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSenha method, of class usuario.
     */
    @Test
    public void testSetSenha() {
        System.out.println("setSenha");
        String senha = "";
        usuario instance = new usuario();
        instance.setSenha(senha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class usuario.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        usuario instance = new usuario();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class usuario.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        usuario instance = new usuario();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class usuario.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        usuario instance = new usuario();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSenha method, of class usuario.
     */
    @Test
    public void testGetSenha() {
        System.out.println("getSenha");
        usuario instance = new usuario();
        String expResult = "";
        String result = instance.getSenha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class usuario.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        usuario instance = new usuario();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class usuario.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        usuario instance = new usuario();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
