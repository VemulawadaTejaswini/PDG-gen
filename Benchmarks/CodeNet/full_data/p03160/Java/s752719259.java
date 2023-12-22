// A java program to find minimum possible 
// time by the car chassis to complete 
import java.io.*; 
import java.util.*;

class Main
{ 
	
	
	
	// Driver code 
	public static void main (String[] args) throws IOException
	{ 
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        String[] ip;
	       
	            
	            int n = Integer.parseInt(br.readLine());
	            
	            ip = br.readLine().trim().split("\\s+");
	            int[] arr = new int[n];
	            for(int i=0;i<n;i++){
	                arr[i] = Integer.parseInt(ip[i]);
	            }
	            fun(arr,n);


	
	} 

	static void fun(int[] arr,int n){

		int[] dp = new int[n];

		dp[0]=0;
		dp[1] = Math.abs(arr[1]-arr[0]);
		for(int i=2;i<n;i++){
			

			int gap1=0,gap2=0;

			if(i-1>=0){
				gap1 = Math.abs(arr[i]-arr[i-1]);
				gap1 = gap1 + dp[i-1];
			}
			

			if(i-2>=0){
				gap2 = Math.abs(arr[i]-arr[i-2]);
				gap2 = gap2 + dp[i-2];
			}
			

			dp[i] = Math.min(gap1,gap2);

		


		}

		
			System.out.print(dp[n-1]);
	}

	
} 

