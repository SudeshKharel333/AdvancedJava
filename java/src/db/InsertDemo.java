package db;
import java.sql.*;
public class InsertDemo {
    public static void main(String[] args)
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/CCT","root","");
            Statement st=con.createStatement();
            int result=st.executeUpdate("insert into student values(2,'yamkanti','Belhani')");
            System.out.println(result + "Row is inserted");
            st.close();
            con.close();
                    }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
