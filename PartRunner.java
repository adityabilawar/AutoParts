package AutoParts;


import static java.lang.System.*;

//Files needed
 	//Part.java
 	//PartList.java

public class PartRunner
{
	public static void main(String[] args)
	{
		PartList prog = new PartList("H:\\workspace2021\\Maps\\src\\AutoParts\\partinfo.dat");
		out.println(prog);
	}
}
