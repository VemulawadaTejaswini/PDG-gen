import java.util.*;
import java.io.*;
class Main{
	

	private static int getCost(int i,int arr[],int dp[]){
		if(i >= arr.length)
			return Integer.MAX_VALUE;

		if(i== arr.length - 1)
			return 0;
		if(dp[i] != -1)
			return dp[i];
		int oneStep =0;
		int twoStep = 0;
		if(i+1 < arr.length)
			oneStep = Math.abs(arr[i] - arr[i+1]);
		if(i+2 < arr.length)
			twoStep = Math.abs(arr[i]-arr[i+2]);
		dp[i]= Math.min(oneStep + getCost(i+1,arr,dp),twoStep + getCost(i+2,arr,dp));
		return dp[i];
	}
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr[]=new int[n];
		String in[]=br.readLine().split(" ");
		for(int i=0;i<n;i++){
			arr[i]=Integer.parseInt(in[i]);
		}
		int dp[]=new int[n];
		Arrays.fill(dp,-1);
		int minCost = getCost(0,arr,dp);
		System.out.println(minCost);
	}
}
