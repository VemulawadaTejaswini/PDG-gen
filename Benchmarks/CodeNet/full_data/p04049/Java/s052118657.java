import java.util.ArrayList;
import java.util.BitSet;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static ArrayList<ArrayList<Integer>> g = new ArrayList<>();
	static int N, K;

	public static void main(String[] args) {
		N = sc.nextInt();
		K = sc.nextInt();
		for (int i = 0; i < N; ++i) {
			g.add(new ArrayList<>());
		}
		for (int i = 0; i < N - 1; ++i) {
			int A = sc.nextInt() - 1;
			int B = sc.nextInt() - 1;
			g.get(A).add(B);
			g.get(B).add(A);
		}
		int ans = N;
		ArrayList<Integer> cands = farest(0);
		for (int cand : cands) {
			ans = Math.min(ans, count(cand));
		}
		System.out.println(ans);
	}

	static ArrayList<Integer> farest(int idx) {
		BitSet visited = new BitSet(N);
		ArrayList<Integer> cur = new ArrayList<>();
		cur.add(idx);
		visited.set(idx);
		while (true) {
			ArrayList<Integer> next = new ArrayList<>();
			for (int node : cur) {
				for (int n : g.get(node)) {
					if (visited.get(n)) continue;
					next.add(n);
					visited.set(n);
				}
			}
			if (next.isEmpty()) return cur;
			cur = next;
		}
	}

	static int count(int idx) {
		int count = 1;
		BitSet visited = new BitSet(N);
		ArrayList<Integer> cur = new ArrayList<>();
		cur.add(idx);
		visited.set(idx);
		for (int i = 0; i < K && !cur.isEmpty(); ++i) {
			ArrayList<Integer> next = new ArrayList<>();
			for (int node : cur) {
				for (int n : g.get(node)) {
					if (visited.get(n)) continue;
					next.add(n);
					visited.set(n);
					++count;
				}
			}
			cur = next;
		}
		return N - count;
	}

}
