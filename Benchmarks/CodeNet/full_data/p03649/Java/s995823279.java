// practice with kaiboy
import java.io.*;
import java.util.*;

public class Main extends PrintWriter {
	Main() { super(System.out, true); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		Main o = new Main(); o.main(); o.flush();
	}

	void main() {
		int n = sc.nextInt();
		long[] aa = new long[n];
		for (int i = 0; i < n; i++)
			aa[i] = sc.nextLong();
		long ans = 0;
		while (true) {
			long sum = 0;
			for (int i = 0; i < n; i++) {
				long cnt = aa[i] / n;
				sum += cnt;
			}
			if (sum == 0)
				break;
			ans += sum;
			for (int i = 0; i < n; i++) {
				long cnt = aa[i] / n;
				aa[i] = aa[i] % n + sum - cnt;
			}
		}
		println(ans);
	}
}
