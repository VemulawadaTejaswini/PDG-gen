import java.util.*;
import java.io.*;

class Main {
	public static void main(String... args) {
		int N = IN.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = IN.nextInt();
		}

		int ans = 0;
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				int tmp = Math.abs(A[i] - A[j]);
				if (tmp > ans) {
					ans = tmp;
				}
			}
		}
		puts(ans);
		flush();
	}
	static final Scanner IN = new Scanner(System.in);
	static final PrintWriter OUT = new PrintWriter(System.out);
	static <T> void puts(T arg) { OUT.println(arg); }
	static void flush() { OUT.flush(); }
}
