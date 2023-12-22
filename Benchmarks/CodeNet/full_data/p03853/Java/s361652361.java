/*package whatever //do not write package name here */

// Working program with FastReader 
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer; 

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
		int h = ob.nextInt(),w=ob.nextInt();
		char c[][] = new char[h][w];
		for (int i=0;i<h ;i++ ) {
		    String s = ob.next();
		    for (int j=0;j<w ;j++ ) {
		        c[i][j]=s.charAt(j);
		    }
		}
		for (int i=0;i<h*2 ;i++ ) {
		    for (int j=0 ;j<w;j++ ) {
		        System.out.print(c[Math.min(h-1,(i+1)/2)][j]);
		    }
		    System.out.println();
		}
	
	} 
} 
