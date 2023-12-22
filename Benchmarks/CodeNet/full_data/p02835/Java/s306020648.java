import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int A1 = sc.nextInt();
		int A2 = sc.nextInt();
		int A3 = sc.nextInt();

		sc.close();

		if (A1 + A2 + A3 >= 22) {
			out.println("bust");
		} else {
			out.println("win");
		}

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
