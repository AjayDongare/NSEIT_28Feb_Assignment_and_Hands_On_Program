package com.examples.postcrud.dao;

import java.sql.SQLException;
import java.util.List;

import com.examples.postcrud.model.Post;

public interface PostDao 
{
	public List<Post> getAllPost() throws SQLException;

	public String inserPost(Post post) throws SQLException;

	public String deletePost(int pid) throws SQLException;

	public String updatePost(String auther) throws SQLException;
	
	



}