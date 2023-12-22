import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	private long f(int[] s, int i, int n) { 
		if (n == 0) {
			return 1;
		}
		if (s.length <= i) {
			return 0;
		}

		long result = 0;
		result += s[i] * f(s, i + 1, n - 1);
		result += f(s, i + 1, n);

		return result;
	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int[] s = new int[5];

		for (int i = 0; i < N; i++) {
			String S = sc.next();
			switch (S.charAt(0)) {
			case 'M':
				s[0]++;
				break;
			case 'A':
				s[1]++;
				break;
			case 'R':
				s[2]++;
				break;
			case 'C':
				s[3]++;
				break;
			case 'H':
				s[4]++;
				break;
			}
		}
		sc.close();

		long ans = f(s, 0, 3);

		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
