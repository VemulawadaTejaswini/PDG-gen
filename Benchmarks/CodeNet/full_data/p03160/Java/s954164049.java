import java.util.*;
import java.io.*;

class frog1 {

	Scanner in;
	PrintWriter out;

	int[] hh;
	int[] cc;

	public static void main(String... args) {
		new frog1().solve();
	}

	void solve() {
		in = new Scanner(new InputStreamReader(System.in));
		// out = new PrintWriter(System.out);

		int n = in.nextInt();
		hh = new int[n];
		cc = new int[n];
		Arrays.fill(cc, -1);

		for (int i = 0; i < n; ++i) {
			hh[i] = in.nextInt();
		}

		System.out.println(calc_cost2());
	}

	int calc_cost2() {
		int len = hh.length;
		cc[len-1] = 0;
		cc[len-2] = Math.abs(hh[len-1]-hh[len-2]);
		for (int i = len-3; i >= 0; --i) {
			cc[i] = Math.min(cc[i+1]+Math.abs(hh[i]-hh[i+1]),
							 cc[i+2]+Math.abs(hh[i]-hh[i+2]));
		}

		return cc[0];
	}

	int calc_cost(int i, int cost) {
		int len = hh.length;
		if (i == len - 1) return cost;
		if (i == len - 2)
			cc[i] = cost + Math.abs(hh[i] - hh[len-1]);
		else
			cc[i] = Math.min(calc_cost(i+1, cost + Math.abs(hh[i]-hh[i+1])),
						calc_cost(i+2, cost + Math.abs(hh[i]-hh[i+2])));
		return cc[i];
	}
}
