import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//AtCoder Beginner Contest 157
//D - Friend Suggestions
public class Main {

	static boolean[] seen;
	static void dfs(List<List<Integer>> g, int i) {
		seen[i] = true;

		List<Integer> vList = g.get(i);
		for (Integer v : vList) {
			if (seen[v])
				continue;
			dfs(g, v);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		List<List<Integer>> g = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			g.add(new ArrayList<>());
		}
		for (int i = 0; i < M; i++) {
			int A = Integer.valueOf(sc.next()) - 1;
			int B = Integer.valueOf(sc.next()) - 1;
			g.get(A).add(B);
			g.get(B).add(A);
		}

		List<List<Integer>> block = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			block.add(new ArrayList<>());
		}
		for (int i = 0; i < K; i++) {
			int C = Integer.valueOf(sc.next()) - 1;
			int D = Integer.valueOf(sc.next()) - 1;
			block.get(C).add(D);
			block.get(D).add(C);
		}
		sc.close();

		List<Integer> ans = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			seen = new boolean[N];
			dfs(g, i);

			seen[i] = false;
			for (int f = 0; f < g.get(i).size(); f++) {
				seen[g.get(i).get(f)] = false;
			}
			for (int k = 0; k < block.get(i).size(); k++) {
				seen[block.get(i).get(k)] = false;
			}
			int a = 0;
			for (int b = 0; b < N; b++) {
				if (seen[b]) {
					a++;
				}
			}
			ans.add(a);
		}
		for (Integer i : ans) {
			System.out.print(i + " ");
		}
	}
}
