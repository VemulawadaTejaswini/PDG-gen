import java.util.*;

// ABC 48-C
// http://abc050.contest.atcoder.jp/tasks/arc066_a

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
			int sum = candies[i - 1] + candies[i];
			if (sum > x && candies[i] > 0) {
				int diff = sum - x;
				if (diff > candies[i]) {
					candies[i] = 0;
					answer += diff;
				} else {
					answer += diff;
					candies[i] -= diff;
				}
			}
		}
		
		System.out.println(answer);
	}
}