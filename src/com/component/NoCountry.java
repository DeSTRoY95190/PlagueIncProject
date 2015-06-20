package com.component;

public class NoCountry extends Exception {
	private static final long serialVersionUID = 1L;

	public NoCountry()
	{
		
	}
	
	public void printStackTrace()
	{
		System.err.println("[ERROR] Sorry we can't find the country on the file\n\nUse:\n-First letter is Uppercase\n-Accents must be written");
	}
}
