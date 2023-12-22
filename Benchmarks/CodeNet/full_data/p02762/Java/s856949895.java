import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int k = scan.nextInt();

		unionFind uf = new unionFind(n);

		int i,x,y;

		int[] f = new int[n + 1];
		int[] r = new int[n + 1];
		int[] rc = new int[n + 1];
		for(i = 0; i < m; i++) {
			x = scan.nextInt();
			y = scan.nextInt();

			f[x]++;
			f[y]++;

			uf.union(x, y);
		}

		for(i = 1; i <= n; i++) {
			r[i] = uf.root(i);
			rc[r[i]]++;
		}

		for(i = 0; i < k; i++) {
			x = scan.nextInt();
			y = scan.nextInt();

			if(uf.same(x, y)) {
				f[x]++;
				f[y]++;
			}
		}

		long temp;
		for(i = 1; i <= n; i++) {
			temp = rc[r[i]] - f[i] - 1;
			System.out.print(temp + " ");
		}
	}

}
class unionFind{
	int[] par;

	unionFind(int x){
		this.par = new int[x + 1];

		int i;
		for(i = 0; i <= x; i++)
			this.par[i] = i;
	}

	int root(int x) {
		if(this.par[x] == x)
			return x;

		return root(this.par[x]);
	}

	void union(int x, int y) {
		int rx = root(x);
		int ry = root(y);
		if(rx == ry)
			return;

		this.par[rx] = ry;
	}

	boolean same(int x, int y) {
		int rx = root(x);
		int ry = root(y);

		return rx == ry;
	}
}