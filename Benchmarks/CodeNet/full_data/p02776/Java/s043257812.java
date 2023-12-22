import java.util.*;
import java.util.stream.*;

class Main {
	Scanner sc;
	int N, M;
	int[][] B;
	Edge[] E;
	List<Edge>[] to;
	boolean[] seen;
	Set<Integer> ans;
	
	static class Edge {
		int pos, idx;
		Edge to;
	}
	
	@SuppressWarnings("unchecked")
	private void calc() {
		sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		B = new int[N+1][2];
		for (int i = 0; i < N; i++) {
			B[i][0] = sc.nextInt();
			B[i][1] = sc.nextInt();
		}
		B[N][0] = Integer.MAX_VALUE;
		B[N][1] = 0;
		Arrays.sort(B, Comparator.comparingInt(b -> b[0]));
		int v = 0;
		for (int i = 0; i <= N; i++) {
			int t = B[i][1];
			B[i][1] = v ^ B[i][1];
			v = t;
		}
		E = new Edge[M*2];
		for (int i = 0; i < M; i++) {
			E[i*2] = new Edge();
			E[i*2].pos = sc.nextInt();
			E[i*2+1] = new Edge();
			E[i*2+1].pos = sc.nextInt()+1;
			E[i*2].to = E[i*2+1];
			E[i*2+1].to = E[i*2];
			E[i*2].idx = i;
			E[i*2+1].idx = i;
		}
		Arrays.sort(E, Comparator.comparingInt(e -> e.pos));
		
		int j = 0;
		for (int i = 0; i <= N; i++) {
			while (j < E.length && E[j].pos <= B[i][0]) E[j++].pos = i;
		}
		
		to = new List[N+1];
		for (int i = 0; i <= N; i++) to[i] = new ArrayList<>();
		for (int i = 0; i < M*2; i++)
			if (E[i].pos != E[i].to.pos)
				to[E[i].pos].add(E[i]);
		
		seen = new boolean[N+1];
		ans = new TreeSet<>();
		int i = 0;
		for (; i <= N; i++)
			if (!seen[i]) if (!dfs(null, i)) break;
		if (i > N) {
			System.out.println(ans.size());
			System.out.println(ans.stream().map(String::valueOf).collect(Collectors.joining(" ")));
		} else {
			System.out.println(-1);
		}
	}
	
	boolean dfs(Edge es, int s) {
		seen[s] = true;
		for (Edge e : to[s]) {
			if (seen[e.to.pos]) continue;
			dfs(e, e.to.pos);
		}
		if (B[s][1] == 1) {
			if (es == null) return false;
			ans.add(es.idx+1);
			B[es.pos][1] ^= 1;
		}
		return true;
	}
	
	public static void main(String[] args) {
		new Main().calc();
	}
}
