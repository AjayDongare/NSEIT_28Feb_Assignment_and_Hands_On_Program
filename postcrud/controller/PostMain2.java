package com.examples.postcrud.controller;

import java.sql.SQLException;
import java.util.Scanner;

import com.examples.postcrud.service.PostService;
import com.examples.postcrud.service.PostServiceImpl;

public class PostMain2
{

		public static void main(String[] args) throws SQLException 
		{
			
			Scanner sc = new Scanner(System.in);
			PostService service= new PostServiceImpl();
			System.out.println("Enter pid ");
			int pid = sc.nextInt();
			
			String result = service.deletePost(pid);
			
			System.out.println(result);
		}

	}



