import java.util.*;
import java.lang.*;
import java.io.*;

class Kitchentimings
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int n1=sc.nextInt();
		    int n2=sc.nextInt();
		    System.out.println(n2-n1);
		}
	}
}
