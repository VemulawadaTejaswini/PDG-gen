import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{
    public static int divide(int n, int[] p)
    {
        if(n%2 != 0)
		{
		    return 0;
		}
		else
		{  
		    int output = 0;
		    Arrays.sort(p);
		    int mid = n/2;
		    //if(p[mid] != p[mid-1])
		    //{
		        output = p[mid-1]-p[mid];
		    //}
		    //else if(p[mid] == p[mid-1])
		    //{
		        
		    //}
		    return output;
		}
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] p = new int[n];
		for(int i=0; i<n;i++)
		{
		    p[i] = sc.nextInt();
		}
		int output = divide(n,p);
		if(output < 0)
      	    System.out.println((-1)*output);
      	else
      	    System.out.println(output);
	}
}