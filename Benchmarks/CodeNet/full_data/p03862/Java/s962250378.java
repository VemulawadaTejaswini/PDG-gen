import java.util.*;

// ABC 48-C
// http://abc048.contest.atcoder.jp/tasks/arc064_a

public class Main {
	
	static int MOD = 1000000007;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[] candies = new int[n];
		int x = in.nextInt();
		
		for (int i = 0; i < n; i++) {
			candies[i] = in.nextInt();
		}
		
		int answer = 0;
		for (int i = 1; i < n; i++) {
//			int sum = candies[i - 1] + candies[i];
//			if (sum > x) {
//				int diff = sum - x;
//				answer += diff;
//				if (diff <= candies[i]) {
//					candies[i] -= diff;
//				} else {
//					candies[i] = 0;
//				}
//			}
			int sum = candies[i - 1] + candies[i];
			int k = Math.max(0, sum - x);
			answer += k;
			candies[i] = Math.max(0, candies[i] - k);
		}
		
		System.out.println(answer);
	}
}