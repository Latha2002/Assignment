import java.util.*;
import java.lang.*;
import java.io.*;
class Practiceperf
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int count=0;
		int[] problems = new int[4];
		for(int i=0;i<4;i++){
		    problems[i]=sc.nextInt();
		    if(problems[i]>=10){
		        count++;
		    }
		}
		System.out.print(count);
	}
}
