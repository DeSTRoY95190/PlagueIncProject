package com.component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileReaderClass {
	private File 			file;
	private FileReader 		_rw;
	private BufferedReader 	reader;
	private String 			TextLu;
	private String[]		Array;
	private String[]		finale;
	
	public FileReaderClass(File _file)
	{
		this.file = _file;
		try {
			this._rw = new FileReader(file);
			this.reader = new BufferedReader(_rw);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void InitRead()
	{
		String BufferString;

			try {
				do
				{
					BufferString = reader.readLine();	
					if (BufferString != null) 
						TextLu += BufferString + '\n';
				}while(BufferString != null);	
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
	
	public void InitArray()
	{
		if (this.TextLu != null) {
			this.Array = this.TextLu.split("\n");
			for (int i = 0; i < this.Array.length; i++) {
				this.finale = this.Array[i].split(";");			
				/*for (int j = 0; j < finale.length; j++) {
					System.out.println("["+i+"]"+"["+j+"]"+this.finale[j]);
				}*/
			}
		}else {
			System.err.println("[ERROR] Array is Empty");
		}

	}

	public ArrayList<String> getFrontiersForACountry(String CountryName) throws NoCountry, NoFrontiers
	{
		ArrayList<String> findFrontier =  new ArrayList<String>();
		for (int i = 0; i < this.Array.length; i++) {
			if (this.Array[i].split(";")[0].equals(CountryName)) {
				for (int j = 1; j < this.Array[i].split(";").length; j++) {
					findFrontier.add(this.Array[i].split(";")[j]) ;	
				}
				if (this.Array[i].split(";").length > 1) {
					return findFrontier;
				} else {
					throw new NoFrontiers();
				}
			}
		}
		throw new NoCountry();

	}

	public void PrintFrontier(ArrayList<String> list)
	{
		if (!list.isEmpty()) {
			for (String string : list) {
				System.out.println(string);
			}
		}
	}

	public String[] getFinale()
	{
		return this.finale;
	}
}
