package rozetka;


import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class RozetkaPageObject extends BaseTest{
	 HomePage home;
	 
	@BeforeClass
	private void before() {
		home =  new HomePage(driver);
	}
	
	
  @Test
  public void testSearch() {
	  ResultPage result = home.search("iPhone 7");
	  assertTrue(result.getFirstLink().getText().contains("iPhone 7"));
	  
  }
  
  @Test
  public void testHomePage() {
	   home.open();
	  home.asserIsOpen();
	  	  
  }

 
  
}


