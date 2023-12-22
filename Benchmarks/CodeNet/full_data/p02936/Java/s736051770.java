import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static long[] ans;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int Q = in.nextInt();
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>() {
			{
				for (int i = 0; i < N; i++) {
					add(new ArrayList<Integer>());
				}
			}
		};
		for (int i = 0; i < N - 1; i++) {
			list.get(in.nextInt() - 1).add(in.nextInt() - 1);
		}
		ans = new long[N];
		for (int i = 0; i < Q; i++) {
			ans[in.nextInt() - 1] += in.nextInt();
		}
		dfs(list, 0, -1);
		for (int i = 0; i < ans.length; i++) {
			if (i == ans.length - 1) {
				System.out.println(ans[i]);
			} else {
				System.out.print(ans[i] + " ");
			}
		}
		in.close();
	}

	static void dfs(ArrayList<ArrayList<Integer>> list, int v, int p) {
		if (p != -1) {
			ans[v] += ans[p];
		}
		for (Integer nv : list.get(v)) {
			dfs(list, nv, v);
		}
	}
}