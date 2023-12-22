import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int[] x = new int[n];
		int[] y = new int[n];
		for (int i = 0; i < n; i++) {
			sa = br.readLine().split(" ");
			x[i] = Integer.parseInt(sa[0]);
			y[i] = Integer.parseInt(sa[1]);
		}
		br.close();

		double ans = 100000;
		int mi = 0;
		int mj = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				double mx = (x[i] + x[j]) / 2.0;
				double my = (y[i] + y[j]) / 2.0;
				double ng = 0;
				double ok = 100000;
				while (Math.abs(ok - ng) > 1e-8) {
					double mid = (ok + ng) / 2;
					if (isOk(x, y, mx, my, mid)) {
						ok = mid;
					} else {
						ng = mid;
					}
				}
				ans = Math.min(ans, ok);
			}
		}
		System.out.println(ans);
	}

	static boolean isOk(int[] x, int[] y, double mx, double my, double val) {
		for (int i = 0; i < y.length; i++) {
			double d = Math.hypot(x[i] - mx, y[i] - my);
			if (d > val) {
				return false;
			}
		}
		return true;
	}
}
