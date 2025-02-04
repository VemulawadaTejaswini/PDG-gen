import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer;
import java.lang.*; 
import java.util.*;

public class Main 
{ 
	static class FastReader 
	{ 
		BufferedReader br; 
		StringTokenizer st; 

		public FastReader() 
		{ 
			br = new BufferedReader(new
					InputStreamReader(System.in)); 
		} 

		String next() 
		{ 
			while (st == null || !st.hasMoreElements()) 
			{ 
				try
				{ 
					st = new StringTokenizer(br.readLine()); 
				} 
				catch (IOException e) 
				{ 
					e.printStackTrace(); 
				} 
			} 
			return st.nextToken(); 
		} 

		int nextInt() 
		{ 
			return Integer.parseInt(next()); 
		} 

		long nextLong() 
		{ 
			return Long.parseLong(next()); 
		} 

		double nextDouble() 
		{ 
			return Double.parseDouble(next()); 
		} 

		String nextLine() 
		{ 
			String str = ""; 
			try
			{ 
				str = br.readLine(); 
			} 
			catch (IOException e) 
			{ 
				e.printStackTrace(); 
			} 
			return str; 
		} 
		
	}
public static void main(String[] args) 
	{ 
		FastReader ob=new FastReader(); 
		int n = ob.nextInt();
		long arr[] = new long[n];
		for (int i=0;i<n ;i++ ) {
		    arr[i] = ob.nextLong();
		}
		long sum=0;
		for (int i=0;i<n-1 ;i++ ) {
		    for (int j=i+1;j<n ;j++ ) {
		        sum+=arr[i]^arr[j];
		    }
		}
		System.out.println(sum%(1000000007));
	}
		
	
} 	