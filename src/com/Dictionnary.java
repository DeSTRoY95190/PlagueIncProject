package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Dictionnary {
	private ArrayList<String> Countries;
	private String FileCountryName;
	
	private File 			file;
	private FileReader 		_rw;
	private BufferedReader 	reader;
	private String 			finded;
	public Dictionnary()
	{
		this.Countries = new ArrayList<String>();
		this.file = new File("res/paysPop.csv");
		try {
			this._rw = new FileReader(file);
			this.reader = new BufferedReader(_rw);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		InitDico();
	}
	
	public ArrayList<String> getCountries()
	{
		return this.Countries;
	}
	
	public void InitDico()
	{
		String BufferString;
		String[] countries;
		try {
			do
			{
				BufferString = reader.readLine();	
				if (BufferString != null) 
					FileCountryName += BufferString + '\n';
			}while(BufferString != null);	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		countries = FileCountryName.split("\n");
		for (int i = 0; i < countries.length; i++) {
			String country = countries[i].split(";")[0];
			if (country.startsWith("null")) {
				country = country.substring(4,country.length());
			}
			this.Countries.add(country);
		}
	}
	
	public void PrintDico()
	{
		for (String string : Countries) {
			System.out.println(string);
		}
	}
	
	public String getCountry(String input)
	{
		for (int j = 0; j < this.Countries.size(); j++) {
			this.finded = this.Countries.get(j);
			for (int i = 0; i < this.finded.length(); i++) {
				if (this.finded.charAt(0) == input.charAt(0)) {
					int count = 0;
					while(count < input.length())
					{
						if(this.finded.charAt(count) == input.charAt(count))
						{
							if(count >= 2)
							{
								return this.finded;
							}
							count++;
						}
						else
							break;
					}
				}
				else
					break;
			}
		}
		return  null;
	}

	public String getFinded()
	{
		return this.finded;
	}
}
