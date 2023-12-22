import java.util.*;

public class Main {

	private static class Unionfind{
		private static int par[];
		
		public Unionfind(int n) {
			par = new int[n];
			for(int i = 0; i < n; ++i)
				par[i] = i;
		}
		
		public int root(int x) {
			if(par[x] == x)return x;
			return par[x] = root(par[x]);
		}
		
		public void unite(int x, int y) {
			int rx = root(x);
			int ry = root(y);
			if(rx == ry)return;
			par[rx] = ry;
		}
		
		public boolean isSame(int x, int y) {
			int rx = root(x);
			int ry = root(y);
			return rx == ry;
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		int p[] = new int[n];
		for(int i = 0; i < n; ++i)
			p[i] = sc.nextInt();
		Unionfind union = new Unionfind(n);
		for(int i = 0; i < m; ++i) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			union.unite(p[x - 1] - 1, p[y - 1] - 1);
		}
		sc.close();
		int ans = 0;
		for(int i = n - 1; i >= 0; --i) {
			if(union.isSame(p[i] - 1, i)) 
				ans++;
		}
		System.out.println(ans);
	}

}
