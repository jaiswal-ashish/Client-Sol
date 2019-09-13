/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;
import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Ashish Jaiswal
 */
public class dbConnect {
    public static Connection c;
    public static Statement st;
    public static PreparedStatement insertClient;
    public static PreparedStatement getClient, updateClient;
    static{
        try{
         Class.forName("com.mysql.jdbc.Driver");
         c = DriverManager.getConnection("jdbc:mysql://localhost:3306/client_sol","root","Incapp");
         st = c.createStatement();
//         st.executeUpdate("alter table cl_info1 auto_increment=1");
         insertClient = c.prepareStatement("insert into cl_info1 (name,gender,dob,country,address,language) values(?,?,?,?,?,?)");
         getClient = c.prepareStatement("select * from cl_info1 where lower(name) like lower(?) order by cid");//searches is case sensitive//sort the data items
         updateClient = c.prepareStatement("update cl_info1 set name=?, gender=?, dob=?,country=?,address=?,language=? where cid = ?");
    } catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
    }
    static public void dbClose(){
        try{
            c.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
    }
}
