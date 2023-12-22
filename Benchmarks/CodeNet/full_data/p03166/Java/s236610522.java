import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int M = sc.nextInt();
		ArrayList<ArrayList<Integer>> g = new ArrayList<>();
		int[] in = new int[N];
		for (int i = 0; i < N; i++) {
			g.add(new ArrayList<>());
		}
		for (int i = 0; i < M; i++) {
			int x = sc.nextInt() - 1;
			int y = sc.nextInt() - 1;
			g.get(x).add(y);
			in[y]++;
		}
		ArrayList<Integer> q = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			if (in[i] == 0) q.add(i);
		}
		int[] dp = new int[N];
		for (int i = 0; i < q.size(); i++) {
			int parent = q.get(i);
			for (int child : g.get(parent)) {
				dp[child] = Math.max(dp[child], dp[parent] + 1);
				in[child]--;
				if (in[child] == 0) {
					q.add(child);
				}
			}
		}
		int ans = 0;
		for (int i = 0; i < N; i++) {
			ans = Math.max(ans, dp[i]);
		}
		System.out.println(ans);
	}


}