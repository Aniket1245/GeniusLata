package com.genius.script;

import org.testng.annotations.Test;

public class SampleJavaTest 
{
	@Test
	  public void createTest()
	  {
		  String browserName=System.getProperty("browser");
			String URLName=System.getProperty("url");
			
			System.out.println("The browser name is:="+browserName);
			System.out.println("The url name is:="+URLName);
			

		}

}
