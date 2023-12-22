import java.util.*;
public class Main {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		Integer[] A = new Integer[M];
		for(int i=0;i<M;i++) {
			A[i] = sc.nextInt();
		}
		StringBuilder ret = new StringBuilder();
		int[] dp = new int[N+1];
		int[] cost = new int[] {0,2,5,5,4,5,6,3,7,6};
		dp_num_order(dp,A,cost);
		Arrays.sort(A,Collections.reverseOrder());
		int match = N;
		while (match > 0) {
			for(int a : A) {
				if(match-cost[a]>=0 && dp[match] == 1+dp[match-cost[a]]) {
					ret.append(a);
					match -= cost[a];
					break;
				}
			}
		}
		System.out.println(new String(ret));
	}
	
	public static void dp_num_order(int[] dp, Integer[] A, int[] cost) {
		dp[0] = 0;
		for(int i=1;i<dp.length;i++) {
			int maxval = Integer.MIN_VALUE;
			for(int j : A) {
				if (i-cost[j] < 0) continue;
				if(dp[i-cost[j]]+1 > maxval) maxval = dp[i-cost[j]]+1;
			}
			dp[i] = maxval;
		}
	}
}
