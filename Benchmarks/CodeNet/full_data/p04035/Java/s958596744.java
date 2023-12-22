import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		new Main().run();
	}

	public void run() throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long l = sc.nextLong();
		long[] a = new long[n];
		for (int i = 0; i < n; ++i) {
			a[i] = sc.nextLong();
		}
		int j = -1;
		for (int i = 0; i + 1 < n; ++i) {
			if (a[i] + a[i + 1] >= l) {
				j = i;
			}
		}
		if (j == -1) {
			System.out.println("Impossible");
		} else {
			System.out.println("Possile");
			for (int i = 0; i < j; ++i) {
				System.out.println(i + 1);
			}
			for (int i = n - 1; i >= j + 2; --i) {
				System.out.println(i);
			}
			System.out.println(j + 1);
		}
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
