package com.component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PopulationFileReaderClass {
	private File 			file;
	private FileReader 		_rw;
	private BufferedReader 	reader;
	private String 			TextLu;
	private String[]		Array;
	private String[]		finale;
	
	public PopulationFileReaderClass(File _file)
	{
		this.file = _file;
		try {
			this._rw = new FileReader(file);
			this.reader = new BufferedReader(_rw);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		InitRead();
		InitArray();
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
				e.printStackTrace();
			}
	}
	
	public void InitArray()
	{
		if (this.TextLu != null) {
			this.Array = TextLu.split(";");
			for (int i = 0; i < Array.length; i++) {
				if (Array[0].startsWith("null")) {
					Array[0] = Array[0].substring(4, Array[0].length());
				}
			}
		}else {
			System.err.println("[ERROR] Array is Empty");
		}

	}

	public void printArray()
	{
		for (String string : this.finale) {
			System.out.println(string);
		}
	}
}
