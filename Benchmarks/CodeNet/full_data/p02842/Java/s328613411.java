import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (long X = 1; X <= 1000000; ++X) {
			if (X * 108 / 100 == N) {
				System.out.println(X);
				return;
			}
		}
		System.out.println(":(");
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
