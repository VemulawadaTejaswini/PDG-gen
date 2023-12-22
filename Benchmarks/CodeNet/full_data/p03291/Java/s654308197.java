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
		long a = 0, b = 0, c = 0, k = 1;
		for (int i = 0; i < n; i++) {
			byte x = cc[i];
			if (x == 'A')
				a = (a + k) % MD;
			else if (x == 'B')
				b = (b + a) % MD;
			else if (x == 'C')
				c = (c + b) % MD;
			else {
				long a_ = (a * 3 + k) % MD;
				long b_ = (b * 3 + a) % MD;
				long c_ = (c * 3 + b) % MD;
				a = a_;
				b = b_;
				c = c_;
				k = k * 3 % MD;
			}
		}
		println(c);
	}
}
