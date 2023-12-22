import java.util.*;
public class Main {
	
	public static class unionfind{
		int[] parent;
		int[] rank;
		int[] size;
		public unionfind(int n){
			this.parent = new int[n+1];
			this.rank = new int[n+1];
			this.size = new int[n+1];
			for(int i = 1; i <= n; i++) set(i);
		}
		public void set(int i) {
			parent[i] = i;
			rank[i] = 0;
			size[i] = 1;
		}
		public int find(int i) {
			if (i == parent[i])
				return parent[i];
			else
				return parent[i] = find(parent[i]);
			
		}
		public boolean same(int x, int y){
			return find(x) == find(y);
		}
		public void unite(int x, int y) {
			int xroot = find(x);
			int yroot = find(y);
			if(xroot == yroot)
				return;
			if(rank[xroot] > rank[yroot]) {
				parent[yroot] = xroot;
				size[xroot] += size[yroot];
			}
			else if(rank[xroot] < rank[yroot]) {
				parent[xroot] = yroot;
				size[yroot] += size[xroot];
			}
			else {
				parent[yroot] = xroot;
				size[xroot] += size[yroot];
				rank[xroot]++;
			}
		}
		public int getsize(int i) {
			return size[find(i)];
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		StringBuilder ans = new StringBuilder();
		int[] edgenum = new int[N+1];
		unionfind u = new unionfind(N);
		for (int i = 1; i <= M; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			u.unite(A, B);
			edgenum[A]++;
			edgenum[B]++;
		}
		int[] x = new int [N+1];
		for(int i = 1; i <= N; i++)
			x[i] = u.getsize(i) - edgenum[i] - 1;
		for (int i = 1; i <= K; i++) {
		        int a = sc.nextInt();
		        int b = sc.nextInt();
		        if(u.same(a, b)) {
		        	x[a]--;
		        	x[b]--;
		        }
		}
		for(int i = 1; i <= N; i++) {
			ans.append(x[i] + " ");
		}
		System.out.println(ans);

	}

}