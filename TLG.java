import java.util.*;
import java.lang.*;
import java.io.*;
class TLG
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int max=0,lead=0,p1=0,p2=0;
		while(t--!=0)
		{
		    int player1=sc.nextInt();
		    int player2=sc.nextInt();
		    p1+=player1;
		    p2+=player2;
		    lead=p1-p2;
		    if(Math.abs(lead)>Math.abs(max))
		    max=lead;
		}
		if(max<0)
		System.out.println("2 "+Math.abs(max));
		else
		System.out.println("1 "+max);
	}
}
