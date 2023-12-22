/* package codechef; // don't place package name! */

import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.*; 
import java.lang.*; 
import java.io.*;
import java.math.BigInteger; 
import java.math.*;

public  class Main {
    
	public static void main(String[] args) {
		
		InputStream inputStream = System.in;

		InputReader sc = new InputReader(inputStream);

				
	
	
	    int n=sc.nextInt();
	    int t=sc.nextInt();
	    int w[]= new int[n];
	    long v[]= new long[n];
	    for(int i=0;i<n;i++){
	     w[i]=sc.nextInt();
	     v[i]=sc.nextLong();
	    }
	    long dp[][]= new long[n+1][t+1];
	   
	 for(int i=0;i<=n;i++){
	   for(int j=0;j<=t;j++){
	     if(i==0 || j==0){
	       dp[i][j]=0;
	     }
	     else if(w[i-1]<=j){
	       dp[i][j]=Math.max(v[i-1]+dp[i-1][j-w[i-1]],dp[i-1][j]);
	     }
	     else{
	       dp[i][j]=dp[i-1][j];
	     }
	   }
	 }
	  
System.out.println(dp[n][t]);
	    
	}
	

	static class InputReader {
		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream), 32768);
			tokenizer = null;
		}

		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
				    tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
				    throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}
		public long nextLong() {
			return Long.parseLong(next());
		}
	
		public double nextDouble() {
			return Double.parseDouble(next());
		}
		public float nextFloat() {
			return Float.parseFloat(next());
		}
		
		
	}
}