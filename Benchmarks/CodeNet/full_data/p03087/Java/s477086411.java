import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int n = sc.nextInt();
		int q = sc.nextInt();

		int[] sum = new int[n];

		String s = sc.next();

		sum[0] = 0;
		for (int i = 1; i < s.length(); i++) {
			sum[i] = sum[i - 1];
			if (s.charAt(i - 1) == 'A' && s.charAt(i) == 'C') {
				sum[i]++;
			}
		}

		for (int i = 0; i < q; i++) {
			int st = sc.nextInt();
			int e = sc.nextInt();
			out.println(sum[e - 1] - sum[st - 1]);
		}

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
