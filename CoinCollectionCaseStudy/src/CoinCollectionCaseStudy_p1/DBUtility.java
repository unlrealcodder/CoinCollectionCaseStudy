package CoinCollectionCaseStudy_p1;
import java.sql.*;



public class DBUtility {

	public static  Connection getSQLConnection()   {
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/coin_management_system?user=root&password=aanand@M29");
			return con;
		}
		
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		return con;
	}
}
