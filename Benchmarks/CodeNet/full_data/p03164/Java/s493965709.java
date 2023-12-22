
import java.util.*;

public class Main{
	static Scanner sc = new Scanner(System.in);
	static int[] inputArray(int size){
		int arr[] = new int[size];
		for(int i=0;i<size;i++)arr[i]=sc.nextInt();
		return arr;
	}
	public static void main(String[] args){
		int n = sc.nextInt();
		long maxWeight = sc.nextLong();
		long weight[] = new long[n];
		int values[] = new int[n];
		int sum=0;
		for(int i=0;i<n;i++){
			weight[i]=sc.nextLong();
			values[i]=sc.nextInt();
			sum+=values[i];
		}
		long dp[][] = new long[n+1][sum+1];
		for(int i=0;i<dp[0].length;i++)dp[1][i]=(int)1e9;
		dp[1][0]=0;
		dp[1][values[0]]=weight[0];
		for(int i=2;i<dp.length;i++) {
			for(int j=0;j<dp[0].length;j++){
				if(j<values[i-1])
					dp[i][j]=dp[i-1][j];
				else
					dp[i][j]=Math.min(dp[i-1][j-values[i-1]]+weight[i-1],dp[i-1][j]);
			}
		}
		long max=0;
		for(int i=0;i<dp[0].length;i++){
			if(dp[dp.length-1][i]<=maxWeight)
				max=Math.max(max,i);
		}
		// for(int i=0;i<dp.length;i++){
		// 	System.out.println(Arrays.toString(dp[i]));
		// }
		System.out.println(max);
	}
}