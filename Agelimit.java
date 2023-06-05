import java.util.*;
import java.lang.*;
import java.io.*;
class Agelimit
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for (int i=1;i<=t;i++)
		{
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int a=sc.nextInt();
		    if(x<=a && a<y)
		        {
		            System.out.println("yes");
		        }
		    else
		    {
		        System.out.println("no");
		    }
		}
	}
}
