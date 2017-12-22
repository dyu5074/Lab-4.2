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
		List<String> School = CSVUtilities.getDataString(0);
		for(String x : School)
		{
			System.out.print(x+ " ");
		}
		System.out.println();
		List<String> Name = CSVUtilities.getDataString(1);
		for(String x : Name)
		{
			System.out.print(x+ " ");
		}
		System.out.println();
		List<Integer> Takers = CSVUtilities.getDataInt(2);
		for(int x : Takers)
		{
			System.out.print(x+ " ");
		}
		System.out.println();
		List<Integer> Eng = CSVUtilities.getDataInt(3);
		for(int x : Eng)
		{
			System.out.print(x+ " ");
		}
		System.out.println();
		}
}