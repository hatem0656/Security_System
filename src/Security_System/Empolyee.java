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
//import java.util.concurrent.TimeUnit;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.swing.JOptionPane;

/**
 *
 * @author Hatem Moahmed
 */
public class Empolyee {
    private int [] ID_col = new int [10];
    private int ID_num , i ;
    public Empolyee()  {
        ID_num = 0 ;
         i =0 ;
                      try{
    
    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Security System", "Hatem", "133147");
    Statement stmt =  con.createStatement() ; 
    String SQL = "SELECT * FROM employees" ; 
    ResultSet rs = stmt.executeQuery(SQL);
     
    while(rs.next()){
  ID_col[i] = rs.getInt("ID");
    i++ ;
    }
    }
        catch (SQLException err){
            System.out.println(err.getMessage());
        }
    }
    public void Set_ID(int ID){
        ID_num = ID ; 
    }
    public String Check_ID (){
            
                   
           int x , flag =0 ;  
     
       
        for(x=0 ; x<10 ; x++){
           
            if (ID_num == ID_col[x]){
                  flag ++ ;
                //JOptionPane.showMessageDialog(null, "ID Found ,Welcome Sir", "Entrance Successful" ,1);
        //        chk ++ ;
                break ;
            }  
        }
        if (flag == 0) {
            return("ID not Found") ;
        }
        else {
            return("ID Found") ;
        }
    }
}

