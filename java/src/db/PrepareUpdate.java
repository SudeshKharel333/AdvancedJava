/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package db;
import java.sql.*;
public class PrepareUpdate {

    public static void main(String[] args)
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/CCT","root","");
            PreparedStatement pst=con.prepareStatement("Update statement set name=? where id=? set address=?");
            pst.setInt(1,1 );
            pst.setString(2,"sudesh" );
            pst.setString(3,"gaidakot" );
            pst.close();
            con.close();
                    }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
    

