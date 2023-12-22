import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N, T;
	List<Pair> dishes;
	Pair last;
	long maxScore = 0L;

	static class Pair {
		int A, B;

		Pair(String line) {
			String[] tokens = line.split(" ");
			this.A = Integer.parseInt(tokens[0]);
			this.B = Integer.parseInt(tokens[1]);
		}
	}

	long[][] dp;

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		this.N = Integer.parseInt(tokens[0]);
		this.T = Integer.parseInt(tokens[1]);
		this.dishes = new ArrayList<>(N);
		for (int i = 0; i < N; ++i) {
			this.dishes.add(new Pair(in.readLine()));
		}
		// 食べる時間が早い順でソートしておく
		// 最終的にDPで組み合わせを計算することから，最後に残るものは完食までの時間が長いものになる．
		Collections.sort(this.dishes, new Comparator<Pair>() {
			@Override
			public int compare(Pair o1, Pair o2) {
				return Integer.compare(o1.A, o2.A);
			}
		});
		calc();
	}

	void calc() {
		// dp[i][j]: 0-i番目の料理でj分いないに完食できるおいしさの合計の最大値
		// T + Amaxの枠をとる
		int tMax = T + this.dishes.get(this.dishes.size() - 1).A;
		// 皿をAの昇順で食べた時の完食時間を計算しておく
		long[] thresholds = new long[N];
		long[] sums = new long[N];
		thresholds[0] = this.dishes.get(0).A;
		sums[0] = this.dishes.get(0).B;
		for (int i = 1; i < N; ++i) {
			thresholds[i] = thresholds[i - 1] + this.dishes.get(i).A;
			sums[i] = sums[i - 1] + this.dishes.get(i).B;
		}

		this.dp = new long[N][tMax + 1];
		// 0分ではどの料理も完食できないので0とする
		for (int i = 0; i < N; ++i) {
			this.dp[i][0] = 0L;
		}
		// 1つ目の料理だけを食べる場合の初期値を設定する
		Arrays.fill(this.dp[0], 0L);
		// dishes[0].A以上なら完食できる
		Arrays.fill(this.dp[0], this.dishes.get(0).A, T, (long) (this.dishes.get(0).B));
		for (int i = 1; i < N; ++i) {
			Pair dish = this.dishes.get(i);
			for (int j = 1; j <= tMax; ++j) {
				if (j > thresholds[i]) {
					// 全部食べられた
					this.dp[i][j] = sums[i];
				} else if (j < T) {
					int time = j - dish.A;
					if (time < 0) {
						// この皿を加える余地はない
						this.dp[i][j] = Math.max(this.dp[i - 1][j], this.dp[i][j - 1]);
					} else {
						// この皿を加えない場合と比べる
						this.dp[i][j] = Math.max(Math.max(this.dp[i - 1][j], this.dp[i][j - 1]),
								this.dp[i - 1][time] + dish.B);
					}
				} else {
					int time = j - dish.A;
					// 最後の皿を食べる場合としか比べられない
					this.dp[i][j] = Math.max(this.dp[i][j - 1], this.dp[i - 1][time] + dish.B);
				}
			}
		}
		// T + A[i]の値を見て，最大のものが解
		long max = 0L;
		for (int i = 0; i < N; ++i) {
			int time = T + this.dishes.get(i).A - 1;
			max = Math.max(max, this.dp[i][time]);
		}
		this.maxScore = max;
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		System.out.println(ins.maxScore);
	}

}