package com.examples.postcrud.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.examples.postcrud.model.Post;
import com.examples.postcrud.service.PostService;
import com.examples.postcrud.service.PostServiceImpl;
public class PostMain {



	public static void main(String[] args) throws SQLException
	{
	/*	Scanner sc = new Scanner(System.in);
		PostServiceImpl service= new PostServiceImpl();
		List<Post> post = service.getAllPost();
		for(Post p:post) 
		{
			System.out.println(p.getPid()+" "+p.getTitle()+" "+p.getAuthor()+" "+p.getDescription());
		}
		System.out.println("Enter pid ");
		int pid = sc.nextInt();
		System.out.println("Enter title ");
		String title = sc.next();
		System.out.println("Enter author ");
		String author = sc.next();
		System.out.println("Enter description ");
		String description = sc.next();
		
		String result = service.inserPost(new Post(pid,author,title,description));
		System.out.println(result);
	
		
	/*	Scanner sc = new Scanner(System.in);
		PostServiceImpl service= new PostServiceImpl();
		System.out.println("Enter pid ");
		int pid = sc.nextInt();
		String result = service.deletePost(pid);
		System.out.println(result);
	*/
		
	
		
		
		
		
	}

}
