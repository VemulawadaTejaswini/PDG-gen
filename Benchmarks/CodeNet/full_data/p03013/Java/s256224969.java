import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		List<Integer> input = new ArrayList<>();
		for (int i = 0; i < M; i++) {
			input.add(sc.nextInt());
		}
		int[] dp = new int[N+1];
		dp[0] = 1;
		if (input.contains(1)) {
			dp[1] = 0;
		} else {
			dp[1] = 1;
		}
		for (int i = 2; i <= N; i++) {
			if (input.contains(i)) {
				dp[i] = 0;
			} else {
				dp[i] = (dp[i - 2] + dp[i - 1]) %1000000007;
			}
		}
		System.out.print(dp[N]);
	}
}
