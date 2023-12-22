import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int[] a = new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int k = sc.nextInt();

		if (a[4] - a[0] <= k) {
			out.println("Yay!");
		} else {
			out.println(":(");
		}

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
