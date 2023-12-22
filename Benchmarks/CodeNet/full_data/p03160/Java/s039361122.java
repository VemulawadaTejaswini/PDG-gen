import java.util.*;

public class main{
	public static void main(String args[])throws IOException{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] h = new int[n];
	//	Scanner scan = new Scanner(System.in);
		for(int i = 0; i < n; i++)
			h[i] = scan.nextInt();
		int[] dp = new int[n];
	Arrays.fill(dp, Integer.MAX_VALUE);
	dp[0] = 0;
		for(int i = 1; i < n; i++){
			//int min = Integer.MAX_VALUE;
			for(int j = i - 1; j >= Math.max(0, i - k); --j){
					dp[i] = Math.min(dp[i], dp[j] + Math.abs(h[i] - h[j]));
				}
		}
		System.out.println(dp[n - 1]);
}
}
