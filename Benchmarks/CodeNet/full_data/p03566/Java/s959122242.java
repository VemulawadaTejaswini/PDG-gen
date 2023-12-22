// practice with kaiboy
import java.io.*;
import java.util.*;

public class Main extends PrintWriter {
	Main() { super(System.out, true); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		Main o = new Main(); o.main(); o.flush();
	}

	void main() {
		int n = sc.nextInt();
		int s = 0; 
		int[] tt = new int[n];
		int[] vv = new int[n];
		for (int i = 0; i < n; i++)
			s += tt[i] = sc.nextInt();
		for (int i = 0; i < n; i++)
			vv[i] = sc.nextInt();
		int[] oo = new int[s];
		int[] pp = new int[s];
		int[] qq = new int[s];
		for (int h = 0; h < s; h++) {
			oo[h] = s;
			pp[h] = h;
			qq[h] = s - 1 - h;
		}
		for (int l = 0, i = 0; i < n; i++) {
			int t = tt[i], v = vv[i];
			int r = l + t;
			for (int h = l; h < r; h++)
				oo[h] = Math.min(oo[h], v);
			for (int h = r; h < s; h++)
				pp[h] = Math.min(pp[h], v + h - r);
			for (int h = 0; h < l; h++)
				qq[h] = Math.min(qq[h], v + l - 1 - h);
			l = r;
		}
		double ans = 0;
		for (int h = 0; h < s; h++) {
			int o = oo[h], p = pp[h], q = qq[h];
			if (o <= p && o <= q)
				ans += o;
			else
				ans += p == q ? p + 0.25 : Math.min(p, q) + 0.5;
		}
		println(ans);
	}
}
