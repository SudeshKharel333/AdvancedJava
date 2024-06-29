package db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PrepareInsert {
    public static void main(String[] args)
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/CCT","root","");
            PreparedStatement st = con.prepareStatement("INSERT INTO student (id, name, address) VALUES (?, ?, ?)");
            st.setInt(1, 3);
            st.setString(2, "subash");
            st.setString(3, "USA");
            int result=st.executeUpdate();

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
