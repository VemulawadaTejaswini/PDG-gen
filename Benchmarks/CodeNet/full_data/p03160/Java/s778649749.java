import java.util.*;

import java.io.*;
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
       public static long knapSack(int W,  int n,object[]objects) { 
		 
	long K[][] = new long[n+1][W+1];
	for (int i = 0; i <= n; i++) {
	 
		for (int w = 0; w <= W; w++) { 
			if (i==0 || w==0) 
				K[i][w] = 0; 
			else if (objects[i-1].weight <= w) 
				K[i][w] = Math.max(objects[i-1].value + K[i-1][w-objects[i-1].weight], K[i-1][w]); 
			else
				K[i][w] = K[i-1][w]; 
		} 
	} 
	
	return K[n][W]; 
	} 
	public static void main(String[] args) throws IOException{
       int n = readInt(), h[] = new int[n+1],dp[] = new int[n+1];
       for(int i=1;i<=n;i++)h[i]=readInt();
       dp[2] = Math.abs(h[2]-h[1]);
       for(int i=3;i<=n;i++)dp[i]= Math.min(Math.abs(h[i]-h[i-1])+dp[i-1], dp[i-2]+ Math.abs(h[i]-h[i-2]));
       System.out.println(dp[n]);
       
        }
	static String next () throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}
	static long readLong () throws IOException {
		return Long.parseLong(next());
	}
	static int readInt () throws IOException {
		return Integer.parseInt(next());
	}
	static double readDouble () throws IOException {
		return Double.parseDouble(next());
	}
	static char readCharacter () throws IOException {
		return next().charAt(0);
	}
	static String readLine () throws IOException {
		return br.readLine().trim();
	}static class object{
        int weight; long value;
        object(int s, long d){ weight = s; value = d;}
    }
}