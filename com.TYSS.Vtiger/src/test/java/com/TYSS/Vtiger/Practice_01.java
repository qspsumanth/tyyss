package com.TYSS.Vtiger;

import org.testng.annotations.Test;

public class Practice_01 {
	

		@Test
		public void test() {
			String url = System.getProperty("url");
			String browser = System.getProperty("Browser");
			//String username = System.getProperty("UserName");
			//String password = System.getProperty("Password");
			System.out.println(url);
			System.out.println(browser);
			//System.out.println(username);
			
			int a=10;
			int b=20;
			int res=a+b;
			System.out.println(res);
		}
		@Test
		public void test1() {
			int a=10;
			int b=20;
			int res=a*b;
			System.out.println(res);
		}
		@Test
		public void test2() {
			int a=100;
			int b=10;
			int c=a/b;
			System.out.println(c);
		}
		@Test
		public void test3()
		{
			System.out.println("hello1");
			System.out.println("BiiiiiiiHiiiiiiii");
			System.out.println("hello");
			
		}
		

	}



