package webee;
import java.sql.*;

public class Insert {
public static void main(String[]args)throws Exception {
	insertData();	
}
public static void insertData() throws Exception{
	String Url= "jdbc:mysql://127.0.0.1:3306/student";
	String Username="root";
	String Password="abbisheek@123";
	String Query= "insert into student values (?,?,?)";
	Connection con=DriverManager.getConnection(Url,Username,Password);
    PreparedStatement pst = con.prepareStatement(Query);
	pst.setInt(1,45);
	pst.setString(2,"abi" );
	pst.setString(3,"567");
	pst.executeUpdate();
	con.close();
}
}
