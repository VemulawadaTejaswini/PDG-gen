import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<ArrayList<Integer>> g = new ArrayList<>();
	static int N;
	static boolean[] S;

	public static void main(String[] args) {
		N = sc.nextInt();
		char[] s = sc.next().toCharArray();
		S = new boolean[N];
		for (int i = 0; i < N; i++) {
			S[i] = s[i] == '1';
		}
		for (int i = 0; i < N; i++) {
			g.add(new ArrayList<>());
		}
		for (int i = 0; i < N-1; i++) {
			int A = sc.nextInt() - 1;
			int B = sc.nextInt() - 1;
			g.get(A).add(B);
			g.get(B).add(A);
		}
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < N; i++) {
			int sum = 0;
			int max = 0;
			for (int n : g.get(i)) {
				int c = dfs(n, i, 1);
				sum += c;
				max = Math.max(max, c);
			}
			if (sum % 2 == 0 && max * 2 <= sum) {
				ans = Math.min(ans, sum / 2);
			}
		}
		System.out.println(ans == Integer.MAX_VALUE ? -1 : ans);
	}

	static int dfs(int cur, int from, int depth) {
		int ret = S[cur] ? depth : 0;
		for (int n : g.get(cur)) {
			if (n == from) continue;
			ret += dfs(n, cur, depth + 1);
		}
		return ret;
	}

}
