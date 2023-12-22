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
		for (int i = 0; i < N - 1; i++) {
			int A = sc.nextInt() - 1;
			int B = sc.nextInt() - 1;
			g.get(A).add(B);
			g.get(B).add(A);
		}
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < N; i++) {
			Partial res = dfs(i, -1);
//			System.err.println(i + " " + res.max + " " + res.min + " " + res.count);
			if (res.min == 0) {
				ans = Math.min(ans, res.max / 2);
			}
		}
		System.out.println(ans == Integer.MAX_VALUE ? -1 : ans);
	}

	static Partial dfs(int cur, int from) {
		Partial ret = new Partial(0, 0, 0);
		Partial minMax = null;
		int minSum = 0;
		int diffSum = 0;
		for (int i = 0; i < g.get(cur).size(); i++) {
			int n = g.get(cur).get(i);
			if (n == from) continue;
			Partial p = dfs(n, cur);
			minSum += p.min + p.count;
			ret.max += p.max + p.count;
			ret.count += p.count;
			diffSum += p.max - p.min;
			if (minMax == null || p.min + p.count > minMax.min) {
				p.max += p.count;
				p.min += p.count;
				minMax = p;
			}
		}
		if (minMax == null) {
			//
		} else if (minMax.min > minSum - minMax.min) {
			diffSum -= minMax.max - minMax.min;
			int rest = minMax.min - (minSum - minMax.min);
			if (rest < diffSum) {
				ret.min = rest % 2;
			} else {
				ret.min = rest - diffSum;
			}
		} else {
			ret.min = minSum % 2;
		}
		if (S[cur]) {
			ret.count += 1;
		}
//		System.err.println(cur + " " + ret.max + " " + ret.min + " " + ret.count);
		return ret;
	}

	static class Partial {
		int min, max, count;

		public Partial(int min, int max, int count) {
			this.min = min;
			this.max = max;
			this.count = count;
		}
	}

}
