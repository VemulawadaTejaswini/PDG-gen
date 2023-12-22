import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] a = new long[3 * N];
		for (int i = 0; i < a.length; ++i) {
			a[i] = sc.nextLong();
		}
		Arrays.sort(a);
		long sum = 0;
		int t = 3 * N;
		int s = 0;
		while (t - s > 0) {
			sum += a[t - 2];
			++s;
			t -= 2;
		}
		System.out.println(sum);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}