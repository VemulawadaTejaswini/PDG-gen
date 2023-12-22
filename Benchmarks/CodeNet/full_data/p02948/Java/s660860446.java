import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	int N, M;
	int[][] AB;

	Map<List<Integer>, Long> memo = new HashMap<>();

	// n番目以降の仕事の中から、残り日数dで受け取れる報酬の最大値を返す
	private long rec(int n, int d) {
		List<Integer> memoKey = Arrays.asList(n, d);

		Long memoValue = memo.get(memoKey);
		if (memoValue != null) {
			return memoValue;
		}

		long res;
		if (n >= N) {
			res = 0;
		} else if (AB[n][0] <= d) {
			// n番目の仕事の報酬を期限内に受け取れる

			// nを受ける
			long a1 = AB[n][1] + rec(n + 1, d - 1);
			// nを受けない
			long a2 = rec(n + 1, d);

			res = Math.max(a1, a2);

		} else {
			// n番目の仕事の報酬を期限内に受け取れない
			res = rec(n + 1, d);
		}

		memo.put(memoKey, res);
		return res;
	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		N = sc.nextInt();
		M = sc.nextInt();
		AB = new int[N][2];

		for (int i = 0; i < N; i++) {
			AB[i][0] = sc.nextInt();
			AB[i][1] = sc.nextInt();
		}

		Arrays.sort(AB, (a1, a2) -> Integer.compare(a2[0], a1[0]));

		sc.close();

		out.println(rec(0, M));
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
