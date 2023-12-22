import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		sc.close();

		//N<=Mにする
		if (N > M) {
			int tmp = N;
			N = M;
			M = tmp;
		}

		int ans;
		if (N == 1 && M == 1) {
			ans = 1;
		} else if (N == 1) {
			// 2 3 3 3 2
			// 端以外は裏
			ans = M - 2;
		} else {
			// 4 6 6 6 4
			// 6 9 9 9 6
			// 6 9 9 9 6
			// 4 6 6 6 4
			//内側のみ裏
			ans = (N - 2) * (M - 2);

		}

		out.println(ans);
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
