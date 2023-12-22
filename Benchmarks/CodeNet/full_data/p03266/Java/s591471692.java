import java.util.*;
import java.io.*;

class Main {
	public static void main(String... args) {
		long N = IN.nextLong();
		long K = IN.nextLong();

		long num = N / K;
		if (K % 2 == 1) {
			puts(num * num * num);
		} else {
			long tmp = (N - K / 2) / K + 1;
			puts(num * num * num + tmp * tmp * tmp);
		}
		flush();
	}

	static final Scanner IN = new Scanner(System.in);
	static final PrintWriter OUT = new PrintWriter(System.out);
	static <T> void puts(T arg) { OUT.println(arg); }
	static void flush() { OUT.flush(); }
}
