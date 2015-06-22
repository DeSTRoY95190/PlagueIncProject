package launcher;

import java.io.File;
import java.util.ArrayList;

import Exceptions.NoCountry;
import Exceptions.NoFrontiers;

import com.component.FrontierFileReaderClass;

public class Main {

	public static void main(String[] args) {
		File file = new File("res/Liaisons.csv");
		FrontierFileReaderClass read = new FrontierFileReaderClass(file);
		ArrayList<String> fronts = new ArrayList<String>();
		
		/*
		 * You must entered at least 3 characters to make it work
		 * 
		 */
		
		String input = "All";
		try {	
			if (input.length() >= 3) {
				fronts = read.getFrontiersForACountry(input);
				read.PrintFrontier(fronts);
			}
			else{
				System.err.println("[INFO] You must enter at least 3 letters to make it work ! but you've entered only " + input.length() + " characters !");
				return;
			}
		} catch (NoCountry e) {
			try {
				fronts = read.getFrontiersForACountry(read.getBestIdea(input));
				read.PrintFrontier(fronts);
			} catch (NoCountry | NoFrontiers e1) {
				e1.printStackTrace();
			}
		}catch(NoFrontiers e1)
		{
			e1.printStackTrace();
		}
	}

}
