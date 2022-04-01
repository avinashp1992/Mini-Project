package com.testng.prgms;

import org.testng.annotations.Test;

public class testnggroup {
		@Test(groups="A")
		public void add()
		{
			System.out.println("Addition Method");
		}
		@Test(groups="B")
		public void sub()
		{
			System.out.println("Subtraction Method");
		}
		@Test(groups= {"A","B"})
		public void mul()
		{
			System.out.println("Multiplication Method");
		}
		@Test(groups="D")
		public void division()
		{
			System.out.println("Division Method");
		}

	}



