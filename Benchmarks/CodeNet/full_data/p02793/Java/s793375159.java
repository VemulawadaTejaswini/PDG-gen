// practice with kaiboy
import java.io.*;
import java.util.*;

public class Main extends PrintWriter {
	Main() { super(System.out, true); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		Main o = new Main(); o.main(); o.flush();
	}

	static final int A = 1000000, MD = 1000000007;
	int power(long a, int k) {
		long p = 1;
		while (k > 0) {
			if ((k & 1) == 1)
				p = p * a % MD;
			a = a * a % MD;
			k >>= 1;
		}
		return (int) p;
	}
	void main() {
		int n = sc.nextInt();
		int[] kk = new int[A];
		long ans = 0;
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			ans = (ans + power(a, MD - 2)) % MD;
			for (int p = 2; p <= a / p; p++)
				if (a % p == 0) {
					int k = 0;
					while (a % p == 0) {
						k++;
						a /= p;
					}
					kk[p] = Math.max(kk[p], k);
				}
			if (a > 1)
				kk[a] = Math.max(kk[a], 1);
		}
		for (int a = 2; a < A; a++)
			if (kk[a] > 0)
				ans = ans * power(a, kk[a]) % MD;
		println(ans);
	}
}
