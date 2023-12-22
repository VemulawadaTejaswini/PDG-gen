import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
	static int n;
	static int[] c, work;
	static boolean[] exist;
	static long[] rem;
	static List<List<Integer>> list;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		n = Integer.parseInt(sa[0]);
		sa = br.readLine().split(" ");
		c = new int[n];
		work = new int[n];
		exist = new boolean[n];
		for (int i = 0; i < n; i++) {
			int col = Integer.parseInt(sa[i]) - 1;
			c[i] = col;
			exist[col] = true;
		}

		list = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<>());
		}
		for (int i = 0; i < n - 1; i++) {
			sa = br.readLine().split(" ");
			int a = Integer.parseInt(sa[0]) - 1;
			int b = Integer.parseInt(sa[1]) - 1;
			list.get(a).add(b);
			list.get(b).add(a);
		}
		br.close();

		rem = new long[n];
		dfs(0, -1, 0);
		for (int i = 0; i < n; i++) {
			long val = n - work[i];
			rem[i] += val * (val + 1) / 2;
		}
		long total = (long) n * (n + 1) / 2;

		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < n; i++) {
			if (exist[i]) {
				pw.println(total - rem[i]);
			} else {
				pw.println(0);
			}
		}
		pw.flush();
	}

	static void dfs(int x, int p, int inSize) {
		int size = inSize;
		for (int next : list.get(x)) {
			if (next != p) {
				int befnext = work[c[next]];
				int befcur = work[c[x]];
				dfs(next, x, befnext);
				int total = work[c[next]] - befnext;
				long val = total - (work[c[x]] - befcur);
				rem[c[x]] += val * (val + 1) / 2;
				size += total;
			}
		}
		size++;
		work[c[x]] = size;
	}
}
