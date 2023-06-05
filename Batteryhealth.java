import java.util.*;
import java.lang.*;
import java.io.*;
class Batteryhealth
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int t;
		Scanner s=new Scanner(System.in);
		t=s.nextInt();
		while(t-->0){
		    int x;
		    x=s.nextInt();
		    if(x>=80)
		    System.out.println("YES");
		    else
		    System.out.println("no");
		}
	}
}
