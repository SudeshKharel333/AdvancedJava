
package db;
import java.sql.*;
public class Select {

    public static void main(String[] args)
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/CCT","root","");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM student WHERE id = '1'");
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }
            st.close();
            con.close();
                    }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
    
