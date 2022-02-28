package jdbcprograms;

import java.sql.*;
import java.util.Scanner;

public class PreparedStatementInsert
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
		String sql = "insert into nseit values (?,?,?)";
		PreparedStatement pst = con.prepareStatement(sql);

		// 4. read the values from keyboard and insert into table..
		System.out.println("Enter empid");
		int empid = sc.nextInt();
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter technology");
		String tech = sc.next();
		pst.setInt(1, empid);
		pst.setString(2, name);
		pst.setString(3, tech);
		pst.executeUpdate();
		System.out.println("Record Inserted...");
		
		// 5. close the connections
		pst.close();
		con.close();
		DriverManager.deregisterDriver(new com.mysql.cj.jdbc.Driver());

		}

		}


