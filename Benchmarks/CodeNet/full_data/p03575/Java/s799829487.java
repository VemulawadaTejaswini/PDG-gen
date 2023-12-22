import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		int[]a = new int[M];
		int[]b = new int[M];
		for(int i = 0; i < M; i++) {
			a[i] = sc.nextInt() - 1;
			b[i] = sc.nextInt() - 1;
		}
		sc.close();
		int cnt = 0;

		for(int i = 0; i < M; i++) {
			DisjointSet ds = new DisjointSet(N);
			for(int j = 0; j < M; j++) {
				if(i == j) continue;
				ds.unite(a[j], b[j]);
			}
			for(int j = 1; j < N; j++) {
				if(ds.findSet(0) != ds.findSet(j)) {
					cnt++;
					break;
				}
			}
//			for(int j = 0; j < N; j++) {
//				System.out.print(ds.findSet(j) + " ");
//			}
//			System.out.println();
		}
		System.out.println(cnt);
	}
	static class DisjointSet {
		int[]p;
		int[]rank;
		DisjointSet(){}
		DisjointSet(int size){
			rank = new int[size];
			p = new int[size];
			for(int i = 0; i < size; i++) {
				makeSet(i);
			}
		}
		void makeSet(int x) {
			p[x] = x;
			rank[x] = 0;
		}
		boolean same(int x, int y) {
			return findSet(x) == findSet(y);
		}
		void unite(int x, int y) {
			link(findSet(x), findSet(y));
		}
		void link(int x, int y) {
			if(rank[x]  > rank[y]) {
				p[y] = x;
			}else {
				p[x] = y;
				if(rank[x] == rank[y]) {
					rank[y]++;
				}
			}
		}
		int findSet(int x) {
			if(x != p[x]) {
				p[x] = findSet(p[x]);
			}
			return p[x];
		}
	}
}