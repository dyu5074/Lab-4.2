import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;;
public class Runner {
public static void main(String[] args)
{
	List<Water> water = readBooksFromCSV("water.csv");
	for (Water b : water) {
	     System.out.println(b);
	}
}
	private static List<Water> readBooksFromCSV(String fileName) {
	List<Water> waters = new ArrayList<>(); 
	Path pathToFile = Paths.get(fileName);
	
	try (BufferedReader br = Files.newBufferedReader(pathToFile,StandardCharsets.US_ASCII))
	{
		String line = br.readLine();
		while (line != null) {
	String[] attributes = line.split(",");
	Water water = createBook(attributes);
	waters.add(water);
	line = br.readLine();
	}
	}catch (IOException ioe) {
	            ioe.printStackTrace();
	}
	return waters;
}
	private static Water createBook(String[] metadata)
	{
	String header =(metadata[0]);
	int Year = Integer.parseInt(metadata[0]);
	int Population = Integer.parseInt(metadata[1]);
	int consumption = Integer.parseInt(metadata[2]);
	int Gallons = Integer.parseInt(metadata[3]);
	return new Water(Gallons, Year, Population, consumption, header);
	}
} 
class Water {
	private	int consumption;
	private int Population;
	private int Year;
	private String Gallon;
	private String header;
public Water(String Gallon, int Year, int Population, int consumption, String header)
	{this.Year = Year; this.consumption = consumption; this.Gallon = Gallon; this.Population = Population; this.header = header; }
public String getHeader() {
    return header;
}
public void setHeader(String header) { this.header = header; }
public int getPopulation() {
    return Population;
}
public void getYear(int Year) 
{ this.Year = Year; };
@Override
public String toString() { return "Water [Year=" + Year + ", Gallon=" +
Gallon + ", Population=" + Population + "]"; }
}