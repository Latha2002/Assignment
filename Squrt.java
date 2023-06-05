import java.util.*;
import java.lang.*;
import java.io.*;
class Squrt
{
	public static void main (String[] args) throws java.lang.Exception
	{
    	Scanner input = new Scanner(System.in);
    	int cases = input.nextInt();
    	for (int i = 0 ; i < cases; i++){
    	    int n = input.nextInt();
    	     System.out.println((int)Math.sqrt(n));
    	} 
	}
}
