// practice with kaiboy
import java.io.*;
import java.util.*;

public class Main extends PrintWriter {
	Main() { super(System.out); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		Main o = new Main(); o.main(); o.flush();
	}

	void main() {
		byte[] aa = sc.next().getBytes();
		byte[] bb = sc.next().getBytes();
		int n = aa.length;
		int m = bb.length;
		int[] pp = new int[n + 1];
		int[] qq = new int[m + 1];
		for (int i = 0; i < n; i++)
			pp[i + 1] = pp[i] + aa[i] - 'A' + 1;
		for (int j = 0; j < m; j++)
			qq[j + 1] = qq[j] + bb[j] - 'A' + 1;
		int q = sc.nextInt();
		while (q-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			println(((pp[b] - pp[a - 1]) - (qq[d] - qq[c - 1])) % 3 == 0 ? "YES" : "NO");
		}
	}
}
