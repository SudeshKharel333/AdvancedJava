/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PrepareDelete {
    public static void main(String[] args)
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/CCT","root","");
            PreparedStatement st = con.prepareStatement("delete from student where id=?");
            st.setInt(1, 3);
            int result=st.executeUpdate();

            System.out.println(result + "Row is deleted");
            st.close();
            con.close();
                    }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
