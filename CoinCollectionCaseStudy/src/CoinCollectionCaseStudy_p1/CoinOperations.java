package CoinCollectionCaseStudy_p1;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class CoinOperations {

	int tcid;
	String country;
	String tempDenomination;
	LocalDate yom;
	double tcurValue;
	LocalDate taqdt;
	
	ArrayList<Coin> coins =new ArrayList<Coin>();
	public void addDatabse() {
		try {
			Connection con=DBUtility.getSQLConnection();
			
				Statement stmt =con.createStatement();
				String qury ="select * from coin_table";
				ResultSet rs=stmt.executeQuery(qury);
			
				while(rs.next()) {
					 tcid =rs.getInt(1);
					 country=rs.getString(2);
					tempDenomination=rs.getString(3);
					yom=rs.getDate(4).toLocalDate();
					tcurValue=rs.getDouble(5);
					taqdt=rs.getDate(6).toLocalDate();
					
					Coin obj=new Coin(tcid, country, tempDenomination, yom, tcurValue, taqdt);
					coins.add(obj);
					
				}
				
				con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void displayAllCoinsDetails() {
		for(Coin ref:coins) {
			System.out.println(ref);
		}
	}
}
