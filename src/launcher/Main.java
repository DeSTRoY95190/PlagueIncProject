package launcher;

import java.io.File;
import java.util.ArrayList;

import Exceptions.NoCountry;
import Exceptions.NoFrontiers;

import com.Dictionnary;
import com.component.FrontierFileReaderClass;

public class Main {

	public static void main(String[] args) {
		FrontierFileReaderClass read = new FrontierFileReaderClass(new File("res/Liaisons.csv"));
		ArrayList<String> fronts = new ArrayList<String>();
		Dictionnary doc = new Dictionnary();
		//doc.PrintDico();
		String input = "Aus";
		try {		
			fronts = read.getFrontiersForACountry(input);
			read.PrintFrontier(fronts);
		} catch (NoCountry e) {
			try {
				fronts = read.getFrontiersForACountry(e.getBestIdea(input));
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
