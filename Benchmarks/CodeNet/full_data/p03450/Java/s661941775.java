

import java.util.Scanner;

public class Main {
	static int nVertex = 0;
	static int nSta = 0;
	static int[] fa = null;
	static int[] rank = null;
	public static void init() {
		fa = new int[nVertex + 1];
		rank = new int[nVertex + 1];
		for(int i = 0; i <= nVertex; i++) {
			fa[i] = i;
			rank[i] = 0;
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		nVertex = in.nextInt();
		nSta = in.nextInt();
		init();
		for(int i = 0; i < nSta; i++) {
			int u = in.nextInt();
			int v = in.nextInt();
			int rela = in.nextInt();
			if(!merge(u, v, rela)) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
	public static int getFa(int a) {
		if(a == fa[a])
			return a;
		int temp = fa[a];
		fa[a] = getFa(fa[a]);
		rank[a] = rank[temp] + rank[a];
		return fa[a];
	}
	public static boolean merge(int u, int v, int rela) {
		int fu = getFa(u);
		int fv = getFa(v);
		if(fu == fv)
			return rela + rank[u] == rank[v];
		fa[fv] = fu;
		rank[fv] = -rank[v] + rela + rank[u];
		return true;
	}
}
