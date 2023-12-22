import java.util.*; import java.io.*; import java.math.*;


public class iloveemma {
	
	static Scanner scan = new Scanner(System.in);
	static int lim = 1000000007;
	static long[] dp; 
	public static void main(String[] args) {
		
		int N = scan.nextInt(); long[] arr = new long[N]; dp = new long[N];
		for(int i=0; i<N; i++) {arr[i] = scan.nextLong(); } Arrays.fill(dp,-1);
		System.out.println(solve(arr,0)); 
	}
	
	
	public static long solve(long[] arr, int index) {
		if(index >= arr.length-2) {return 0;}
		else if(dp[index] != -1){return dp[index];}
		else {
			dp[index] = Long.min(solve(arr,index+1)+Math.abs(arr[index]-arr[index+1]), 
					solve(arr,index+2)+Math.abs(arr[index]-arr[index+2]));
			return dp[index];
		}
	}

}
