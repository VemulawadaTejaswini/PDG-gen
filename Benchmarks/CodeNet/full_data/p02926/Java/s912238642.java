import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] x = new int[n];
		int[] y = new int[n];
		for (int i = 0; i < n; i++) {
			String[] sa = br.readLine().split(" ");
			x[i] = Integer.parseInt(sa[0]);
			y[i] = Integer.parseInt(sa[1]);
		}
		br.close();

		double ans = 0;
		for (int i = 0; i < n; i++) {
			List<Set<Integer>> list = new ArrayList<>(4);
			for (int j = 0; j < 4; j++) {
				list.add(new HashSet<>());
			}
			long x1 = -y[i];
			long y1 = x[i];
			for (int j = 0; j < y.length; j++) {
				if (i != j) {
					long val = x1 * x[j] + y1 * y[j];
					if (val > 0) list.get(0).add(j);
					if (val >= 0) list.get(1).add(j);
					if (val < 0) list.get(2).add(j);
					if (val <= 0) list.get(3).add(j);
				}
			}

			for (Set<Integer> set : list) {
				long xx = 0;
				long yy = 0;
				for (int j : set) {
					xx += x[j];
					yy += y[j];
				}
				ans = Math.max(ans, calc(xx, yy));
				ans = Math.max(ans, calc(xx + x[i], yy + y[i]));
			}
		}
		System.out.println(ans);
	}

	static double calc(long x, long y) {
		long a = x * x + y * y;
		return Math.sqrt(a);
	}
}
