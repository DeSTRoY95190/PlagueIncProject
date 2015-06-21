package com.component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

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
	}
}
