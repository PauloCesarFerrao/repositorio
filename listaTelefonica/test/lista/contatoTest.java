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
    contato instance;
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
        instance = new contato();
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
        Integer id = 99;
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class contato.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "Teste";
        contato instance = new contato();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTelefone method, of class contato.
     */
    @Test
    public void testSetTelefone() {
        System.out.println("setTelefone");
        Integer telefone = 99912345;
        contato instance = new contato();
        instance.setTelefone(telefone);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTipo method, of class contato.
     */
    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        String tipo = "fixo";
        contato instance = new contato();
        instance.setTipo(tipo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
