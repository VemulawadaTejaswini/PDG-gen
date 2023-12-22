import java.util.Scanner;

public class Main {
	static int[] w;
	static int[] v;
	static int N;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().split(" ");
		N = Integer.parseInt(line[0]);
		int W = Integer.parseInt(line[1]);

		w = new int[N];
		v = new int[N];
		for (int i = 0; i < N; i++) {
			line = sc.nextLine().split(" ");
			w[i] = Integer.parseInt(line[0]);
			v[i] = Integer.parseInt(line[1]);
		}

		System.out.println(dfs(0, W));
	}

	static long dfs(int i, int rem) {
		long res;

		if (i == N) {
			res = 0;
		}
		else if (rem < w[i]) {
			res = dfs(i + 1, rem);
		}
		else {
			res = Math.max(dfs(i + 1, rem), dfs(i + 1, rem - w[i]) + v[i]);
		}

		return res;
	}
}