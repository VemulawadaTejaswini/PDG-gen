import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int H = sc.nextInt();
		int A = sc.nextInt();

		sc.close();

		out.println((H + A - 1) / A);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
