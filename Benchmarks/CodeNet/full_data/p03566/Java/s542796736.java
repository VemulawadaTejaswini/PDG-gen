import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();

		int[] t = new int[n];
		int[] v = new int[n];
		for (int i = 0; i < n; i++) {
			t[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			v[i] = sc.nextInt();
		}

		List<Integer> tt = new ArrayList<>(n + 1);
		List<Integer> vv = new ArrayList<>(n + 1);
//		tt.add(0);
//		vv.add(0);
		int tsum = 0;
		for (int i = 0; i < n - 1; i++) {
			tsum += t[i];
			tt.add(tsum);
			vv.add(v[i]);
		}
		tsum += t[n - 1];
		tt.add(tsum);
		vv.add(v[n - 1]);
		vv.add(0);

		int m = 10;
		double p = 0;
		double ans = 0;
		int maxi = 0;
		for (int i = 1; i <= tsum * m; i++) {
			double x = (double)i / m;
			double tmp = x;
			tmp = Math.min(tmp, -(x - tsum));
			if (x >= tt.get(maxi)) {
				maxi++;
			}
			maxi = Math.min(maxi, tt.size() - 1);
			tmp = Math.min(tmp, vv.get(maxi));
			for (int j = 0, size = tt.size(); j < size; j++) {
				if (x <= tt.get(j)) {
					tmp = Math.min(tmp, -(x - tt.get(j)) + vv.get(j));
					tmp = Math.min(tmp, -(x - tt.get(j)) + vv.get(j + 1));
				} else {
					tmp = Math.min(tmp, (x - tt.get(j)) + vv.get(j));
					tmp = Math.min(tmp, (x - tt.get(j)) + vv.get(j + 1));
				}
			}

			ans += (p + tmp) / m / 2;

			p = tmp;
		}

		pr.printf("%.4f\n", ans);
	}

	// ---------------------------------------------------
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		pr = new Printer(System.out);

		solve();

		pr.close();
		sc.close();
	}

	private static class Printer extends PrintWriter {
		Printer(PrintStream out) {
			super(out);
		}
	}
}
