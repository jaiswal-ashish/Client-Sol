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
    public static PreparedStatement insertClient,insertClient1,insertClient2;
    public static PreparedStatement getClient,getOrders, updateClient,updateAddress,updateOrder;
    static{
        try{
         Class.forName("com.mysql.jdbc.Driver");
         c = DriverManager.getConnection("jdbc:mysql://localhost:3306/client_sol","root","Incapp");
         st = c.createStatement();
//         st.executeUpdate("alter table cl_info1 auto_increment=1");
         insertClient = c.prepareStatement("insert into cl_info1 (name,gender,dob,country,language,age,ssn,contact,mstatus) values(?,?,?,?,?,?,?,?,?)");
         insertClient1 = c.prepareStatement("insert into cl_info2 (company, street_add, apt, zip, city,state,cl_id) values(?,?,?,?,?,?,?)");
         insertClient2 = c.prepareStatement("insert into orders (dt , order_no , p_method ,amount , invoice ,status ,description,cl_id) values(?,?,?,?,?,?,?,?)");
         getClient = c.prepareStatement("select * from cl_info1 where lower(name) like lower(?) order by cid");//searches is case sensitive//sort the data items
//         getOrders = c.prepareStatement("select * from orders wehre cl_id =  order by dt");
         updateClient = c.prepareStatement("update cl_info1 set name=?, gender=?, dob=?,country=?,language=?,age=?,ssn=?,contact=?,mstatus=? where cid = ?");
         updateAddress = c.prepareStatement("update cl_info2 set company=?, street_add=?, apt=?, zip=?, city=?,state=? where cl_id = ?");
         updateOrder = c.prepareStatement("update orders set dt =? , p_method=? ,amount=? , invoice=? ,status=? ,description=? where cl_id = ? and order_no =?");
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
