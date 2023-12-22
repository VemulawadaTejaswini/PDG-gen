import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int[] t = new int[n + 2];
		String[] sa = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			t[i + 1] = t[i] + Integer.parseInt(sa[i]);
		}
		t[n + 1] = t[n];

		int[] v = new int[n + 2];
		sa = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			v[i + 1] = Integer.parseInt(sa[i]);
		}
		br.close();

		double ans = 0;
		double pre = 0;
		for (double x = 0.5; x <= t[n]; x+=0.5) {
			double min = Double.MAX_VALUE;
			for (int i = 0; i < v.length; i++) {
				min = Math.min(min, calc(t, v, i, x));
			}
			ans += (min + pre) / 4;
			pre = min;
		}
		System.out.println(ans);
	}

	static double calc(int[] t, int[] v, int i, double x) {
		if (i == 0) {
			return x;
		}
		if (x < t[i - 1]) {
			return v[i] + t[i - 1] - x;
		} else if (t[i - 1] <= x && x <= t[i]) {
			return v[i];
		} else {
			return v[i] + x - t[i];
		}
	}
}
