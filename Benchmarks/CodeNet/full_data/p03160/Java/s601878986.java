import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Educational DP Contest / DP まとめコンテスト
//A	Frog 1
public class Main {

	static void chMin(int[] dp, int i, int v) {
		if (dp[i] > v) {
			dp[i] = v;
		}
	}

	static void chMax(int[] dp, int i, int v) {
		if (dp[i] < v) {
			dp[i] = v;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		List<Integer> hList = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			hList.add(Integer.parseInt(sc.next()));
		}
		sc.close();

		int[] dp = new int[N];
		for (int i = 0; i < N; i++) {
			dp[i] = Integer.MAX_VALUE;
		}

		dp[0] = 0;

		for (int i = 1; i < N; i++) {
			chMin(dp, i, dp[i - 1] + Math.abs(hList.get(i - 1) - hList.get(i)));
			if (i > 1) {
				chMin(dp, i, dp[i - 2] + Math.abs(hList.get(i - 2) - hList.get(i)));
			}
		}

		System.out.println(dp[N - 1]);
	}

}
