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
public class DoorTest {
    
    public DoorTest() {
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
     * Test of Set_DoorNum method, of class Door.
     */
    @Test
    public void testSet_DoorNum() {
        System.out.println("Set_DoorNum");
        int Door_Num = 0;
        Door instance = new Door();
        instance.Set_DoorNum(Door_Num);
     
    }

    /**
     * Test of Set_Pass method, of class Door.
     */
    @Test
    public void testSet_Pass() {
        int Pass_Num;
        char expResult ,result; 
        System.out.println("Set_Pass");
        Door instance = new Door();
        // 1st test case
        Pass_Num = 123 ; //less than 5 digits
        result = instance.Set_Pass(Pass_Num); 
        expResult = 'f'; // inavalid length 
        assertEquals(expResult, result);
        // 2nd test case
        Pass_Num = 123456 ; //greater than 5 digits
        result = instance.Set_Pass(Pass_Num); 
        expResult = 'f'; // inavalid length 
        assertEquals(expResult, result);
        // 3rd test case
        Pass_Num = 12345 ; // 5 digits
        result = instance.Set_Pass(Pass_Num); 
        expResult = 'k'; // valid length 
        assertEquals(expResult, result);  
    }
    /**
     * Test of Check_Pass method, of class Door.
     */
    @Test
    public void testCheck_Pass() {
        String expResult ,result;
        System.out.println("Check_Pass");
        Door instance = new Door();
        // 1st test case
        instance.Set_DoorNum(1);
        instance.Set_Pass(88888);
        expResult = "Entrance Accepted";
        result = instance.Check_Pass();
        assertEquals(expResult, result);
      // 2nd test case
        instance.Set_DoorNum(1);
        instance.Set_Pass(12333);
        expResult = "Entrance Rejected";
        result = instance.Check_Pass();
        assertEquals(expResult, result);
    
    }
    
}
