/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRM;
import java.sql.*;    
    
    
public class connectionclass {
    Connection con;
    Statement stn;
    connectionclass(){
    try
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crm","root","123456");
        stn=con.createStatement();
    }
    catch(Exception e){
    e.printStackTrace();
    }
    }
    public static void main(String[] args){
    new connectionclass();
    }
    
}
