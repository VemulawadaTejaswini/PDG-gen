import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		long X = sc.nextLong();

		sc.close();

		long a = X / 500;
		long b = (X % 500) / 5;

		out.println(a * 1000 + b * 5);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
