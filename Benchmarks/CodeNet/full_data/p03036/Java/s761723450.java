import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int r = sc.nextInt();
		int D = sc.nextInt();
		int x = sc.nextInt();

		int[] a = new int[10 + 1];
		a[0] = x;

		for (int i = 1; i <= 10; i++) {
			a[i] = r * a[i - 1] - D;
		}

		for (int i = 1; i <= 10; i++) {
			out.println(a[i]);
		}

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
