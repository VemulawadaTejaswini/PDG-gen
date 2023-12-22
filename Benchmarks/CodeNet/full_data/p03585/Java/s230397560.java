import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		new Main().run();
	}

	class BIT {
		int n;
		long[] a;

		public BIT(int n_) {
			n = n_;
			a = new long[n + 1];
		}

		void add(int k) {
			++k;
			while (k <= n) {
				++a[k];
				k += k & -k;
			}
		}

		long sum(int k) {
			++k;
			long ret = 0;
			while (k > 0) {
				ret += a[k];
				k -= k & -k;
			}
			return ret;
		}

	}

	boolean check(double m, double[][] ps) {

		int n = ps.length;
		Arrays.sort(ps, new Comparator<double[]>() {
			@Override
			public int compare(double[] o1, double[] o2) {
				return Double.compare(o1[0] * m - o1[1], o2[0] * m - o2[1]);
			}
		});

		long tot = n * (n - 1) / 2;
		long t = (tot + 1) / 2;

		long sum = 0;
		BIT bit = new BIT(n);
		for (int i = 0; i < n; ++i) {
			sum += bit.sum((int) ps[i][2]);
			bit.add((int) ps[i][2]);
		}
		return sum >= t;

	}

	double solve(int n, double[] x, double[] y) {
		double[][] ps = new double[n][3];
		for (int i = 0; i < n; ++i) {
			ps[i][0] = x[i];
			ps[i][1] = y[i];
		}
		Arrays.sort(ps, new Comparator<double[]>() {
			@Override
			public int compare(double[] o1, double[] o2) {
				if (o1[0] != o2[0])
					return Double.compare(o1[0], o2[0]);
				else
					return Double.compare(o1[1], o2[1]);
			}
		});

		for (int i = 0; i < n; ++i) {
			ps[i][2] = i;
		}

		double ok = 1e4;
		double ng = -1e4;

		for (int t = 50; t >= 0; --t) {
			double middle = (ok + ng) / 2;
			if (check(middle, ps)) {
				ok = middle;
			} else {
				ng = middle;
			}
		}
		return ok;
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] a = new double[n];
		double[] b = new double[n];
		double[] c = new double[n];
		for (int i = 0; i < n; ++i) {
			a[i] = sc.nextDouble();
			b[i] = sc.nextDouble();
			c[i] = sc.nextDouble();
		}
		double[] x = new double[n];
		double[] y = new double[n];
		for (int i = 0; i < n; ++i) {
			y[i] = c[i] / b[i];
			x[i] = a[i] / b[i];
		}
		System.out.print(String.format("%.20f", solve(n, x, y)) + " ");
		for (int i = 0; i < n; ++i) {
			y[i] = c[i] / a[i];
			x[i] = b[i] / a[i];
		}
		System.out.println(String.format("%.20f", solve(n, x, y)));
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
