// practice with kaiboy
import java.io.*;
import java.util.*;

public class Main extends PrintWriter {
	Main() { super(System.out, true); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		Main o = new Main(); o.main(); o.flush();
	}

	static class E {
		int i, j, w;
		E(int i, int j, int w) {
			this.i = i; this.j = j; this.w = w;
		}
	}
	int[] ds;
	int find(int i) {
		return ds[i] < 0 ? i : (ds[i] = find(ds[i]));
	}
	boolean join(int i, int j) {
		i = find(i);
		j = find(j);
		if (i == j)
			return false;
		if (ds[i] > ds[j])
			ds[i] = j;
		else {
			if (ds[i] == ds[j])
				ds[i]--;
			ds[j] = i;
		}
		return true;
	}
	void main() {
		int n = sc.nextInt();
		int[] xx = new int[n];
		int[] yy = new int[n];
		Integer[] ii = new Integer[n];
		Integer[] jj = new Integer[n];
		for (int i = 0; i < n; i++) {
			xx[i] = sc.nextInt();
			yy[i] = sc.nextInt();
			ii[i] = jj[i] = i;
		}
		Arrays.sort(ii, (i, j) -> xx[i] - xx[j]);
		Arrays.sort(jj, (i, j) -> yy[i] - yy[j]);
		int m = (n - 1) * 2;
		E[] ee = new E[m];
		m = 0;
		for (int h = 1; h < n; h++) {
			int i, j, w;
			i = ii[h - 1];
			j = ii[h];
			w = xx[j] - xx[i];
			ee[m++] = new E(i, j, w);
			i = jj[h - 1];
			j = jj[h];
			w = yy[j] - yy[i];
			ee[m++] = new E(i, j, w);
		}
		Arrays.sort(ee, (e, f) -> e.w - f.w);
		ds = new int[n]; Arrays.fill(ds, -1);
		long ans = 0;
		for (int h = 0; h < m; h++) {
			E e = ee[h];
			if (join(e.i, e.j))
				ans += e.w;
		}
		println(ans);
	}
}
