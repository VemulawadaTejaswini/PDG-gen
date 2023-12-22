import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		for (long num = 1; num <= X / 100; ++num) {
			long res = X - num * 100;
			if (res <= 5 * num) {
				System.out.println(1);
				return;
			}
		}
		System.out.println(0);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
