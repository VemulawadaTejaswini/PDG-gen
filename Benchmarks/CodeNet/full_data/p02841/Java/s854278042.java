import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int m1 = sc.nextInt();
		int d1 = sc.nextInt();
		int m2 = sc.nextInt();
		int d2 = sc.nextInt();

		sc.close();

		if (m1 != m2) {
			out.println(1);
		} else {
			out.println(0);
		}

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
