import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long w=sc.nextInt();
		long value[]=new long[n];
		long weight[]=new long[n];
		for(int i=0;i<n;i++){
			weight[i]=sc.nextLong();
			value[i]=sc.nextLong();
		}
		long dp[][]=new long[n+1][(int) (w+1)];
		long ans=knapsack(n,w,weight,value,dp);
		System.out.println(ans);
	}
	public static long knapsack(int n,long w,long []weight,long[]value,long[][]dp){
		if(w==0 || n==0){
			return 0;
		}
		if(dp[n][(int)w]!=0){
			return dp[n-1][(int)w];
		}
		long inc=0,exe=0;
		if(weight[n-1]<=w){
			inc=value[n-1]+knapsack(n-1,w-weight[n-1],weight,value,dp);
			exe=knapsack(n-1,w,weight,value,dp);
		}
		else{
			exe=knapsack(n-1,w,weight,value,dp);
		}
		return dp[n-1][(int)w]=Math.max(inc, exe);
	}
}
