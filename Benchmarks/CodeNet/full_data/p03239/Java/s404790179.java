import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int T = sc.nextInt();

		int[][] ct = new int[N][2];
		for (int i = 0; i < N; i++) {
			ct[i][0] = sc.nextInt();
			ct[i][1] = sc.nextInt();
		}

		int[][] r = Stream.of(ct)
				.filter(a -> a[1] <= T)
				.sorted((a1, a2) -> a1[0] - a2[0])
				.limit(1)
				.toArray(int[][]::new);

		if(r.length == 0) {
			out.println("TLE");
		}else {
			out.println(r[0][0]);
		}
		sc.close();
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
