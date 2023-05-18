/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class CalculadoraTest {

    public CalculadoraTest() {
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
     * Test of soma method, of class Calculadora.
     */
    @Test
    public void testSoma() {
        System.out.println("testSoma");
        int a = 2;
        int b = 3;
        int Resultexp = 5;
        int resultado = Calculadora.soma(a, b);
        assertEquals(Resultexp, resultado);
        // TODO review the generated test code and remove the default call to fail.
        //   fail("The test case is a prototype.");
    }

    @Test
    public void testSomaNegativos() {
        int a = -2;
        int b = -3;
        int Resultexp = -5;
        int resultado = Calculadora.soma(a, b);
        assertEquals(Resultexp, resultado);
    }

    @Test
    public void testSomaZero() {
        int a = 0;
        int b = 0;
        int Resultexp = 0;
        int resultado = Calculadora.soma(a, b);
        assertEquals(Resultexp, resultado);
    }
}
