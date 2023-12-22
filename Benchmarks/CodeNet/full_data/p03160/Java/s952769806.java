import java.io.*;
import java.util.*;

public class Main {
	
	private static long dp[];
	private static long util(int arr[],int start,int end) {
		
		if(start >= end-1) return 0;
		
		if(dp[start] != 0) return dp[start];
		
		long ans = Long.MAX_VALUE;
		
		if(start + 2 < end) {
			ans = Math.min(Math.abs(arr[start] - arr[start + 1]) + util(arr,start + 1,end) , Math.abs(arr[start] - arr[start + 2]) + util(arr,start + 2,end));
		}else {
			ans = Math.abs(arr[start] - arr[start + 1] ) + util(arr,start + 1,end);
		}
		
		return dp[start] = ans;
		
	}
	
	private static long util1(int arr[],int n) {
		
		int first = 0;
		int second = Math.abs(arr[1] - arr[0]);
		
		if(n == 2) return second;
		
		int third = 0;
		
		for(int i=2; i<n; i++) {
			third = Math.min(Math.abs(arr[i] - arr[i-1]) + second, Math.abs(arr[i] - arr[i-2]) + first);
			first = second;
			second = third;
		}
		
		return third;
		
	}
	
	public static void main(String[] args) {
		
		FastReader sc = new FastReader();
		
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		dp = new long[n+1];
		System.out.println(util1(arr,n));
	}
	
	
	
	
	
	
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
	                catch (IOException  e) 
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
	  

}
