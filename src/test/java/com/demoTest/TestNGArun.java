package com.demoTest;

import org.testng.annotations.Test;

public class TestNGArun {
	@Test(priority = 0)
	public static void highSchool () {
		System.out.println("12th STD");
	}
	@Test(priority = -1)
    public static void College () {
		System.out.println("Electronics & Comm Engineering");
	}
	@Test(priority = 1)
    public static void Company () {
		System.out.println("IBM");
	
}
}
