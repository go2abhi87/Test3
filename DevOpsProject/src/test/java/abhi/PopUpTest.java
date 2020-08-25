package abhi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;


public class PopUpTest {
	public static WebDriver driver = null;

	@Before
	// @Parameters({ "browsername", "URL" })
	public void setup() {
		Assert.assertEquals("Test", "Test");
	}

	//@SuppressWarnings("null")
	@Test
	public void popUpTest1() throws InterruptedException {
		
		Assert.assertEquals("Test", "Test");
		

	}
	
	@Test
	public void popUpTest2() throws InterruptedException {
		
		Assert.assertEquals("Test2", "Test2");	

	}

	@After
	public void tearDown() {
		Assert.assertEquals("Test", "Test");
	}
}
