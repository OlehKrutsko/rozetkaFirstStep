package rozetka;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import rozetkaPages.HomePage;
import rozetkaPages.ResultPage;

public class TestRozetka {
	HomePage home;

	@BeforeClass
	private void before() {
		home = new HomePage();
	}

	@Test
	public void testSearch() {
		ResultPage result = home.search("iPhone 7");
		assertTrue(result.getFirstLink().getText().contains("iPhone 7"));
	}

	@Test
	public void testHomePage() {
		home.assertIsOpen();
	}

	@AfterTest
	public void exitBrowser() {
		home.tearDown();
	}
}
