import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static final long DIVIDE_NUMBER = 1000000007;

	static List<List<Integer>> sideList = new ArrayList<>();
	static long[][] dp;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {

			sideList.add(new ArrayList<Integer>());
		}

		for (int i = 0; i < n - 1; i++) {

			int x = scan.nextInt() - 1;
			int y = scan.nextInt() - 1;

			sideList.get(x).add(y);
			sideList.get(y).add(x);
		}

		dp = new long[n][2];

		long answer = dpMethod(n, 0, 0) + dpMethod(n, 0, 1) % DIVIDE_NUMBER;

		println(answer);
	}

	public static long dpMethod(int parentVertex, int targetVertex, int isBlack) {

		if (dp[targetVertex][isBlack] != 0) {

			return dp[targetVertex][isBlack];
		}

		long result = 1;

		if (isBlack == 0) {

			// 白の場合、黒と白を計算する
			for (int side : sideList.get(targetVertex)) {

				if (side != parentVertex) {

					result *= dpMethod(targetVertex, side, 1) + dpMethod(targetVertex, side, 0);
					result %= DIVIDE_NUMBER;
				}
			}

		} else {

			// 黒の場合、白を計算する
			for (int side : sideList.get(targetVertex)) {

				if (side != parentVertex) {

					result *= dpMethod(targetVertex, side, 0);
					result %= DIVIDE_NUMBER;
				}
			}
		}

		if (result == 0) {

			result = DIVIDE_NUMBER;
		}

		dp[targetVertex][isBlack] = result;

		return result;
	}

	public static void println(Object target) {
		System.out.println(target);
	}
}
