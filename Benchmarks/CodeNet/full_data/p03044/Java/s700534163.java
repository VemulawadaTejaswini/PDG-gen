import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	
	static ArrayList<Pair>[] adjList;
	static boolean[] vis;
	static int[] color;
	
	public static void dfs(int u) {
		vis[u] = true;
		
		for(Pair p : adjList[u]) {
			if(!vis[p.v]) {
				color[p.v] = p.w % 2 == 0 ? color[u] : 1 - color[u];
				dfs(p.v);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		adjList = new ArrayList[n];
		for(int i = 0; i < adjList.length; i++)
			adjList[i] = new ArrayList<Pair>();
		
		for(int i = 0; i < n - 1; i++) {
			int u = sc.nextInt(), v = sc.nextInt(), w = sc.nextInt();
			adjList[u - 1].add(new Pair(v - 1, w));
			adjList[v - 1].add(new Pair(u - 1, w));
		}
		
		vis = new boolean[n];
		color = new int[n];
		
		dfs(0);
		for(int i = 0; i < color.length; i++)
			System.out.println(color[i]);
	}
	
	public static class Pair implements Comparable<Pair>{
		int v, w;
		
		public Pair(int v) {
			this.v = v;
		}
		
		public Pair(int v, int w) {
			this(v);
			this.w = w;
		}
		
		public int compareTo(Pair p) {
			if(this.w == p.w)
				return this.v - p.v;
			return this.w - p.w;
		}
	}
}
