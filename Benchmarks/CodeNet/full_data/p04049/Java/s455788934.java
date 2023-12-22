import java.util.*;
import java.io.*;
import java.awt.geom.*;
import java.math.*;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);
	static boolean debug = false;

	static int[][] undirectedGraph(int n, int[] v1, int[] v2) {
		int[] cnt = new int[n];
		for (int i : v1) cnt[i]++;
		for (int i : v2) cnt[i]++;

		int[][] g = new int[n][];
		for (int i=0; i<n; i++) g[i] = new int[cnt[i]];
		for (int i=0; i<v1.length; i++) {
			int s = v1[i];
			int t = v2[i];
			g[s][--cnt[s]] = t;
			g[t][--cnt[t]] = s;
		}

		return g;
	}

	static int p = 0, q = 0;
	static int[] cnt;
	static boolean[] removed;

	static int doubleSweep(int[][] g, int n) {
        int[] d = new int[n];

        doubleSweepBfs(g,d,0);
        int max = 0;
        int t = 0;
        for (int i=0; i<n; i++) {
            if (d[i] == Integer.MAX_VALUE/2 || removed[i]) continue;
            if (max < d[i]) {
                max = d[i];
                t = i;
            }
        }

        doubleSweepBfs(g,d,t);
        p = t;
        max = 0;
        for (int i=0; i<n; i++) {
            if (d[i] == Integer.MAX_VALUE/2 || removed[i]) continue;
            if (max < d[i]) {
            	max = d[i];
            	q = i;
            }
        }

        return max;
    }

    static void doubleSweepBfs(int[][] g,int[] d, int s) {
        Arrays.fill(d,Integer.MAX_VALUE/2);
        ArrayDeque<Integer> que = new ArrayDeque<Integer>();
        que.add(s);
        d[s] = 0;
        while (!que.isEmpty()) {
            int cur = que.pollFirst();
            for (int to : g[cur]) {
            	if (removed[to]) continue;
                if (d[to] == Integer.MAX_VALUE/2) {
                    d[to] = d[cur] + 1;
                    que.add(to);
                }
            }
        }
    }


    static int rec(int[][] g, int cur, int prev) {
    	int res = 0;
    	for (int to : g[cur]) {
    		if (to == prev || removed[to]) continue;
    		res += rec(g, to, cur);
    	}
    	return cnt[cur] = Math.min(cnt[cur], res + 1);
    }


	static void solve() {
		int n = in.nextInt();
		int k = in.nextInt();
		removed = new boolean[n];
		int[] s = new int[n-1];
		int[] t = new int[n-1];
		for (int i=0; i<n-1; i++) {
			s[i] = in.nextInt() - 1;
			t[i] = in.nextInt() - 1;
		}

		int[][] g = undirectedGraph(n, s, t);
		int x = doubleSweep(g,n);
		if (x <= k) {
			out.println("0");
			return;
		}

		cnt = new int[n];
		Arrays.fill(cnt, Integer.MAX_VALUE/2);
		for (int i=0; i<n; i++) {
			rec(g, i, -1);
		}

		int ans = 0;
		while (true) {

			for (int to : g[p]) {
				if (!removed[to]) {
					p = to;
					break;
				}
			}
			for (int to : g[q]) {
				if (!removed[to]) {
					q = to;
					break;
				}
			}

			if (cnt[p] < cnt[q]) {
				ans += cnt[p] - 1;
				for (int to : g[p]) {
					if (cnt[to] == 1) {
						removed[to] = true;
					}
				}
			} else {
				ans += cnt[q] - 1;
				for (int to : g[q]) {
					if (cnt[to] == 1) {
						removed[to] = true;
					}
				}
			}
			int m = doubleSweep(g, n);
			if (m <= k) {
				out.println(ans);
				return;
			}
			for (int i=0; i<n; i++) {
				rec(g, i, -1);
			}
		}
	}

	public static void main(String[] args) {
		debug = args.length > 0;
		long start = System.nanoTime();

		solve();
		out.flush();

		long end = System.nanoTime();
		dump((end - start) / 1000000 + " ms");
		in.close();
		out.close();
	}

	static void dump(Object... o) { if (debug) System.err.println(Arrays.deepToString(o)); }
}