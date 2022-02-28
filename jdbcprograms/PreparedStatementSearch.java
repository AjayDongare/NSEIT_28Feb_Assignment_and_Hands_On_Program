package jdbcprograms;

import java.sql.*;
import java.util.Scanner;

public class PreparedStatementSearch
{
	public static void main(String[] args) throws SQLException 
	{
		// 1. Load the driver
		Scanner sc = new Scanner(System.in);
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

		// 2. Establish the connection
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String username = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, username, password);

		// 3. create the PreparedStatement object
		String sql = "select * from nseit where empid=?";
		PreparedStatement pst = con.prepareStatement(sql);

		// 4. read the values from keyboard and insert into table..
		System.out.println("Enter empid");
		int empid = sc.nextInt();
		pst.setInt(1, empid);
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
		System.out.println("Empid :"+rs.getInt(1));
		System.out.println("Name :"+rs.getString(2));
		System.out.println("Technology :"+rs.getString(3));
		}

		// 5. close the connections
		pst.close();
		con.close();
		DriverManager.deregisterDriver(new com.mysql.cj.jdbc.Driver());

		}

		
}
