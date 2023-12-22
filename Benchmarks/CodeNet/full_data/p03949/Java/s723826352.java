import java.util.*;

class SimpleAdjListGraph {
	int m, V, E;
	int[] head, next, to;

	public SimpleAdjListGraph(int V, int E) {
		head = new int[V];
		next = new int[E];
		to = new int[E];
		this.V = V;
		this.E = E;
		clear();
	}

	public void clear() {
		m = 0;
		Arrays.fill(head, -1);
	}

	public void addEdge(int s, int t) {
		next[m] = head[s];
		head[s] = m;
		to[m++] = t;
	}
}

class WeightedAdjListGraph {
	int m, V, E;
	int[] head, next, cost, to;

	public WeightedAdjListGraph(int V, int E) {
		head = new int[V];
		next = new int[E];
		cost = new int[E];
		to = new int[E];
		this.V = V;
		this.E = E;
		clear();
	}

	public void clear() {
		m = 0;
		Arrays.fill(head, -1);
	}

	public void addEdge(int s, int t, int c) {
		next[m] = head[s];
		cost[m] = c;
		head[s] = m;
		to[m++] = t;
	}
}


class AdjListGraph {
	int m, V, E;
	int[] head, next, from, to, cost, size, childSize;

	public AdjListGraph(int V, int E) {
		head = new int[V];
		size = new int[V];
		childSize = new int[V];
		cost = new int[E];
		next = new int[E];
		from = new int[E];
		to = new int[E];
		this.V = V;
		this.E = E;
		clear();
	}

	public void clear(int v) {
		m = 0;
		for(int i = 0; i < v; i++) {
			head[i] = -1;
		}
	}

	public void clear() {
		m = 0;
		Arrays.fill(head, -1);
		Arrays.fill(size, 0);
	}

	public void addEdge(int s, int t, int c) {
		next[m] = head[s];
		cost[m] = c;
		head[s] = m;
		from[m] = s;
		to[m++] = t;
		size[s]++;
	}

	// shukuyaku
	public void shrink(final int u, final int v) {
		;
	}
	
	// 部分木のサイズカウント（非再帰）
	public void calcChildSize(int root) {
		int[] st = new int[2*V+100];
		Arrays.fill(childSize, -1);
		int sp = 0;
		st[sp++] = root;
		while(sp != 0) {
			int v = st[--sp];
			if(childSize[v] == -1) {
				childSize[v] = 0;
				st[sp++] = v;
				for(int e = head[v]; e != -1; e = next[e]) {
					final int t = to[e];
					if(childSize[t] == -1) {
						st[sp++] = t;
					}
				}
			}
			else {
				for(int e = head[v]; e != -1; e = next[e]) {
					final int t = to[e];
					if(childSize[t] > 0) {
						childSize[v] += childSize[t];
					}
				}
				childSize[v]++;
			}
		}
	}
	
	/*
	// 関節点，二重頂点連結成分分解
	// http://www.prefield.com/algorithm/graph/articulation_point.html
	void articulationPoint(List<Integer> art, List<Set<Integer>> bcomp) {
		final int n = head.length;
		final int[] low = new int[n];
		final int[] num = new int[n];
		Stack<Integer> s = new Stack<Integer>();
		for(int i = 0; i < n; i++) if(num[i] == 0) {
			int time = 0;
			visitArticulationPoint(i, -1, art, bcomp, s, num, low, time);
		}
	}

	private void visitArticulationPoint(int v, int u, List<Integer> art,
			List<Set<Integer>> bcomp, Stack<Integer> s, final int[] num, final int[] low,
			int time) {
		low[v] = num[v] = ++time;
		for(int e = head[v]; e != -1; e = next[e]) {
			int w = to[e];
			if(num[w] < num[v]) { s.push(e); }
			if(num[w] != 0) {
				low[v] = Math.min(low[v], num[w]);
			}
			else {
				visitArticulationPoint(w, v, art, bcomp, s, num, low, time);
				low[v] = Math.min(low[v], low[w]);
				if(num[v] == 1 && num[w] != 2 || num[v] != 1 && low[w] >= num[v]) {
					art.add(v);
				}
				if(low[w] >= num[v]) {
					final int[] src = this.from;
					final int[] dst = this.to;
					Comparator<Integer> cmp = new Comparator<Integer>() {
						@Override
						public int compare(Integer o1, Integer o2) {
							final int e = o1;
							final int f = o2;
							if(Math.min(src[e], dst[e]) != Math.min(src[f], dst[f])) {
								return Math.min(src[e], dst[e]) - Math.min(src[f], dst[f]);
							}
							return Math.max(src[e], dst[e]) - Math.max(src[f], dst[f]);
						}
					};
					
					final Set<Integer> eset = new TreeSet<Integer>(cmp);
					while(true) {
						final int f = s.pop();
						eset.add(f);
						if(src[f] == v && dst[f] == w) {
							bcomp.add(eset);
							break;
						}
					}
				}
			}
		}
	}
	
	// 橋，二重辺連結成分分解
	// http://www.prefield.com/algorithm/graph/bridge.html
	void bridge(List<Integer> br, List<List<Integer>> tecomp) {
		final int n = head.length;
		int[] num = new int[n];
		boolean[] inS = new boolean[n];
		Stack<Integer> roots = new Stack<Integer>(), S = new Stack<Integer>();
		int time = 0;
		for(int i = 0; i < n; i++) if(num[i] == 0) {
			visitBridge(i, n, br, tecomp, roots, S, inS, num, time);
			br.remove(br.size() - 1);
		}
	}

	private void visitBridge(int v, int u, List<Integer> br,
			List<List<Integer>> tecomp, Stack<Integer> roots, Stack<Integer> S,
			boolean[] inS, int[] num, int time) {
		num[v] = ++time;
		S.push(v);
		inS[v] = true;
		roots.push(v);
		int eu = -1;
		for(int e = head[v]; e != -1; e = next[e]) {
			int w = to[e];
			
			if(w == u) { eu = e; }
			
			if(num[w] == 0) {
				visitBridge(w, v, br, tecomp, roots, S, inS, num, time);
			}
			else if(u != w && inS[w]) {
				while(num[roots.peek()] > num[w]) {
					roots.pop();
				}
			}
		}
		if(v == roots.peek()) {
			br.add(eu);
			List<Integer> xs = new ArrayList<Integer>();
			while(true) {
				int w = S.pop();
				inS[w] = false;
				xs.add(w);
				if(v == w) break;
			}
			tecomp.add(xs);
			roots.pop();
		}
	}
	
	// 橋，二重辺連結成分分解（非再帰版）
	// http://www.prefield.com/algorithm/graph/bridge.html
	List<Integer> br;
	List<List<Integer>> tecomp;
	Stack<Integer> roots;
	Stack<Integer> S;
	boolean[] inS;
	int[] num;
	int[] stv;
	int[] stu;
	int[] stt;
	int[] parent;
	void bridgeNoRec(List<Integer> br, List<List<Integer>> tecomp) {
		this.br = br;
		this.tecomp = tecomp;
		final int n = head.length;
		num = new int[n];
		inS = new boolean[n];
		roots = new Stack<Integer>();
		S = new Stack<Integer>();
		stv = new int[V+2*E];
		stu = new int[V+2*E];
		stt = new int[V+2*E];
		parent = new int[V];
		int time = 0;
		for(int i = 0; i < n; i++) if(num[i] == 0) {
			visitBridgeNoRec(i, n, time);
			br.remove(br.size() - 1);
		}
	}
	
	private void visitBridgeNoRec(int v, int u, int time) {
		int sp = 0;

		stv[sp] = v;
		stu[sp] = u;
		stt[sp] = time;
		parent[sp] = -1;
		sp++;
		
		while(sp != 0) {
			sp--;
			time = stt[sp];
			u = stu[sp];
			v = stv[sp];
			
			if(num[v] != 0) {
				int eu = -1;
				for(int e = head[v]; e != -1; e = next[e]) {
					int w = to[e];
					
					if(w == u) { eu = e; }
					if(parent[w] != v && u != w && inS[w]) {
						while(num[roots.peek()] > num[w]) {
							roots.pop();
						}
					}
				}
				if(v == roots.peek()) {
					br.add(eu);
					List<Integer> xs = new ArrayList<Integer>();
					while(true) {
						int w = S.pop();
						inS[w] = false;
						xs.add(w);
						if(v == w) break;
					}
					tecomp.add(xs);
					roots.pop();
				}
			}
			else {
				num[v] = ++time;
				S.push(v);
				inS[v] = true;
				roots.push(v);
				
				stv[sp] = v;
				stu[sp] = u;
				stt[sp] = time;
				sp++;

				for(int e = head[v]; e != -1; e = next[e]) {
					int w = to[e];
					if(num[w] == 0) {
						stv[sp] = w;
						stu[sp] = v;
						stt[sp] = time;
						parent[w] = v;
						sp++;
//						visitBridge(w, v, br, tecomp, roots, S, inS, num, time);
					}
				}
			}
		}
	}
	*/
	
	
	// 関節点、橋、（dfs treeにおける）部分木のサイズ
//	int[] deg;
	int[] parent;
//	int[] dfsDepth;
	int[] subtreeSize;
	int[] ord;
	int[] low;
	boolean[] isArticulationPoint;
	boolean[] isBridge;
	
	/*
	void dfs(int v, int p) {
		subtreeSize[v] = 1;
		for(int e = head[v]; e != -1; e = next[e]) {
			final int t = to[e];
			if(t == p) continue;
			if(vis[t]) {
				low[v] = Math.min(low[v], ord[t]);
			}
			else {
				depth[t] = depth[v] + 1;
				dfs(t, v);
				deg[v]++;
				subtreeSize[v] += subtreeSize[t];
				low[v] = Math.min(low[v], low[t]);
			}
		}
	}
	*/
	
	public void initExtraInfo() {
//		dfsDepth = new int[V];
//		deg = new int[V];
		subtreeSize = new int[V];
		parent = new int[V];
		ord = new int[V];
		low = new int[V];
		isArticulationPoint = new boolean[V];
		isBridge = new boolean[E];
		
		final int[] ei = new int[V];
		final int[] st = new int[V];
		Arrays.fill(ei, -2);
		
		for(int root = 0; root < V; root++) if(ei[root] == -2) {
			int sp = 0;
			st[sp++] = root;
			int cur = 0;
			parent[root] = -1;
			while(sp != 0) {
				final int v = st[--sp];
				if(ei[v] == -2) {
					ei[v] = head[v];
					ord[v] = cur++;
					low[v] = ord[v];
					subtreeSize[v] = 1;
				}
				if(ei[v] != -1) {
					while(ei[v] != -1 && ei[to[ei[v]]] != -2) {
						if(parent[v] != to[ei[v]]) {
							if(v != parent[to[ei[v]]]) {
								low[v] = Math.min(low[v], ord[to[ei[v]]]);
							}
							else {
								low[v] = Math.min(low[v], low[to[ei[v]]]);
								subtreeSize[v] += subtreeSize[to[ei[v]]];
							}
						}
						ei[v] = next[ei[v]];
					}

					if(ei[v] != -1) {
						st[sp++] = v;
						st[sp++] = to[ei[v]];
						parent[to[ei[v]]] = v;
//						deg[v]++;
//						deg[to[ei[v]]]++;
//						dfsDepth[to[ei[v]]] = dfsDepth[v] + 1;
					}
				}
			}
		}
		
		for(int v = 0; v < V; v++) {
			if(parent[v] == -1) {
				int cnt = 0;
				for(int e = head[v]; e != -1; e = next[e]) {
					if(parent[to[e]] == v && ++cnt > 1) {
						isArticulationPoint[v] = true;
						break;
					}
				}
			}
			else {
				for(int e = head[v]; e != -1; e = next[e]) {
					if(parent[to[e]] == v && low[to[e]] >= ord[v]) {
						isArticulationPoint[v] = true;
						break;
					}
				}
			}
			for(int e = head[v]; e != -1; e = next[e]) {
                if(parent[to[e]] == v && ord[v] < low[to[e]]) {
                    // assume undirected graph
                    isBridge[e] = isBridge[e^1] = true;
                }
			}
		}
	}
	
	int farthestVertex(final int[] dist) {
		int ret = 0;
		for(int i = 0; i < dist.length; i++) {
			if(dist[ret] < dist[i]) {
				ret = i;
			}
		}
		return ret;
	}
	
	int farthestVertex(final int[] dist, final int[] target) {
		int ret = target[0];
		for(final int t : target) {
			if(dist[ret] < dist[t]) {
				ret = t;
			}
		}
		return ret;
	}
	
	int[] farthestVertexPairOnTree(final int[] target) {
		final int[][] dist = new int[3][];
		dist[0] = bfs(0)[0];
		final int v0 = farthestVertex(dist[0], target);
		dist[1] = bfs(v0)[0];
		final int v1 = farthestVertex(dist[1], target);
		return new int[] { v0, v1, };
	}
	
	int[] farthestVertexPairOnTree() {
		final int[][] dist = new int[3][];
		dist[0] = bfs(0)[0];
		final int v0 = farthestVertex(dist[0]);
		dist[1] = bfs(v0)[0];
		final int v1 = farthestVertex(dist[1]);
		return new int[] { v0, v1, };
	}

	public int[][] bfs(final int src) {
		final int[] dist = new int[head.length];
		final int[] prev = new int[head.length];
		final int[] q = new int[2 * head.length + 10];
		int s = 0, t = 0;
		
		Arrays.fill(dist, -1);
		Arrays.fill(prev, -1);
		dist[src] = 0;
		q[t++] = src;
		while(s != t) {
			final int v = q[s++];
			for(int e = head[v]; e != -1; e = next[e]) {
				final int u = to[e];
				if(dist[u] == -1) {
					dist[u] = dist[v] + 1;
					prev[u] = v;
					q[t++] = u;
				}
			}
		}
		return new int[][] { dist, prev };
	}

	// template dfs no rec
	public int[] dfs(final int src) {
		final int[] dist = new int[head.length];
		final int[] st = new int[2 * head.length + 10];
		int sp = 0;
		
		Arrays.fill(dist, -1);
		dist[src] = 0;
		st[sp++] = src;
		while(sp != 0) {
			final int v = st[--sp];
			for(int e = head[v]; e != -1; e = next[e]) {
				final int u = to[e];
				if(dist[u] == -1) {
					dist[u] = dist[v] + 1;
					st[sp++] = u;
				}
			}
		}
		return dist;
	}

	public int[][] dijkstra(final int s) {
		final int[] dist = new int[head.length];
		final int[] prev = new int[head.length];
		final PriorityQueue<int[]> q = new PriorityQueue<int[]>(10, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
		});

		Arrays.fill(dist, Integer.MAX_VALUE);
		Arrays.fill(prev, -1);
		dist[s] = 0;
		q.add(new int[] { 0, s, });
		while(!q.isEmpty()) {
			final int[] xs = q.poll();
			final int v = xs[1];
			final int d = xs[0];
			if(dist[v] < d) continue;
			
			for(int e = head[v]; e != -1; e = next[e]) {
				final int t = to[e];
				final int w = d + cost[e];
				if(w < dist[t]) {
					dist[t] = w;
					prev[t] = v;
					q.add(new int[] { w, t, });
				}
			}
		}
		for(int i = 0; i < dist.length; i++) {
			if(dist[i] == Integer.MAX_VALUE) {
				dist[i] = -1;
			}
		}
		return new int[][] { dist, prev };
	}
	
	// vi's subtree: [retval[0][i], retval[1][i])
	int[][] eulerTour(int root) {
		int idx = 0;
		int sp = 0;
		
		final int[] st = new int[V];
		final boolean[] vis = new boolean[V];
		
		int[] s = new int[V];
		int[] t = new int[V];
		st[sp++] = root;
		while(sp != 0) {
			final int v = st[--sp];
			if(vis[v]) {
				t[v] = idx;
				continue;
			}
			vis[v] = true;
			s[v] = idx++;
			st[sp++] = v;
			for(int e = head[v]; e != -1; e = next[e]) {
				final int to = this.to[e];
				if(!vis[to]) {
					st[sp++] = to;
				}
			}
		}
		return new int[][] { s, t, };
	}

	// vi's subtree(edge): [retval[0][i], retval[1][i])
	// retval[2][i] => 1 : up edge , -1 : down edge
	int[][] eulerTourEdge(int root) {
		int sp = 0;
		
		final int[] st = new int[2*V];
		final boolean[] vis = new boolean[V];
		final int[] ei = new int[V];
		for(int i = 0; i < V; i++) {
			ei[i] = head[i];
		}
		
		int[] s = new int[V];
		int[] t = new int[V];
		int[] coeff = new int[2*V-2];	// down=1, up=-1
		st[sp++] = root;
		int eidx = 0;
		while(sp != 0) {
			final int v = st[--sp];
			if(ei[v] == head[v]) {
				vis[v] = true;
				s[v] = eidx;
			}
			else {
				coeff[eidx++] = -1;
			}
			
			while(true) {
				if(ei[v] == -1) {
					t[v] = eidx;
					break;
				}
				
				final int to = this.to[ei[v]];
				ei[v] = next[ei[v]];
				if(vis[to]) continue;
				st[sp++] = v;
				st[sp++] = to;
				coeff[eidx++] = 1;
				break;
			}
		}
		return new int[][] { s, t, coeff, };
	}

	
	// 無向グラフの最小全域木の数
	// Long
	static final int mod = (int)1e9+7;
	long spanningTreeCountLong() {
		long[][] mat = new long[V - 1][V - 1];
		for(int i = 0; i < V; i++) {
			for(int e = head[i]; e != -1; e = next[e]) {
				final int t = to[e];
				if(i != V - 1) { mat[i][i] += 1; }
				if(t != V - 1) { mat[t][t] += 1; }
				if(i != V - 1 && t != V - 1) {
					mat[i][t] -= 1;
					mat[t][i] -= 1;
				}
			}
		}
		for(long[] m : mat) for(int i = 0; i < m.length; i++) m[i] = (m[i] / 2 + mod) % mod;
		return determinant(mat);
	}
	long determinant(long[][] mat) {
		long res = 1;
//		System.err.println(Arrays.deepToString(mat));
		for(int i = 0; i < mat.length; i++) {
			for(int j = i + 1; j < mat.length; j++) {
				long c = mat[j][i] * powmod(mat[i][i], mod - 2, mod) % mod;
				for(int k = 0; k < mat[i].length; k++) {
					mat[j][k] -= c * mat[i][k] % mod;
					if(mat[j][k] < 0) mat[j][k] += mod;
				}
			}
			res *= mat[i][i];
			res %= mod;
		}
		return res;
	}
	static long powmod(long n, long r, int m) {
		long res = 1;
		for(; r != 0; r >>>= 1, n = n * n % m) {
			if((r&1) == 1) {
				res = res * n;
				if(res >= m) {
					res %= m;
				}
			}
		}
		return res;
	}
	
	
	// Double
	double spanningTreeCount() {
		double[][] mat = new double[V - 1][V - 1];
		for(int i = 0; i < V; i++) {
			for(int e = head[i]; e != -1; e = next[e]) {
				final int t = to[e];
				if(i != V - 1) { mat[i][i] += 1.0; }
				if(t != V - 1) { mat[t][t] += 1.0; }
				if(i != V - 1 && t != V - 1) {
					mat[i][t] -= 1.0;
					mat[t][i] -= 1.0;
				}
			}
		}
		for(double[] m : mat) for(int i = 0; i < m.length; i++) m[i] /= 2;;
		return determinant(mat);
	}
	double determinant(double[][] mat) {
		double res = 1;
		for(int i = 0; i < mat.length; i++) {
			for(int j = i + 1; j < mat.length; j++) {
				double c = mat[j][i] / mat[i][i];
				for(int k = 0; k < mat[i].length; k++) {
					mat[j][k] -= c * mat[i][k];
				}
			}
			res *= mat[i][i];
		}
		return res;
	}
	double logDeterminant(double[][] mat) {
		double res = 0;
		for(int i = 0; i < mat.length; i++) {
			for(int j = i + 1; j < mat.length; j++) {
				double c = mat[j][i] / mat[i][i];
				for(int k = 0; k < mat[i].length; k++) {
					mat[j][k] -= c * mat[i][k];
				}
			}
			res += Math.log(mat[i][i]);
		}
		return res;
	}
}
