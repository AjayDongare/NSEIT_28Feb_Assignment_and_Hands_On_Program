package com.examples.postcrud.controller;

import java.sql.SQLException;
import java.util.Scanner;

import com.examples.postcrud.service.PostService;
import com.examples.postcrud.service.PostServiceImpl;

public class PostMain1 
{


		public static void main(String[] args) throws SQLException 
		{
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			PostService service= new PostServiceImpl();
			System.out.println("Enter author ");
			String author = sc.next();
			
			String result = service.updatePost(author);
			System.out.println(result);

		}
}
