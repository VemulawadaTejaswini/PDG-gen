import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
	static List<List<Hen>> list;
	static boolean[] visit;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		list = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<>());
		}
		Hen[] arr = new Hen[m];
		for (int i = 0; i < m; i++) {
			sa = br.readLine().split(" ");
			Hen h = new Hen();
			h.a = Integer.parseInt(sa[0]) - 1;
			h.b = Integer.parseInt(sa[1]) - 1;
			list.get(h.a).add(h);
			list.get(h.b).add(h);
			arr[i] = h;
		}
		br.close();

		if (m % 2 == 1) {
			System.out.println(-1);
			return;
		}

		visit = new boolean[n];
		dfs(0, -1);

		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < m; i++) {
			pw.println(++arr[i].c + " " + ++arr[i].d);
		}
		pw.flush();
	}

	static void dfs(int x, int p) {
		visit[x] = true;
		for (Hen h : list.get(x)) {
			int ch = h.a;
			if (ch == x) {
				ch = h.b;
			}
			if (!visit[ch] && ch != p) {
				dfs(ch, x);
			}
		}

		int cnt = 0;
		List<Hen> work = new ArrayList<>();
		for (Hen h : list.get(x)) {
			if (h.d == -1) {
				work.add(h);
			} else {
				if (h.c == x) {
					cnt++;
				}
			}
		}

		for (Hen h : work) {
			int ch = h.a;
			if (ch == x) {
				ch = h.b;
			}
			h.c = x;
			h.d = ch;
		}
		if (cnt % 2 != work.size() % 2) {
			Hen h = work.get(0);
			int tmp = h.c;
			h.c = h.d;
			h.d = tmp;
		}
	}

	static class Hen {
		int a, b, c, d = -1;
	}
}
