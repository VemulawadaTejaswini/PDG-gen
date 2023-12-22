import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<Integer>[] g = new ArrayList[n];
		for(int i = 0; i < n; i++) g[i] = new ArrayList<>();
		for(int i = 0; i < m; i++){
			int u = sc.nextInt()-1;
			int v = sc.nextInt()-1;
			g[u].add(v);
		}
		int s = sc.nextInt()-1, t = sc.nextInt()-1;
		int[] dist = new int[n];
		Arrays.fill(dist, -1);
		dist[s] = 0;
		LinkedList<Integer> q = new LinkedList<>();
		q.add(s);
		while(!q.isEmpty()){
			int u = q.removeFirst();
			for(int v: next(g, n, u)){
				if(dist[v] < 0){
					dist[v] = dist[u] + 1;
					q.add(v);
				}
			}
		}
		System.out.println(dist[t]);
	}
	static ArrayList<Integer> next(ArrayList<Integer>[] g, int n, int a){
		ArrayList<Integer> n1 = g[a];
		ArrayList<Integer> n2 = new ArrayList<>();
		for(int u: n1){
			for(int v: g[u]){
				n2.add(v);
			}
		}
		ArrayList<Integer> n3 = new ArrayList<>();
		for(int u: n2){
			for(int v: g[u]){
				n3.add(v);
			}
		}
		return n3;
	}
}
