import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	    int[] a1=new int[n];
	    int[] a2=new int[n];
 
		for(int i=0;i<n;i++)
		{
			a1[i]=sc.nextInt();
			a2[i]=sc.nextInt();
		}
 
		HashMap<String,Integer> s=new HashMap<String,Integer>();
      
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i!=j)
				{
			int x=(a1[j]-a1[i]);
			int y=(a2[j]-a2[i]);
			String input=String.valueOf(x)+"-"+String.valueOf(y);
			if(s.containsKey(input))
			s.put(input,s.get(input)+1);
			else
			s.put(input,1);
				}
			}
		}
		int max=0;
		for (Integer val : s.values())
		{
			//System.out.println(val);
			if (max<val) 
			max= val;
		}
 
		System.out.println(n-max);
 
	}
}
