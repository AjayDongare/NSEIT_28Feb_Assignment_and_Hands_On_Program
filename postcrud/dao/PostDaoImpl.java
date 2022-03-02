package com.examples.postcrud.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.examples.postcrud.model.Post;

public class PostDaoImpl implements PostDao
{
	String url = "jdbc:mysql://localhost:3306/jdbc";
	String username = "root";
	String password = "root";
	static Connection con;
	static PreparedStatement pst;
	
	static
	{
		try
		{
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		} 
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String username = "root";
		String password = "root";
		try
		{
			con = DriverManager.getConnection(url, username, password);
		} 
		catch (SQLException e)
		{
			
			e.printStackTrace();
		}
	}

	public List<Post> getAllPost() throws SQLException
	{
		List<Post> post = new ArrayList();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from post");
		while (rs.next())
		{
			post.add(new Post(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
		}

		return post;
	}
	
	public String inserPost(Post post) throws SQLException 
	{
	
		String sql = "insert into post values(?,?,?,?)";
		pst = con.prepareStatement(sql);
		pst.setInt(1, post.getPid());
		pst.setString(2, post.getAuthor());
		pst.setString(3, post.getTitle());
		pst.setString(4, post.getDescription());
		pst.executeUpdate();
		return "Record Inserted...";
	}

	public String deletePost(int pid) throws SQLException 
	{
		String sql = "delete from post where pid=?";
		pst = con.prepareStatement(sql);
		pst.setInt(1, pid);
		pst.executeUpdate();
		return "Record Deleted...";

	
	}

	public String updatePost(String auther) throws SQLException 
	{
		String sql = "update post set auther='sagar' where auther='swapnil'";
		pst = con.prepareStatement(sql);
		pst.setString(1, auther);
		pst.executeUpdate();
		return "Record Updated...";	
	}

}