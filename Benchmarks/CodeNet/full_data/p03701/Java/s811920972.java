import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dp = new int[n + 1];
		List<Integer> score = new ArrayList<>();

		for(int i = 0; i < n; i++) {
			score.add(sc.nextInt());
		}

		Collections.sort(score, Collections.reverseOrder());

		for(int i = 1; i <= n; i++) {
			dp[i] = dp[i - 1] + score.get(i - 1);
		}

		for(int i = n; i >= 0; i--) {
			if(dp[i] % 10 != 0) {
				System.out.println(dp[i]);
				break;
			}else {
				System.out.println(0);
			}
		}

		for(int value : dp) {
			System.out.print(value + " ");
		}

		sc.close();
	}
}
