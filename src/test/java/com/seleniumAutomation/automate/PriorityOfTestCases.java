package com.seleniumAutomation.automate;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class PriorityOfTestCases {
	@Test(priority = 3, dataProvider = "Name"/* , dependsOnMethods = "aMethod" */)
  public void testsPriority(String data) {
	  
	  System.out.println("Tests priority practice.......!!!!!!"+data);
  }
  
  @Test(priority = 2)
  public void aMethod() {
	  
	  System.out.println("AMethod.......!!!!!!");
  }
  
  @Test(priority = 1, dependsOnMethods = "testsPriority")
  public void kMethod() {
	  
	  System.out.println("KMethod.......!!!!!!");
  }
  
  @DataProvider(name = "Name")
  public String[] dataSending() {
	  
	 String name[] = {"AMULYA KASINDULA"};
	  return name;
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("Before method");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println("After method");
  }

  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("Before class");
  }

  @AfterClass
  public void afterClass() {
	  
	  System.out.println("After class");
  }

  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("Before Test");
  }

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("After Test");	  
  }

  @BeforeSuite
  public void beforeSuite() {
	  
	  System.out.println("Before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  
	  System.out.println("After Suite");
  }

}
