import java.util.*;
import java.io.*;
class Main
{
	public static void main(String args[]) throws java.lang.Exception
	{
		BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
			// String h[]=inp.readLine().split(" ");

			int n=Integer.parseInt(inp.readLine());
			int arr[][]=new int[n][3];
			for(int i=0;i<n;i++)
			{
				String h[]=inp.readLine().split(" ");
				for(int j=0;j<3;j++)
				{
					arr[i][j]=Integer.parseInt(h[j]);
				}
				if(i>0)
				{
					arr[i][0]+=Math.max(arr[i-1][1],arr[i-1][2]);
					arr[i][1]+=Math.max(arr[i-1][0],arr[i-1][2]);
					arr[i][2]+=Math.max(arr[i-1][0],arr[i-1][1]);
				}
			}
			System.out.println(Math.max(Math.max(arr[n-1][0],arr[n-1][1]),arr[n-1][2]));			
		
	}
	
}
class Pair
{
	int a;
	long b;
	
	Pair(int e, long f)
	{
		a=e;
		b=f;
		
	}
}