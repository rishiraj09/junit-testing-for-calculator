/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rishiraj
 */
public class testcalculator {
    
    private calculator cal;

    @Before
    public void setUp() throws Exception {
        this.cal= new calculator();
        
    }

    @After
    public void tearDown() throws Exception {
        cal = null;
    }

    @Test
    public void Testadd() throws Exception {
        assertEquals(8,cal.add(5,3));

    }

    @Test
    public void testSubtract() throws Exception {
        assertEquals(10,cal.sub(18,8));
    }

    @Test
    public void testMultiplyByZero() throws Exception {
        assertEquals(0,cal.mul(2,0));
    }

    @Test
    public void testDivideByZero() throws Exception {
        assertEquals(0,cal.dividebyZero(2,0));
    }

    @Test
    public void testMultiply() throws Exception {
        assertEquals(15,cal.mul(3,5));
    }

    @Test
    public void testDivide() throws Exception {
        assertEquals(5,cal.testdevide(10,2));
    }
}
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

