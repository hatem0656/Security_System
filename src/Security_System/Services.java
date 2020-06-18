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
public class Services {
    private int book_queue , ask_queue , customerService_queue ;
    Services() {
    book_queue = 0 ;
    ask_queue = 0 ; 
    customerService_queue = 0 ;
         
        
  
    }
   public int Booking(){
      
            try{
    
    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Security System", "Hatem", "133147");
    Statement stmt =  con.createStatement() ;
    String SQL = "SELECT * FROM SERVICE" ; 
    ResultSet rs = stmt.executeQuery(SQL);
     while(rs.next()){
       book_queue = rs.getInt("BOOKING");
       ask_queue = rs.getInt("ASKING");
       customerService_queue = rs.getInt("CUSTOMER_SERVICE");
     }
     book_queue ++ ;
    SQL = "INSERT INTO SERVICE VALUES(?,?,?)" ; 
    PreparedStatement ps = con.prepareStatement(SQL);
    ps.setInt(1, book_queue);
    ps.setInt(2, ask_queue);
    ps.setInt(3, customerService_queue);
    ps.execute();
   
    }
    
    catch (SQLException err){
            System.out.println(err.getMessage());
        }
     
      return (book_queue) ;
    }
    public int Asking(){
            try{
    
    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Security System", "Hatem", "133147");
    Statement stmt =  con.createStatement() ;
    String SQL = "SELECT * FROM SERVICE" ; 
    ResultSet rs = stmt.executeQuery(SQL);
     while(rs.next()){
       book_queue = rs.getInt("BOOKING");
       ask_queue = rs.getInt("ASKING");
       customerService_queue = rs.getInt("CUSTOMER_SERVICE");
     }
     ask_queue ++ ;
    SQL = "INSERT INTO SERVICE VALUES(?,?,?)" ; 
    PreparedStatement ps = con.prepareStatement(SQL);
    ps.setInt(1, book_queue);
    ps.setInt(2, ask_queue);
    ps.setInt(3, customerService_queue);
    ps.execute();
   
    }
    
    catch (SQLException err){
            System.out.println(err.getMessage());
        }
     
      return (ask_queue) ;
    }
    public int CustomerService(){
            try{
    
    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Security System", "Hatem", "133147");
    Statement stmt =  con.createStatement() ;
    String SQL = "SELECT * FROM SERVICE" ; 
    ResultSet rs = stmt.executeQuery(SQL);
     while(rs.next()){
       book_queue = rs.getInt("BOOKING");
       ask_queue = rs.getInt("ASKING");
       customerService_queue = rs.getInt("CUSTOMER_SERVICE");
     }
     customerService_queue ++ ;
    SQL = "INSERT INTO SERVICE VALUES(?,?,?)" ; 
    PreparedStatement ps = con.prepareStatement(SQL);
    ps.setInt(1, book_queue);
    ps.setInt(2, ask_queue);
    ps.setInt(3, customerService_queue);
    ps.execute();
   
    }
    
    catch (SQLException err){
            System.out.println(err.getMessage());
        }
     
      return(customerService_queue );
    }
}
