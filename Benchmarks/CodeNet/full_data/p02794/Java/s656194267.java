import java.util.*;

class Main {
	Scanner sc;
	int N, M;
	List<int[]>[] to;
	long[] p;
	
	@SuppressWarnings("unchecked")
	private void calc() {
		sc = new Scanner(System.in);
		N = sc.nextInt();
		to = new List[N];
		for (int i = 0; i < N; i++) to[i] = new ArrayList<>();
		for (int i = 0; i < N-1; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			to[a].add(new int[] {b, i});
			to[b].add(new int[] {a, i});
		}
		M = sc.nextInt();
		p = new long[M];
		for (int i = 0; i < M; i++) {
			int u = sc.nextInt() - 1;
			int v = sc.nextInt() - 1;
			p[i] = pathToLong(u, v);
		}

		long s = 0;
		for (int i = 0; i < (1<<M); i++) {
			long c = 0;
			for (int j = 0; j < M; j++) {
				if ( (i&(1<<j)) > 0 ) c |= p[j];
			}
			int bitCount = Integer.bitCount(i);
			s += ((bitCount%2 == 0)?1:-1)*(1L << (N-1-Long.bitCount(c)));
		}
		
		System.out.println(s);
	}

	private long pathToLong(int u, int v) {
		return dfs(u, u, v);
	}

	private long dfs(int src, int curr, int dest) {
		for (int[] v : to[curr]) {
			if (v[0] == src) continue;
			if (v[0] == dest) return (1L << v[1]);
			long f = dfs(curr, v[0], dest);
			if (f > 0) return f | (1L << v[1]);
		}
		return 0;
	}
	
	public static void main(String[] args) {
		new Main().calc();
	}
}
