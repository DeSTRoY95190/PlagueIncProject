package launcher;

import java.io.File;
import java.util.ArrayList;

import Exceptions.NoCountry;
import Exceptions.NoFrontiers;

import com.Dictionnary;
import com.component.FrontierFileReaderClass;

public class Main {

	public static void main(String[] args) {
		File file = new File("res/Liaisons.csv");
		FrontierFileReaderClass read = new FrontierFileReaderClass(file);
		ArrayList<String> fronts = new ArrayList<String>();
		Dictionnary doc = new Dictionnary();
		
		/*
		 * Vous devez avoir au moins 3 caractère dans input pour que ca marche...
		 * 
		 */
		String input = "Afr";
		try {		
			fronts = read.getFrontiersForACountry(read.getBestIdea(input));
			read.PrintFrontier(fronts);
		} catch (NoCountry e) {
			e.printStackTrace();
		}catch(NoFrontiers e1)
		{
			e1.printStackTrace();
		}
	}

}
