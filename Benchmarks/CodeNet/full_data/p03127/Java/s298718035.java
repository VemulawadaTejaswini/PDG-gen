import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int n = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		Arrays.sort(a);

		while (true) {
			if (a[0] == a[n - 1]) {
				out.println(a[0]);
				return;
			}

			a[n - 1] = (a[n - 1] % a[0]);
			if (a[n - 1] == 0)
				a[n - 1] = a[0];
			Arrays.sort(a);

		}

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
