import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		sc.close();

		int ans;
		if (x >= 0 && y >= 0) {
			if (x >= y && y == 0) {
				ans = 1 + x - y;

			} else if (x >= y) {
				// 反転して+1して反転
				ans = 2 + x - y;
			} else {
				// +1する
				ans = y - x;
			}
		} else if (x >= 0 && y < 0) { // x正 y負
			if (Math.abs(x) >= Math.abs(y)) { // 2 -1
				// 反転してから+1
				ans = 1 + (y - (-x));
			} else { // 1 -2
				// 絶対値をあわせてから反転
				ans = Math.abs(y) - x + 1;
			}

		} else if (x < 0 && y >= 0) {
			// x負 y正
			// +1する
			ans = y - x;

		} else {
			// x負 y負
			if (x >= y) { // -1 -2
				// 反転して絶対値あわせて反転
				ans = Math.abs(y) - Math.abs(x) + 2;
			} else { // -2 -1
				ans = y - x;
			}

		}
		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
