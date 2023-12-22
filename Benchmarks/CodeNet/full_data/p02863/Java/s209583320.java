import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N, T;
		int totTime = 0;
		int maxRest = 0;
		int clm;

		List<Integer> selected = new ArrayList<Integer>();

		N = Integer.parseInt(in.next());
		T = Integer.parseInt(in.next());

		clm = T - 1;

		int[][] ab = new int[N + 1][2];

		/*
		    ab[i][0]:i番目の料理に要する時間
		    ab[i][1]:i番目の料理の価値
		    (0 origin)
		*/
		for (int i = 0; i < N; i++) {
			ab[i][0] = Integer.parseInt(in.next()); // 時間
			ab[i][1] = Integer.parseInt(in.next()); // 価値
			totTime += ab[i][0];
		}

		if (totTime < T - 1) {
			totTime = T - 1;
		}

		/*
		    dp[i][j] : i番目以降の料理で、
		    時間の総和がj以下となるように選んだ時の価値の最大和
		*/
		int[][] dp = new int[N + 1][totTime + 1];

		for (int i = N - 1; i >= 0; i--) {
			for (int j = 0; j < totTime + 1; j++) {
				if (j < ab[i][0]) {
					dp[i][j] = dp[i + 1][j];
				} else {
					dp[i][j] = Math.max(dp[i + 1][j], dp[i + 1][j - ab[i][0]] + ab[i][1]);
				}
			}
		}

		for (int i = 0; i < N; i++) {
			if (clm >= ab[i][0] && dp[i + 1][clm - ab[i][0]] == dp[i][clm] - ab[i][1]) {
				selected.add(i);
				clm = clm - ab[i][0];
			}
		}

		for (int i = 0; i < N; i++) {
			if (selected.contains(i)) {
				continue;
			}
			if (maxRest < ab[i][1]) {
				maxRest = ab[i][1];
			}
		}

		System.out.println(dp[0][T - 1] + maxRest);
		in.close();
	}
}