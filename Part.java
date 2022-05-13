package AutoParts;


public class Part implements Comparable<Part>
{
	private String make, mode, rest;
	private int year;

	public Part(String line) 
	{
		String[] list = line.split(" ");
		if(list.length==5) {
			rest = list[0] + " " + list[1];
			make = list[2];
			mode = list[3];
			year = Integer.parseInt(list[4]);
		}
		else if(list.length==6) {
			rest = list[0] + " " + " " + list[1] + " " + list[2];
			make = list[3];
			mode = list[4];
			year = Integer.parseInt(list[5]);
		}
	}
	//have to have compareTo if implements Comparable
	public int compareTo( Part rhs )
	{
		if(this.make.compareTo(rhs.make) > 0)
			return 1;
		else if(this.make.compareTo(rhs.make) < 0)
			return -1;
		else if(this.mode.compareTo(rhs.mode) > 0)
			return 1;
		else if(this.mode.compareTo(rhs.mode) < 0)
			return -1;
		else if(this.mode.compareTo(rhs.mode) == 0 && this.year > rhs.year)
			return 1;
		else if(this.mode.compareTo(rhs.mode) == 0 && this.year < rhs.year)
			return -1;
		else return 0;
	}

	public String toString()
	{
		return make + " " + mode + " " +  year + " " + rest;
	}
}