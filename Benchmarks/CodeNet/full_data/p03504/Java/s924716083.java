
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	void solve(int N, int C, int[] s, int[] t, int[] c) {
		PriorityQueue<Double> pq = new PriorityQueue();
		int res = 0;
		int ans = 0;
		for (int i = 0; i < s.length; ++i) {
			while (!pq.isEmpty() && pq.peek() <= s[i]) {
				++res;
				pq.poll();
			}
			if (res == 0) {
				++ans;
				++res;
			}
			pq.add((double) t[i] + 0.5);
			--res;
		}
		System.out.println(ans);
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int C = sc.nextInt();
		int[] s = new int[N];
		int[] t = new int[N];
		int[] c = new int[N];
		for (int i = 0; i < N; ++i) {
			s[i] = sc.nextInt();
			--s[i];
			t[i] = sc.nextInt();
			--t[i];
			c[i] = sc.nextInt();
			--c[i];
		}

		int[][] a = new int[N][3];
		for (int i = 0; i < N; ++i) {
			a[i][0] = s[i];
			a[i][1] = t[i];
			a[i][2] = c[i];
		}
		Arrays.sort(a, new Comparator<int[]>() {
			@Override
			public int compare(int[] arg0, int[] arg1) {
				return Integer.compare(arg0[0], arg1[0]);
			}
		});
		for (int i = 0; i < N; ++i) {
			s[i] = a[i][0];
			t[i] = a[i][1];
			c[i] = a[i][2];
		}
		ArrayList[] slist = new ArrayList[C];
		ArrayList[] tlist = new ArrayList[C];
		for (int i = 0; i < C; ++i) {
			slist[i] = new ArrayList<Integer>();
			tlist[i] = new ArrayList<Integer>();
		}
		for (int i = 0; i < N; ++i) {
			slist[c[i]].add(s[i]);
			tlist[c[i]].add(t[i]);
		}
		int p = 0;
		for (int i = 0; i < C; ++i) {
			for (int j = 0; j < slist[i].size(); ++j) {
				int k = j;
				while (k + 1 < slist[i].size() && tlist[i].get(k) == slist[i].get(k + 1))
					++k;
				a[p][0] = (int) slist[i].get(j);
				a[p][1] = (int) tlist[i].get(k);
				a[p][2] = i;
				++p;
				j = k;
			}
		}
		int[][] b = new int[p][3];
		for (int i = 0; i < p; ++i) {
			for (int j = 0; j < 3; ++j) {
				b[i][j] = a[i][j];
			}
		}
		a = b;
		Arrays.sort(a, new Comparator<int[]>() {
			@Override
			public int compare(int[] arg0, int[] arg1) {
				return Integer.compare(arg0[0], arg1[0]);
			}
		});
		for (int i = 0; i < p; ++i) {
			s[i] = a[i][0];
			t[i] = a[i][1];
			c[i] = a[i][2];
		}
		s = Arrays.copyOf(s, p);
		t = Arrays.copyOf(t, p);
		c = Arrays.copyOf(c, p);
		solve(N, C, s, t, c);
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
