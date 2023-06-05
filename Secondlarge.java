import java.util.*;
import java.lang.*;
import java.io.*;
class Secondlarge
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner read=new Scanner(System.in);
		int t=read.nextInt();
		for(int i=0;i<t;i++)
		{
		    int a=read.nextInt();
		    int b=read.nextInt();
		    int c=read.nextInt();
		    int min=Math.min(a,Math.min(b,c));
		    int max=Math.max(a,Math.max(b,c));
		    if(a!=min && a!=max)
		    System.out.println(a);
		    else if(b!=min && b!=max)
		    System.out.println(b);
		    else if(c!=min && c!=max)
		    System.out.println(c);
		}
	}
}
