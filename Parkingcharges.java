import java.util.*;
import java.lang.*;
import java.io.*;
class Parkingcharges
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		int h = in.nextInt();
		int z = 1*x + 1*y + (h-1)*y;
		int c = x+(h-1)*y;
		System.out.println(c);
		
	}
}
