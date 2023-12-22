import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		if (A == B) {
			System.out.println("0");
			return;
		}
		// A-K=-(B-K)
		// (A+B)/2=K

		if (A % 2 != B % 2) {
			System.out.println("IMPOSSIBLE");
			return;
		}

		long K = (A + B) / 2;
		if (Math.abs(A - K) == Math.abs(B - K)) {
			System.out.println(K);
			return;
		}
		System.out.println("IMPOSSIBLE");
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}