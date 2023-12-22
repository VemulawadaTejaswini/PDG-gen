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
	int[] ff, gg;
	long ch(int n, int k) {
		return n < k ? 0 : (long) ff[n] * gg[k] % MD * gg[n - k] % MD;
	}
	void main() {
		int n = sc.nextInt();
		int k = sc.nextInt();
		ff = new int[n];
		gg = new int[n];
		for (int f = 1, i = 0; i < n; i++) {
			gg[i] = power(ff[i] = f, MD - 2); 
			f = (int) ((long) f * (i + 1) % MD);
		}
		int[] aa = new int[n];
		for (int i = 0; i < n; i++)
			aa[i] = sc.nextInt();
		aa = Arrays.stream(aa).boxed().sorted().mapToInt($->$).toArray();
		long ans = 0;
		for (int i = 0; i < n; i++)
			ans = (ans + (aa[i] - aa[n - 1 - i]) * ch(i, k - 1)) % MD;
		if (ans < 0)
			ans += MD;
		println(ans);
	}
}
