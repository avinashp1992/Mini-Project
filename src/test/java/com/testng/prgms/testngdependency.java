package com.testng.prgms;

import org.testng.annotations.Test;

public class testngdependency {
	
	@Test
	public void add()
	{
		System.out.println("Addition Method");
	}
	@Test(dependsOnMethods = "mul")
	public void sub()
	{
		System.out.println("Subtraction Method");
	}
	@Test(dependsOnMethods = "add")
	public void mul()
	{
		System.out.println("Multiplication Method");
	}
	@Test(dependsOnMethods = "sub")
	public void division()
	{
		System.out.println("Division Method");
	}

}
