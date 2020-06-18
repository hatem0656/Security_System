/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Security_System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
/**
 *
 * @author Hatem Moahmed
 */
public class Door {
    
    protected int Pass_Num , Door_Num ,True_Pass  ;
        public Door()  {
        Door_Num = 0 ;    
        Pass_Num = 0 ;
        

    }
      
    
        public void Set_DoorNum(int Door_Num){
            this.Door_Num = Door_Num ;
                                  try{
    
    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Security System", "Hatem", "133147");
    Statement stmt =  con.createStatement() ;  
   
    String SQL = "SELECT * FROM door WHERE NUMBER = ?" ;
   PreparedStatement ps = con.prepareStatement(SQL);
    ps.setInt(1, Door_Num);
    ResultSet rs = ps.executeQuery();
    while (rs.next()){
    True_Pass = rs.getInt("PASSWORD"); 
    }
                                  }
  catch (SQLException err){
            System.out.println(err.getMessage());
        }
        }
        
        public char Set_Pass(int Pass_Num){
            if (Pass_Num < 100000 && Pass_Num >= 10000 ){
            this.Pass_Num = Pass_Num ;
            return ('k');
            }
            else { return ('f') ;}
        }
        
        public String Check_Pass(){
         if (Pass_Num ==  True_Pass)
         {
             return ("Entrance Accepted");
         }
         else {
             return ("Entrance Rejected");
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
         }
        }
}

