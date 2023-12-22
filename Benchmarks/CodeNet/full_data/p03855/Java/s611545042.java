import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static boolean[] visited;
	static int[] ans;
	static UnionFind dsu;
	static ArrayList<Integer> temp;
	static ArrayList<Integer>[] road, rail;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int l = sc.nextInt();
		
		//idea: construct a union-find with all the roads only
		//then, for each node, run dfs on it, and add nodes to the 
		//set if and only if they're in the same road-component 
		//and theres an edge between them
		//able to count all the members in the set exactly once and 
		//at the same time; if a and b are in the same set, then 
		//their count is equal; othewrise, it might be different
		road = new ArrayList[n];
		for(int i=0;i<n;i++) {
			road[i] = new ArrayList<>();
		}
		for(int i=0;i<k;i++) {
			int p = sc.nextInt()-1;
			int q = sc.nextInt()-1;
			road[p].add(q);
			road[q].add(p);
		}
		rail = new ArrayList[n];
		for(int i=0;i<n;i++) {
			rail[i] = new ArrayList<>();
		}
		for(int i=0;i<l;i++) {
			int r = sc.nextInt()-1;
			int s = sc.nextInt()-1;
			rail[r].add(s);
			rail[s].add(r);
		}
		dsu= new UnionFind(n);
		for(int i=0;i<n;i++) {
			for(int j : road[i]) {
				dsu.union(i,j);
			}
		}
		visited = new boolean[n];
		ans = new int[n];
		for(int i=0;i<n;i++) {
			if(!visited[i]) {
				temp = new ArrayList<>();
				dfs(i);
				for(int x:  temp) {
					ans[x] = temp.size();
				}
				
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<n;i++) {
			sb.append(ans[i]);
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
	static void dfs(int i) {
		visited[i] = true;
		temp.add(i);
		for(int j : rail[i]) {
			if(dsu.findSet(i)==dsu.findSet(j) && !visited[j]) {
				dfs(j);
			}
		}
	}
	static class UnionFind{
		int par[];
		int sz[];
		public UnionFind(int n) {
			sz = new int[n];
			par = new int[n];
			for(int i=0;i<n;i++) {
				initialize(i);
			}
		}
		private void initialize(int x) {
			par[x] = x;
			sz[x] = 1;
		}
		public int findSet(int x) {
			while(x!=par[x]) {
				par[x] = par[par[x]];
				x = par[x];
			}
			return x;
		}
		public void union(int a,int b) {
			int x= findSet(a);
			int y = findSet(b);
			if(x!=y) {
				if(sz[x]<sz[y]) {
					int temp = x;
					x = y;
					y = temp;
				}
				par[y] = x;
				sz[x]+=sz[y];
			}
		}
	}
}
