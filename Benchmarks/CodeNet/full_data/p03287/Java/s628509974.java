import java.util.*;
import java.io.*;

class Main {
	public static void main(String... args) {
		int N = IN.nextInt();
		int M = IN.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = IN.nextInt();
		}

		HashMap<Integer, Integer> B = new HashMap<>();
		B.put(0, 1);
		int ans = 0;
		int tot = 0;
		for (int a: A) {
			tot = (tot + a) % M;
			ans += B.getOrDefault(tot, 0);
			B.put(tot, B.getOrDefault(tot, 0) + 1);
		}
		puts(ans);		
		flush();
	}
	static final Scanner IN = new Scanner(System.in);
	static final PrintWriter OUT = new PrintWriter(System.out);
	static <T> void puts(T arg) { OUT.println(arg); }
	static void flush() { OUT.flush(); }
}
