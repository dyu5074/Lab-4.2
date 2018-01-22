import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

// made by Derek Yu
// Lab 4.2
public class Runner {

	public static void main(String[] args) throws IOException 
	{
		File sat = new File("water.csv");
		
		CSVUtilities csv = new CSVUtilities(sat);
		
		List<String> heading = csv.getColumnHeaders();
		for (String x: heading) 
		{
			System.out.println(x);
		}
		List<String> Year = CSVUtilities.getDataString(0);
		for(String x : Year)
		{
			System.out.print(x+ " ");
		}
		System.out.println();
		List<String> Population = CSVUtilities.getDataString(1);
		for(String x : Population)
		{
			System.out.print(x+ " ");
		}
		System.out.println();
		List<Integer> Consumption = CSVUtilities.getDataInt(2);
		for(int x : Consumption)
		{
			System.out.print(x+ " ");
		}
		System.out.println();
		List<Integer> percapita = CSVUtilities.getDataInt(3);
		for(int x : percapita)
		{
			System.out.print(x+ " ");
		}
		System.out.println();
		}
}