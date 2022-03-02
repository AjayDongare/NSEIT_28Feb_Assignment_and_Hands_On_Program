package com.examples.postcrud.service;

import java.sql.SQLException;
import java.util.List;

import com.examples.postcrud.dao.PostDao;
import com.examples.postcrud.dao.PostDaoImpl;
import com.examples.postcrud.model.Post;

public class PostServiceImpl implements PostService
{
	
	PostDao dao;
	
	public PostServiceImpl()
	{
		dao= new PostDaoImpl();
	}

	public List<Post> getAllPost() throws SQLException 
	{
		return dao.getAllPost();
	}
	
	public String inserPost(Post post) throws SQLException 
	{
		
		return dao.inserPost(post);
	}
	public String deletePost(int pid) throws SQLException 
	{
		
		return dao.deletePost(pid);
	}
	public String updatePost(String auther) throws SQLException 
	{
		
		return dao.updatePost(auther);
	}

	
}