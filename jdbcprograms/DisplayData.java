package jdbcprograms;

import java.sql.*;

public class DisplayData 
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
		
		String sql = "select * from student1";

		// 5. store the data in the result set
		
		ResultSet rs = st.executeQuery(sql);

		// 6 . display the resultset data
		
		while (rs.next())
		System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));

		// 7. close the connections
		
		rs.close();
		st.close();
		con.close();
		DriverManager.deregisterDriver(new com.mysql.cj.jdbc.Driver());
	}

}
