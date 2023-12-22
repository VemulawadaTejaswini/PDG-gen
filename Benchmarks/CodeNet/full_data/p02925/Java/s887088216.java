import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int[][] a = new int[n][n - 1];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n - 1; j++) {
				a[i][j] = getMatch(n, i + 1, in.nextInt());
			}
		solve(n, a);
		in.close();
	}

	static HashMap<Integer, ArrayList<Integer>> nx = new HashMap<>();
	static int[] hist;

	private static void solve(int n, int[][] a) {
		for (int i = 0; i < n; i++)
			for (int j = 1; j < n - 1; j++)
				store(a[i][j - 1], a[i][j]);
		int last = 0;
		hist = new int[n * (n - 1) / 2 + 1];
		for (int i = 0; i < n; i++) {
			boolean[] loop = new boolean[n * (n - 1) / 2 + 1];
			int d = lastDays(a[i][0], loop);
			if (d < 0) {
				last = -1;
				break;
			}
			if (d > last)
				last = d;
		}
		System.out.println(last);
	}

	private static int lastDays(int r, boolean[] loop) {
		if (hist[r] > 0)
			return hist[r];
		if (loop[r])
			return -1;
		loop[r] = true;
		if (!nx.containsKey(r))
			return 1;
		int m = 0;
		for (int t : nx.get(r)) {
			int f = lastDays(t, loop);
			if (f < 0)
				return -1;
			if (f > m)
				m = f;
		}
		loop[r] = false;
		hist[r] = m + 1;
		return m + 1;
	}

	private static void store(int x, int y) {
		if (nx.containsKey(x))
			nx.get(x).add(y);
		else {
			ArrayList<Integer> t = new ArrayList<>();
			t.add(y);
			nx.put(x, t);
		}
	}

	private static int getMatch(int n, int x, int y) {
		if (x < y)
			return (x - 1) * n + y - x * (x + 1) / 2;
		else
			return (y - 1) * n + x - y * (y + 1) / 2;
	}
}
