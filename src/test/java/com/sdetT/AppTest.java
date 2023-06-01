package com.sdetT;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sdet.App;

public class AppTest {
	
	@Test
	public void testLogin1()
	{
		App myapp=new App();
	Assert.assertEquals(0,myapp.userLogin("abc", "abc@111"));
	}
	
	@Test
	public void testLogin2()
	{
		App myapp=new App();
	Assert.assertEquals(0,myapp.userLogin("abc", "abc@321"));
	}
	
}
