import java.util.*;
import java.io.*;

class Main {

	Scanner in;
	PrintWriter out;

	int[] hh;
	int[] cc;

	public static void main(String... args) {
		new Main().solve();
	}

	void solve() {
		in = new Scanner(new InputStreamReader(System.in));

		int n = in.nextInt();
		int k = in.nextInt();
		hh = new int[n];
		cc = new int[n];
		Arrays.fill(cc, Integer.MAX_VALUE);

		for (int i = 0; i < n; ++i) {
			hh[i] = in.nextInt();
		}
      
      	int len = hh.length;
		cc[len-1] = 0;
		cc[len-2] = Math.abs(hh[len-1]-hh[len-2]);
		for (int i = len-3; i >= 0; --i) {
			int maxJump = k;
			while (i+maxJump >= len) --maxJump;
			for (int j = 1; j <= maxJump; ++j)
				cc[i] = Math.min(cc[i], cc[i+j]+Math.abs(hh[i]-hh[i+j]));
		}

		System.out.println(cc[0]);
	}
}
