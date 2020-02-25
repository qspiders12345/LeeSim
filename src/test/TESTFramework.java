package test;

import java.io.IOException;

import org.testng.annotations.Test;
import generics.BaseTest;
import pom.POMFramework;

public class TESTFramework extends BaseTest
{
	@Test
	public void enter() throws IOException
	{
		POMFramework pom=new POMFramework(driver);
		pom.submit();
	}
}