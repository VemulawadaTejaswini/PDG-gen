import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();

		int[] a = new int[N];

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt() - (i + 1);
		}

		Arrays.sort(a);

		int median;
		if (N % 2 == 1) {
			median = a[N / 2];
		} else {
			median = (a[N / 2 - 1] + a[N / 2]) / 2;
		}

		long ans = 0;
		for (int i = 0; i < N; i++) {
			ans += Math.abs(a[i] - median);
		}

		out.println(ans);

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
