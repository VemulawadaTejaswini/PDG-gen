import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	static int n;
	static List<List<Integer>> list;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		n = Integer.parseInt(sa[0]);
		list = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<>());
		}
		for (int i = 0; i < n - 1; i++) {
			sa = br.readLine().split(" ");
			int x = Integer.parseInt(sa[0]) - 1;
			int y = Integer.parseInt(sa[1]) - 1;
			list.get(x).add(y);
			list.get(y).add(x);
		}
		br.close();

		if (dfs(0, -1) == 1) {
			System.out.println("Bob");
		} else {
			System.out.println("Alice");
		}
	}

	static int dfs(int x, int p) {
		int ret = 0;
		for (int next : list.get(x)) {
			if (next != p) {
				int c = dfs(next, x);
				ret ^= c;
			}
		}
		return ret + 1;
	}
}
