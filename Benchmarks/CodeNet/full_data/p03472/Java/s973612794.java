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
		int H = sc.nextInt();

		int[] a = new int[N];
		int[] b = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}

		Arrays.sort(a);
		Arrays.sort(b);

		int maxA = a[a.length - 1];

		int ans = 0;
		int d = 0;

		for (int i = b.length - 1; i >= 0; i--) {
			if (d >= H) {
				break;
			}
			if (b[i] < maxA) {
				break;
			}
			ans++;
			d += b[i];
		}
		sc.close();

		while (d < H) {
			ans++;
			d += maxA;
		}
		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
