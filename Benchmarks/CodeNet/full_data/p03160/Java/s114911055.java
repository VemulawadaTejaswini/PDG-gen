import java.util.*;
import java.io.*;

class frog2{
	public static void main(String args[])throws IOException{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] h = new int[n];
	//	Scanner scan = new Scanner(System.in);
		for(int i = 0; i < n; i++)
			h[i] = scan.nextInt();
		int[] dp = new int[n];
		dp[0] = h[0];
		for(int i = 1; i < n; i++){
			int min = Integer.MAX_VALUE;
			for(int j = 1; j <= k; j++){
				if(i - j >= 0){
					min = Math.min(min, Math.abs(h[i] - h[i - j]) + dp[i - j]);
				}
				else break;
			}
			dp[i] = min;
		}
		System.out.println(dp[n - 1]);
}
}
