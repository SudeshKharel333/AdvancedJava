
package db;
import java.sql.*;
public class Delete {
    public static void main(String[] args)
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/CCT","root","");
            Statement st=con.createStatement();
            int result=st.executeUpdate("delete from student where name='sudesh' ");
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
