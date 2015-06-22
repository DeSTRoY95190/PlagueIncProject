package launcher;

import java.io.File;
import java.util.ArrayList;

import com.component.FrontierFileReaderClass;
import com.component.PopulationFileReaderClass;

public class MainTest {

	public static void main(String[] args) {
		File file = new File("res/Liaisons.csv");
		File file2 = new File("res/paysPop.csv");
		//FrontierFileReaderClass read = new FrontierFileReaderClass(file);
		PopulationFileReaderClass read2 = new PopulationFileReaderClass(file2);
		//ArrayList<String> fronts = new ArrayList<String>();
		ArrayList<String> Population = new ArrayList<String>();
		
	}

}
