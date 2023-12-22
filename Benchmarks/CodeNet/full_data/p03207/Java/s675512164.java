import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();

		int max = 0;
		int ans = 0;

		for(int i=0;i<N;i++) {
			int p = sc.nextInt();
			ans += p;
			max = Math.max(max, p);
		}

		ans = (ans - max) + (max / 2);

		out.println(ans);

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
