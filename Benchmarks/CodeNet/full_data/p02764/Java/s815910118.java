import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int k = Integer.parseInt(sa[1]);
		int[] x = new int[n];
		int[] y = new int[n];
		int[] c = new int[n];
		for (int i = 0; i < n; i++) {
			sa = br.readLine().split(" ");
			x[i] = Integer.parseInt(sa[0]);
			y[i] = Integer.parseInt(sa[1]);
			c[i] = Integer.parseInt(sa[2]);
		}
		br.close();

		System.out.println(calc(x, y, c, k));
	}

	static double calc(int[] x, int[] y, int[] c, int k) {
		double gosa = 1e-9;
		double l = -1100;
		double r = 1100;
		double ret = 10000000;
		while (r - l > gosa) {
			double m1 = (l * 2 + r) / 3;
			double m2 = (l + r * 2) / 3;
			double v1 = getTime(x, y, c, k, m1, getY(x, y, c, k, m1));
			double v2 = getTime(x, y, c, k, m2, getY(x, y, c, k, m2));
			if (v1 <= v2) {
				r = m2;
				ret = v1;
			} else {
				l = m1;
				ret = v2;
			}
		}
		return ret;
	}

	static double getY(int[] x, int[] y, int[] c, int k, double mx) {
		double gosa = 1e-9;
		double l = -1100;
		double r = 1100;
		while (r - l > gosa) {
			double m1 = (l * 2 + r) / 3;
			double m2 = (l + r * 2) / 3;
			double v1 = getTime(x, y, c, k, mx, m1);
			double v2 = getTime(x, y, c, k, mx, m2);
			if (v1 <= v2) {
				r = m2;
			} else {
				l = m1;
			}
		}
		return r;
	}

	static double getTime(int[] x, int[] y, int[] c, int k, double mx, double my) {
		double[] val = new double[x.length];
		for (int i = 0; i < y.length; i++) {
			double d = Math.hypot(x[i] - mx, y[i] - my);
			val[i] = c[i] * d;
		}
		Arrays.parallelSort(val);
		return val[k - 1];
	}
}
