
import java.io.*; 
import java.util.*;

class Main //for atcoder
{ 
	public static void main (String[] args) throws IOException
	{ 
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        String[] ip;
	       
	            
	            ip = br.readLine().trim().split("\\s+");
				int n = Integer.parseInt(ip[0]);
				int k = Integer.parseInt(ip[1]);
	            
	            ip = br.readLine().trim().split("\\s+");
	            int[] arr = new int[n];
	            for(int i=0;i<n;i++){
	                arr[i] = Integer.parseInt(ip[i]);
	            }
	            fun(arr,n,k);


	
	} 

	static void fun(int[] arr,int n,int k){

		int[] dp = new int[n];

		dp[0]=0;
		dp[1] = Math.abs(arr[1]-arr[0]);

		for(int i=2;i<n;i++){
			dp[i] = Integer.MAX_VALUE;
		}

		for(int i=2;i<n;i++){
			


			for(int j=i-1;j>=i-k;j--){


				
				
				if(j>=0)
				dp[i] = Math.min(dp[i], Math.abs(arr[i]-arr[j]) + dp[j]);

			}

		

		
		


		}

		
			System.out.print(dp[n-1]);
	}

	
} 

