package jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method s

		 // 1. Load the driver

		 DriverManager.registerDriver(new com.mysql.jdbc.Driver());

		 // 2. Establish the connection
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String username = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, username, password);

		 // 3. create the statement object

		 Statement st = con.createStatement();

		 // 4. write the query and execute it
		String sql = "create table nseit(empid int, name varchar(20), tech varchar(20))";
		// 5. store the data in the result set
		int k = st.executeUpdate(sql);

		 System.out.println("Table created...");
		// 7. close the connections
		st.close();
		con.close();
		DriverManager.deregisterDriver(new com.mysql.jdbc.Driver());

		 }

		}
	


