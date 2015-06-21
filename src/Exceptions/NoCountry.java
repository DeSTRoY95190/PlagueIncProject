package Exceptions;

import java.io.File;

public class NoCountry extends Exception {
	private static final long serialVersionUID = 1L;

	private String 	_input;
	private File	_File;
	
	
	public NoCountry(String input, File file)
	{
		this._input = input;
		this._File = file;
	}
	
	public void printStackTrace()
	{
		System.err.println("[ERROR] Sorry we can't find the country on the file\n");
		System.err.println("\nUse:\n-First letter must be Uppercase\n-Accents must be written");
		
	}
	public File getFile()
	{
		return this._File;
	}
	
	public String getInput()
	{
		return this._input;
	}
	
	public void setInput(String new_input)
	{
		this._input = new_input;
	}
	
}
