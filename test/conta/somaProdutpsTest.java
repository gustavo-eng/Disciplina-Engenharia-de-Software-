/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package conta;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author Usuario
 */
public class somaProdutpsTest {
    private Vendas sell;
   
    public somaProdutpsTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        sell = new Vendas();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of multiplicacaoValores method, of class somaProdutps.
     */
    
    @Test
    public void testMultiplicacaoValores2() {
       assertEquals(20, sell.multiplicacaoValores(2, 10));
    }
    @Test
    public void testMultiplicacaoValores4() {
       assertEquals(40, sell.multiplicacaoValores(4, 10));
    }
    @Test
    public void testMultiplicacaoValores8() {
       assertEquals(80, sell.multiplicacaoValores(8, 10));
    }
    
    
    
    
}


