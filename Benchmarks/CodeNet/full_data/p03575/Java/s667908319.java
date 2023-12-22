import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

class Edge{
	int source, sink, id;
	public Edge(int sc, int sk, int id) {
		source = sc; sink = sk; this.id = id;
	}
}
class Main{
	static Edge[] edges;
	static int[][] adj_mat;
	static int N, M;
	static boolean check(int idx) {
		// edge[idx] を削除して連結になるかを判定する
		Stack<Integer> st = new Stack<Integer>();
		st.add(0);
		boolean[] isVisited = new boolean[N];
		Arrays.fill(isVisited, false);
		while(!st.isEmpty()) {
			int now = st.pop();
			isVisited[now] = true;
			for(Edge e : edges) {
				if((e.source != now && e.sink != now) || e.id == idx) continue;
				if(e.source == now) {
					if(isVisited[e.sink]) continue;
					st.add(e.sink);
				}else {
					if(isVisited[e.source]) continue;
					st.add(e.source);
				}
			}
		}
		boolean res = true;
		for(int i = 0; i < N; i++) res &= isVisited[i];
		return res;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		N = sc.nextInt(); M = sc.nextInt();
		edges = new Edge[M];
		for(int i = 0; i < M; i++) {
			edges[i] = new Edge(sc.nextInt() - 1, sc.nextInt() - 1, i);
		}
		int cnt = 0;
		for(int i = 0; i < M; i++) {
			if(!check(i)) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}