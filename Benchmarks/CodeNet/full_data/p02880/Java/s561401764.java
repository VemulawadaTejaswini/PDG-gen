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

		sc.close();

		for (int i = 1; i <= 9; i++) {
			if (N % i == 0 && N / i <= 9) {
				out.println("Yes");
				return;
			}
		}
		out.println("No");

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
