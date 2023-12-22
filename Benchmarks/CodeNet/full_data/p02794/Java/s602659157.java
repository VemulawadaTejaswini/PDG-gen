import java.math.*;
import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws FileNotFoundException {
		new Main().run();
	}

	ArrayList<Integer>[] g;
	int[] parent;
	int[] height;
	int[][] lca;

	void dfs(int cur, int par) {
		parent[cur] = par;
		for (int dst : g[cur]) {
			if (dst == par)
				continue;
			height[dst] = height[cur] + 1;
			dfs(dst, cur);
		}
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		lca = new int[N][N];
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < N; ++i)
			for (int j = 0; j < N; ++j) {
				lca[i][j] = -1;
			}
		g = new ArrayList[N];
		parent = new int[N];
		height = new int[N];
		int[] A = new int[N - 1];
		int[] B = new int[N - 1];
		Arrays.fill(parent, -1);
		for (int i = 0; i < N; ++i)
			g[i] = new ArrayList<Integer>();
		for (int i = 0; i < N - 1; ++i) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			--a;
			--b;
			g[a].add(b);
			g[b].add(a);
			A[i] = a;
			B[i] = b;
		}
		dfs(0, -1);
		{
			for (int u = 0; u < N; ++u) {
				for (int v = 0; v < N; ++v) {
					int curu = u;
					int curv = v;
					while (curu != curv) {
						if (height[curu] < height[curv]) {
							curu ^= curv;
							curv ^= curu;
							curu ^= curv;
						}
						curu = parent[curu];
					}
					lca[u][v] = curu;
				}
			}
			for (int h = N; h >= 0; --h) {
				for (int i = 0; i < N; ++i) {
					if (height[i] == h) {
						list.add(i);
					}
				}
			}
		}
		int M = sc.nextInt();
		int[] u = new int[M];
		int[] v = new int[M];
		for (int i = 0; i < M; ++i) {
			u[i] = sc.nextInt();
			v[i] = sc.nextInt();
			--u[i];
			--v[i];
		}
		long ans = 0;
		for (int s = 0; s < (1 << M); ++s) {
			int[] w = new int[N];
			for (int shift = 0; shift < M; ++shift) {
				if ((s >> shift) % 2 == 0)
					continue;
				int common = lca[u[shift]][v[shift]];
				w[u[shift]]++;
				w[v[shift]]++;
				w[common]--;
				w[common]--;
			}
			int ng = 0;
			for(int i=0;i<list.size();++i) {
				int cur=list.get(i);
				if(cur==0)continue;
				w[parent[cur]]+=w[cur];
				if(w[cur]>0) {
					++ng;
				}
			}
			int ok=N-1-ng;
			ans += (Integer.bitCount(s) % 2 == 0 ? 1 : -1) * (1L << ok);
		}
		System.out.println(ans);
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
