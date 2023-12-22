import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	static int ans = Integer.MAX_VALUE;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);

		sa = br.readLine().split(" ");
		Node[] arr = new Node[n];
		for (int i = 0; i < n; i++) {
			Node o = new Node();
			o.i = i;
			o.d = Integer.parseInt(sa[i]);
			arr[i] = o;
		}

		Hen[] hens = new Hen[m];
		List<List<Hen>> list = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<>());
		}
		for (int i = 0; i < m; i++) {
			sa = br.readLine().split(" ");
			int u = Integer.parseInt(sa[0]) - 1;
			int v = Integer.parseInt(sa[1]) - 1;
			Hen h = new Hen();
			h.i = i;
			h.u = u;
			h.v = v;
			hens[i] = h;
			list.get(u).add(h);
			list.get(v).add(h);
		}
		br.close();

		Node[] arr2 = new Node[n];
		System.arraycopy(arr, 0, arr2, 0, n);
		Arrays.parallelSort(arr2, (o1, o2) -> o1.d - o2.d);

		for (int i = 0; i < n; i++) {
			int u = arr2[i].i;
			List<Hen> nexts = new ArrayList<>();
			for (Hen h : list.get(u)) {
				int v = h.u;
				if (v == u) {
					v = h.v;
				}
				Node next = arr[v];
				if (next.c != 0) {
					nexts.add(h);
				}
			}
			Node cur = arr[u];
			for (Hen h : nexts) {
				if (cur.c == 0) {
					int v = h.u;
					if (v == u) {
						v = h.v;
					}
					Node next = arr[v];
					cur.c = 3 - next.c;
					h.w = cur.d;
				} else {
					h.w = cur.d + 1;
				}
			}
			if (cur.c == 0) {
				cur.c = 1;
			}
		}

		for (Hen h : hens) {
			Node u = arr[h.u];
			Node v = arr[h.v];
			if (u.c != v.c) {
				u.min = Math.min(u.min, h.w);
				v.min = Math.min(v.min, h.w);
			}
		}

		StringBuilder sb = new StringBuilder();
		for (Node o : arr) {
			if (o.min != o.d) {
				System.out.println(-1);
				return;
			}
			if (o.c == 1) {
				sb.append('B');
			} else {
				sb.append('W');
			}
		}
		PrintWriter pw = new PrintWriter(System.out);
		pw.println(sb.toString());
		for (Hen h : hens) {
			pw.println(h.w);
		}
		pw.flush();
	}

	static class Node {
		int i, d, c;
		int min = Integer.MAX_VALUE;
	}

	static class Hen {
		int i, u, v, w;
	}
}
