import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;
 
public class Main {
	static int n ;
	static int d ;
	
	
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		//BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		Scanner sc = new Scanner(System.in);
		//PrintWriter out = new PrintWriter("output.txt");
		PrintWriter out = new PrintWriter(System.out);
		int n = sc.nextInt();
		int W = sc.nextInt();
		int[] v = new int[n+1];
		int [] wt = new int[W+1];
		for(int i=0;i<n;i++)
		{
			wt[i] = sc.nextInt();
			v [i] = sc.nextInt();	
		}
		
		  long K[][] = new long[n+1][W+1]; 
	       
		     // Build table K[][] in bottom up manner 
		     for (int i = 0; i <= n; i++) 
		     { 
		         for (int w = 0; w <= W; w++) 
		         { 
		             if (i==0 || w==0) 
		                  K[i][w] = 0; 
		             else if (wt[i-1] <= w) 
		                   K[i][w] = Math.max(v[i-1] + K[i-1][w-wt[i-1]],  K[i-1][w]); 
		             else
		                   K[i][w] = K[i-1][w]; 
		         } 
		      }
		
		System.out.println(K[n][W]);
		
		out.flush();
		out.close();
		
	}
	
	
}