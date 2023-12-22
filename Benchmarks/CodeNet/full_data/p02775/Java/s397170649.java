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
		byte[] cc = sc.next().getBytes();
		int n = cc.length;
		int ans = 0;
		for (int i = n - 1; i >= 0; i--) {
			int d = cc[i] - '0';
			if (d != 5) {
				if (d > 5) {
					ans += 10 - d;
					if (i > 0)
						cc[i - 1]++;
					else
						ans++;
				} else
					ans += d;
			} else {
				if (i > 0 && cc[i - 1] >= '5') {
					ans += 10 - d;
					cc[i - 1]++;
				} else
					ans += d;
			}
		}
		println(ans);
	}
}
