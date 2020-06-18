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
public class ManagerTest {
    
    public ManagerTest() {
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
     * Test of MSet_ID method, of class Manager.
     */
    @Test
    public void testMSet_ID() { 
       int ID;
        char expResult ,result; 
        System.out.println("Set_Pass");
       Manager instance = new Manager();
        // 1st test case
        ID = 123 ; //from 1 to 4 digit
        result = instance.MSet_ID(ID); 
        expResult = 'k'; // valid length 
        assertEquals(expResult, result);
        // 2nd test case
        ID = 123456 ; //greater than 4 digits
        result = instance.MSet_ID(ID); 
        expResult = 'f'; // inavalid length 
        assertEquals(expResult, result);
         
    }

    /**
     * Test of MCheck_ID method, of class Manager
     */
    @Test
    public void testMCheck_ID() {
        String expResult,result ;
        System.out.println("Check_ID");
        Manager instance = new Manager();
        // 1st test case
        instance.MSet_ID(12345); 
        expResult = "ID not Found";
        result = instance.MCheck_ID();
        assertEquals(expResult, result);
        // 2nd test case
        instance.MSet_ID(1234);
        expResult = "ID Found";
        result = instance.MCheck_ID();
        assertEquals(expResult, result);    
    }
    
}
