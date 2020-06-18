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
public class Update_DoorTest {
    
    public Update_DoorTest() {
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
     * Test of Set_NewPass method, of class Update_Door.
     */
    @Test
    public void testSet_NewPass() {
        int Pass_Num;
        char expResult ,result; 
        System.out.println("Set_Pass");
        Update_Door instance = new Update_Door();
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
     * Test of Set_ConfirmPass method, of class Update_Door.
     */
    @Test
    public void testSet_ConfirmPass() {
        int Pass_Num;
        char expResult ,result; 
        System.out.println("Set_Pass");
        Update_Door instance = new Update_Door();
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
        assertEquals(expResult, result) ;
    }

    /**
     * Test of Matched method, of class Update_Door.
     */
    @Test
    public void testMatched() {
        boolean expResult ,result;
        System.out.println("Matched");
        Update_Door instance = new Update_Door();
        // 1st test case
        instance.Set_NewPass(12345);
        instance.Set_ConfirmPass(12345);
        expResult = true;
        result = instance.Matched();
        assertEquals(expResult, result);
        //2nd test case
        instance.Set_NewPass(11111);
        instance.Set_ConfirmPass(12345);
        expResult = false;
        result = instance.Matched();
        assertEquals(expResult, result);

    }

    /**
     * Test of Set_DoorNum method, of class Update_Door.
     */
    @Test
    public void testSet_DoorNum() {
        System.out.println("Set_DoorNum");
        int Door_Num = 0;
        Update_Door instance = new Update_Door();
        instance.Set_DoorNum(Door_Num);

    }
    
}
