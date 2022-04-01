package com.testng.prgms;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class testngsecondclass {
	@Ignore
	@Test 
	public void add()
	{
		System.out.println("Addition Method");
	}
	@Test(invocationCount=5)
	public void sub()
	{
		System.out.println("Subtraction Method");
	}
	@Test
	public void mul()
	{
		System.out.println("Multiplication Method");
	}
	@Test
	public void division()
	{
		System.out.println("Division Method");
	}

}
