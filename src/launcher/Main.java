package launcher;

import java.io.File;
import java.util.ArrayList;

import com.component.FileReaderClass;
import com.component.NoCountry;
import com.component.NoFrontiers;

public class Main {

	public static void main(String[] args) {
		FileReaderClass read = new FileReaderClass(new File("res/Liaisons.csv"));
		read.InitRead();
		read.InitArray();
		ArrayList<String> fronts = new ArrayList<String>();
		try {
			fronts = read.getFrontiersForACountry("Australie");
			read.PrintFrontier(fronts);
		} catch (NoCountry | NoFrontiers e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
