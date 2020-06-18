/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Security_System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Hatem Moahmed
 */
public class Update_Door extends Door {
  private int New_Pass , Confirm_Pass ;        
    
    
    public char Set_NewPass ( int New_Pass){
      if (New_Pass < 100000 && New_Pass >= 10000 ){
            this.New_Pass = New_Pass;
            return ('k');
            }
            else { return ('f') ;}
    }
     public char Set_ConfirmPass ( int Confirm_Pass){
      if (Confirm_Pass < 100000 && Confirm_Pass >= 10000 ){
            this.Confirm_Pass = Confirm_Pass;
            return ('k');
            }
            else { return ('f') ;}
    }
     
     public boolean Matched(){
        if (New_Pass == Confirm_Pass) {  Pass_Num = New_Pass ;
        return true ;} 
        else return false ;
     }
    @Override
            public void Set_DoorNum(int Door_Num){
            this.Door_Num = Door_Num ;
      try{
    
    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Security System", "Hatem", "133147");
    Statement stmt =  con.createStatement() ;  
   
    String SQL = "UPDATE door SET PASSWORD = ? WHERE NUMBER = ?" ;
   PreparedStatement ps = con.prepareStatement(SQL);
    ps.setInt(1, Pass_Num);
    ps.setInt(2, Door_Num);
    ps.executeUpdate();
    
                                  }
  catch (SQLException err){
            System.out.println(err.getMessage());
        }
        }
}
