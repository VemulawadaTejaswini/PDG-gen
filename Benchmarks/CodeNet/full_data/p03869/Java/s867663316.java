import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int[] xy1 = new int[2];
		int[] xy2 = new int[2];
		int[] xy3 = new int[2];
		xy1[0] = sc.nextInt();
		xy1[1] = sc.nextInt();
		xy2[0] = sc.nextInt();
		xy2[1] = sc.nextInt();
		xy3[0] = sc.nextInt();
		xy3[1] = sc.nextInt();

		double ans = 0;
		ans = Math.max(ans, max(xy1, xy2, xy3));
		ans = Math.max(ans, max(xy2, xy3, xy1));
		ans = Math.max(ans, max(xy3, xy1, xy2));

		pr.printf("%.10f\n", ans);
	}

	private static double max(int[] xy1, int[] xy2, int[] xy3) {
		int[] b = new int[2];
		int[] c = new int[2];
		b[0] = xy2[0] - xy1[0];
		b[1] = xy2[1] - xy1[1];
		c[0] = xy3[0] - xy1[0];
		c[1] = xy3[1] - xy1[1];

		double the = Math.atan2(b[1], b[0]);
		double[] db = rot(-the, b);
		double[] dc = rot(-the, c);
		if (dc[1] < 0) {
			dc[1] = -dc[1];
		}

		double thea = Math.atan2(dc[1], dc[0]);
		double theb = Math.atan2(dc[1], db[0] - dc[0]);

		double l = 0;
		double r = db[0] / (1 / Math.tan(thea / 2) + 1 / Math.tan(theb / 2));
		for (int i = 0; i < 100; i++) {
			double mid = (l + r) / 2;

			double xa = mid / Math.tan(thea / 2);
			double xb = mid / -Math.tan(theb / 2) + db[0];
			if (xb - xa <= 2 * mid) {
				r = mid;
			} else {
				l = mid;
			}
		}

//		pr.println(Arrays.toString(xy1));
//		pr.println(Arrays.toString(xy2));
//		pr.println(Arrays.toString(xy3));
//		pr.println(Arrays.toString(db));
//		pr.println(Arrays.toString(dc));
//		pr.printf("%f %f\n", thea / Math.PI * 180, theb / Math.PI * 180);
//		pr.println(l);
		return l;
	}

	private static double[] rot(double the, int[] x) {
		double[] ret = new double[2];

		ret[0] = Math.cos(the) * x[0] - Math.sin(the) * x[1];
		ret[1] = Math.sin(the) * x[0] + Math.cos(the) * x[1];

		return ret;
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
