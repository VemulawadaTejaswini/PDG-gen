import java.util.*;
import java.io.*;

class Main {
	public static void main(String... args) {
		int N = IN.nextInt();
		int K = IN.nextInt();

		if (K %2 == 1) {
			puts(calc(K, K, N));
		} else {
			int tmp = calc(K, K, N) + calc(K / 2, K, N);
			puts(tmp);
		}
		flush();
	}

	static int calc(int base, int step, int n) {
		int tmp = (n - base) / step + 1;
		return (int) Math.pow(tmp, 3);
	}

	static final Scanner IN = new Scanner(System.in);
	static final PrintWriter OUT = new PrintWriter(System.out);
	static <T> void puts(T arg) { OUT.println(arg); }
	static void flush() { OUT.flush(); }
}
