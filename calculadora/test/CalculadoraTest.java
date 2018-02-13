/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import logicaNegocio.Calculadora;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP
 */
public class CalculadoraTest {
    private Calculadora c;
    
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
        c = new Calculadora(5, 8);
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void sumaTest() {
        int res = c.sumar();
        int esp = 13;
        assertEquals(esp, res);
    }
    
    @Test
    public void restaTest() {
        int res = c.restar();
        int esp = -3;
        assertEquals(esp, res);
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
