import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int[] a = new int[] { 1, 1, 1, 2, 1, 2, 1, 5, 2, 2, 1, 5, 1, 2, 1, 14, 1, 5, 1, 5, 2, 2, 1, 15, 2, 2, 5, 4, 1,
				4, 1, 51 };

		int K = sc.nextInt();

		sc.close();

		out.println(a[K - 1]);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
