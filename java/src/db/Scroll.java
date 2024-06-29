package db;
import java.sql.*;
public class Scroll{
    public static void main(String[] args)
{
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
ResultSet rs=st.executeQuery("SELECT * FROM item");
rs.absolute(3);
System.out.println(rs.getInt(1)+rs.getString(2)+rs.getString(3));
rs.relative(-1);
System.out.println(rs.getInt(1)+rs.getString(2)+rs.getString(3));
st.close();
con.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}
