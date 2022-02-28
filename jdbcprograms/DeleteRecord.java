package jdbcprograms;

import java.sql.*;

public class DeleteRecord 
{
	public static void main(String[] args) throws SQLException 
	{
		// 1. Load the driver
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

		// 2. Establish the connection
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String username = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, username, password);

		// 3. create the statement object
		Statement st = con.createStatement();

		// 4. write the query and execute it
		String sql = "delete from student1 where id=2";

		// 5. store the data in the result set
		int k = st.executeUpdate(sql);
		System.out.println("Record Deleted...");
		
		// 6. close the connections
		st.close();
		con.close();
		DriverManager.deregisterDriver(new com.mysql.jdbc.Driver());
	}
}
