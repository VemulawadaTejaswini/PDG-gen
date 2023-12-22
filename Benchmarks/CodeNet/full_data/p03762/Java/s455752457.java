// practice with kaiboy
import java.io.*;
import java.util.*;

public class Main extends PrintWriter {
	Main() { super(System.out, true); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		Main o = new Main(); o.main(); o.flush();
	}

	static final int MD = 1000000007;
	long solve(int[] aa, int n) {
		long ans = 0, sum = 0;
		for (int i = 0; i < n; i++) {
			ans = (ans + (long) aa[i] * i - sum) % MD;
			sum += aa[i];
		}
		return ans;
	}
	void main() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] xx = new int[n];
		int[] yy = new int[m];
		for (int i = 0; i < n; i++)
			xx[i] = sc.nextInt();
		for (int j = 0; j < m; j++)
			yy[j] = sc.nextInt();
		println(solve(xx, n) * solve(yy, m) % MD);
	}
}
