
package db;
import java.sql.*;
public class update {

    public static void main(String[] args)
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/CCT","root","");
            Statement st=con.createStatement();
            int result = st.executeUpdate("UPDATE student SET name='sudip' WHERE id=3");

            System.out.println(result + "Row is updated");
            st.close();
            con.close();
                    }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
