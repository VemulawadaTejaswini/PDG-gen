import java.util.*;
import java.io.*;

class Main {
	public static void main(String... args) {
		long N = IN.nextLong();
		long K = IN.nextLong();

		if (K % 2 == 1) {
			puts(calc(K, K, N));
		} else {
			long tmp = calc(K, K, N) + calc(K / 2, K, N);
			puts(tmp);
		}
		flush();
	}

	static long calc(long base, long step, long n) {
		long tmp = (n - base) / step + 1;
		return tmp * tmp * tmp;
	}

	static final Scanner IN = new Scanner(System.in);
	static final PrintWriter OUT = new PrintWriter(System.out);
	static <T> void puts(T arg) { OUT.println(arg); }
	static void flush() { OUT.flush(); }
}
