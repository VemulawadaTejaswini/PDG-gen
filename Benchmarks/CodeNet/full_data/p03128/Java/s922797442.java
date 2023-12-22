import java.util.*;

public class Main {
	static class Elem {
		int prev, val;

		public Elem(int val, int prev) {
			this.val = val;
			this.prev = prev;
		}
	}

	int N, M;
	int ketasuu;
	Set<Integer> A;
	int[] cost = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 };
	int[] dp;
	int keta = 0;

	Main() {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		M = Integer.parseInt(tokens[1]);
		A = new HashSet<>();
		tokens = in.nextLine().split(" ");
		for (int i = 0; i < M; ++i) {
			A.add(Integer.parseInt(tokens[i]));
		}
		in.close();
	}

	void calcKeta() {
		dp = new int[N + 1];
		Arrays.fill(dp, -1);
		dp[0] = 0;
		for (int i = 1; i <= N; ++i) {
			for (Integer a : A) {
				if (i - cost[a] >= 0) {
					dp[i] = Math.max(dp[i], dp[i - cost[a]] + 1);
				}
			}
		}
		keta = dp[N];
	}

	void show() {
		List<Integer> list = new ArrayList<>();
		int n = N;
		for (int i = 0; i < keta; ++i) {
			int num = -1;
			for (Integer a : A) {
				if (n >= cost[a] && dp[n] - dp[n - cost[a]] == 1) {
					num = Math.max(num, a);
				}
			}
			list.add(num);
			n -= cost[num];
		}
		Collections.sort(list, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 < o2) {
					return 1;
				} else if (o1 > o2) {
					return -1;
				} else {
					return 0;
				}
			}
		});
		StringBuilder strBuilder = new StringBuilder();
		for (int i = 0; i < list.size(); ++i) {
			strBuilder.append(Integer.toString(list.get(i)));
		}
		System.out.println(strBuilder.toString());
	}

	public static void main(String[] args) {
		Main ins = new Main();
		ins.calcKeta();
		ins.show();
	}
}