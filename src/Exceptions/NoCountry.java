package Exceptions;

import java.io.File;

import com.Dictionnary;

public class NoCountry extends Exception {
	private static final long serialVersionUID = 1L;

	private String 	_input;
	private File	_File;
	
	
	public NoCountry(String input, File file)
	{
		this._input = input;
		this._File = file;
		getBestIdea(input);
	}
	
	public void printStackTrace()
	{
		System.err.println("[ERROR] Sorry we can't find the country on the file\n");
		System.err.println("\nUse:\n-First letter must be Uppercase\n-Accents must be written");
	}
	
	
	public String getInput()
	{
		return this._input;
	}
	
	public void setInput(String new_input)
	{
		this._input = new_input;
	}
	
	public String getBestIdea(String input)
	{
			if (!input.isEmpty()) {
				Dictionnary dico = new Dictionnary();
				if (dico.getCountry(_input) != null) {
					return dico.getCountry(_input);
				}
			}else {
				System.err.println("Can't make a supposition on the input because it is empty");
			}
			return null;
	}
}
