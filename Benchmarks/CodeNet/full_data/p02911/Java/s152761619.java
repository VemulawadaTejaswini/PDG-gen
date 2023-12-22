
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().solver();
	}

	void solver() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextLong();
		int Q = sc.nextInt();
		long[] P = new long[N];
		Arrays.fill(P, K - Q);
		for (int i = 0; i < Q; ++i) {
			int A = sc.nextInt();
			--A;
			P[A]++;
		}
		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < N; ++i) {
			if (P[i] <= 0)
				pw.println("No");
			else
				pw.println("Yes");
		}
		pw.close();
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
