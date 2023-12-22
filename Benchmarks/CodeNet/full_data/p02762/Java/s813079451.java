import java.util.Arrays;
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
		int[] rc = new int[n + 1];
		for(i = 0; i < m; i++) {
			x = scan.nextInt();
			y = scan.nextInt();

			f[x]++;
			f[y]++;

			uf.union(x, y);
		}

		for(i = 1; i <= n; i++) {
			rc[i] = uf.size(i) - f[i] - 1;
		}

		for(i = 0; i < k; i++) {
			x = scan.nextInt();
			y = scan.nextInt();

			if(uf.same(x, y)) {
				rc[x]--;
				rc[y]--;
			}
		}

		for(i = 1; i <= n; i++) {
			System.out.print(rc[i] + " ");
		}
	}

}
class unionFind{
	int[] par;
	int[] size;

	unionFind(int x){
		this.par = new int[x + 1];
		this.size = new int[x + 1];

		int i;
		for(i = 0; i <= x; i++)
			this.par[i] = i;
		Arrays.fill(this.size, 1);
	}

	int root(int x) {
		int r = x;
		while (r != this.par[r]) {
	        r = this.par[r];
	      }

		return r;
	}

	void union(int x, int y) {
		int rx = root(x);
		int ry = root(y);
		if(rx == ry)
			return;

		this.size[ry] += this.size[rx];
		this.par[rx] = ry;
	}

	int size(int x) {
		return this.size[root(x)];
	}

	boolean same(int x, int y) {
		int rx = root(x);
		int ry = root(y);

		return rx == ry;
	}
}