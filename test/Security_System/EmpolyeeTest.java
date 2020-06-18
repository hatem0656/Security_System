/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Security_System;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hatem Moahmed
 */
public class EmpolyeeTest {
    
    public EmpolyeeTest() {
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
     * Test of Set_ID method, of class Empolyee.
     */
    @Test
    public void testSet_ID() {
         int ID;
         char expResult ,result; 
        System.out.println("Set_Pass");
        Empolyee instance = new Empolyee();
        // 1st test case
        ID = 123 ; //from 1 to 5 digit
        result = instance.Set_ID(ID); 
        expResult = 'k'; // valid length 
        assertEquals(expResult, result);
        // 2nd test case
        ID = 123456 ; //greater than 5 digits
        result = instance.Set_ID(ID); 
        expResult = 'f'; // inavalid length 
        assertEquals(expResult, result); 
    }

    /**
     * Test of Check_ID method, of class Empolyee.
     */
    @Test
    public void testCheck_ID() {
        String expResult,result ;
        System.out.println("Check_ID");
        Empolyee instance = new Empolyee();
        // 1st test case
        instance.Set_ID(12345); 
        expResult = "ID not Found";
        result = instance.Check_ID();
        assertEquals(expResult, result);
        // 2nd test case
        instance.Set_ID(1233);
        expResult = "ID Found";
        result = instance.Check_ID();
        assertEquals(expResult, result);  
    }
    
}
