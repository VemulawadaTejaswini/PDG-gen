import java.util.*;
import java.io.*;
public class ok{
	public static long knapsack(int[] weights,int[] values,int capacity,int n,long[][] memo){
		if(memo[n][capacity]!=-1){
			return memo[n][capacity];
		}
		if(n==0 || capacity==0){
			return 0l;
		}
		if(weights[n-1]<=capacity){
			memo[n][capacity]=Math.max(values[n-1]+knapsack(weights,values,capacity-weights[n-1],n-1,memo),knapsack(weights,values,capacity,n-1,memo));
			return memo[n][capacity];
		}
		memo[n][capacity]=knapsack(weights,values,capacity,n-1,memo);
		return memo[n][capacity];

	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int capacity=Integer.parseInt(st.nextToken());
		int[] weights=new int[n];
		int[] values=new int[n];
		for(int i=0;i<n;i++){
			st = new StringTokenizer(br.readLine());
			weights[i]=Integer.parseInt(st.nextToken());
			values[i]=Integer.parseInt(st.nextToken());
		}
		long[][] memo=new long[n+1][capacity+1];
		for(int i=0;i<n+1;i++){
			Arrays.fill(memo[i],-1l);
		}
		System.out.println(knapsack(weights,values,capacity,n,memo));
	}
}