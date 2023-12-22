import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static int[] res;
	static ArrayList<Integer>[] eda;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());

		eda = new ArrayList[N + 1];
		for (int i = 1; i <= N; i++) {
			eda[i] = new ArrayList<Integer>();
		}
		for (int i = 1; i <= N - 1; i++) {
			int u = Integer.parseInt(sc.next());
			int v = Integer.parseInt(sc.next());
			int w = Integer.parseInt(sc.next());
			eda[u].add(v);
			eda[v].add(u);
		}

		sc.close();

		res = new int[N + 1];
		dfs(1, -1);

		for (int i = 1; i <= N; i++) {
			System.out.println(res[i] == 1 ? "1" : "0");
		}

	}

	private static void dfs(int i, int color) {
		color = -color;
		res[i] = color;
		for (int j : eda[i]) {
			if (res[j] != 0)
				continue;
			dfs(j, color);
		}
	}
}
