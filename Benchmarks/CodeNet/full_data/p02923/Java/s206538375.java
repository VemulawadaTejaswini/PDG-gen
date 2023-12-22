import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main{


	
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		
		int n = Integer.parseInt(br.readLine());
		
		int arr[] = new int [n];
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		
		for(int i = 0 ; i < n ; i++)
		{
			arr[i] = Integer.parseInt(st1.nextToken());
		}
		
	
		
		int max = 0;
		int prev = 0;
		
		for(int i = n-2; i >= 0 ; i--)
		{
			if(arr[i] >= arr[i+1])
			{
				prev = prev + 1;
			}
			else
			{
				prev = 0;
			}
			max = Math.max(max, prev);
		}
		
		
		
		out.println(max);
		
		
		out.flush();
		out.close();
	}
	
	
	


}
