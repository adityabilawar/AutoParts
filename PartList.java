package AutoParts;


import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import static java.lang.System.*;
import java.io.*;
import java.util.*;

public class PartList
{
	private TreeMap<Part, Integer> partsMap;
	
	public PartList()
	{
		partsMap = new TreeMap<Part, Integer>();

	}
	
	public PartList(String fileName)
	{
		
		this();
		partsMap = new TreeMap<Part, Integer>();
		try
		{
			//Scanner file = new Scanner(new File("lab08d.dat"));
			//add code here to read from the file 
			//and add Parts to the map
			FileReader file1 = new FileReader(new File(fileName));
			BufferedReader br = new BufferedReader(file1);
			while(br.ready()) {
				Part a = new Part(br.readLine());
				if(partsMap.containsKey(a)) {
					partsMap.put(a, partsMap.get(a) + 1);
					}
				else {
					partsMap.put(a, 1);
				}
			}
			




		}
		catch( IOException e )  //Most specific exceptions must be listed 1st
		{
			out.println(e);
		}
		catch( RuntimeException e )
		{
			out.println(e);
		}
		catch( Exception e )
		{
			out.println(e);
		}
		finally
		{
			//no code needed here
		}
	}
	
	public String toString()
	{
		String output="";
		for(Part a : partsMap.keySet()) {
			output+=a+ " - " + partsMap.get(a) + "\n";
		}



		return output;
	}
}