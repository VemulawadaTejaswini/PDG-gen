import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	final long MOD = (long) 1e9 + 7;

	void run() {
		Scanner sc = new Scanner(System.in);
		long S = sc.nextLong();// 1e18
		long a = (long) Math.sqrt(S);
		while (a * a < S) {
			++a;
		}
		long X1 = a;
		long Y1 = 1;
		long X2 = a * a - S;
		long Y2 = a;
		long X3 = 0;
		long Y3 = 0;
		System.out.println(X1 + " " + Y1 + " " + X2 + " " + Y2 + " " + X3 + " " + Y3);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}