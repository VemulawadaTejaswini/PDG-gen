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
	void main() {
		byte[] cc = sc.next().getBytes();
		int n = cc.length;
		int[] pp = new int[n];
		for (int p = 1, i = 0; i < n; i++) {
			pp[i] = p;
			p = (int) (p * 3L % MD);
		}
		long ans = 0, cnt = 1;
		for (int i = 0; i < n; i++)
			if (cc[i] == '1') {
				ans = (ans + cnt * pp[n - 1 - i]) % MD;
				cnt = cnt * 2 % MD;
			}
		ans = (ans + cnt) % MD;
		println(ans);
	}
}
