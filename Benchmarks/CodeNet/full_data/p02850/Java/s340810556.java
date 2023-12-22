import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		ArrayList<ArrayList<Pair>> edge = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			edge.add(new ArrayList<>());
		}

		for (int i = 0; i < n - 1; i++) {
			String str[] = br.readLine().split(" ");
			int a = Integer.parseInt(str[0]) - 1;
			int b = Integer.parseInt(str[1]) - 1;

			edge.get(a).add(new Pair(i, b));
			edge.get(b).add(new Pair(i, a));
		}
		int max = 0;
		for (int i = 0; i < n; i++) {
			max = Math.max(max, edge.get(i).size());
		}

		ArrayList<Integer> ans = new ArrayList<>();

		for (int i = 0; i < n - 1; i++) {
			ans.add(-1);
		}

		dfs(0, -1, -1, edge, ans);

		System.out.println(max);
		for (int i : ans) {
			System.out.println(i);
		}
	}

	static void dfs(int now, int p, int pcolor, ArrayList<ArrayList<Pair>> edge, ArrayList<Integer> ans) {
		int color = 1;
		if (color == pcolor)
			color++;

		for (int i = 0; i < edge.get(now).size(); i++) {
			int next = edge.get(now).get(i).to;
			if (next == p) {
				continue;
			}
			ans.set(edge.get(now).get(i).id, color);
			dfs(next, now, color, edge, ans);
			++color;
			if (color == pcolor)
				++color;
		}
	}
}

class Pair {
	int id;
	int to;

	public Pair(int id, int to) {
		this.id = id;
		this.to = to;
	}
}