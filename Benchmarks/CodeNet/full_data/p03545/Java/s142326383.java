import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int[] a = new int[s.length()];
		for (int i = 0; i < s.length(); ++i) {
			a[i] = (int) (s.charAt(i) - '0');
		}
		for (int i = -1; i <= 1; i += 2) {
			for (int j = -1; j <= 1; j += 2) {
				for (int k = -1; k <= 1; k += 2) {
					if (a[0] + i * a[1] + j * a[2] + k * a[3] != 7)
						continue;
					int[] v = new int[] { i, j, k };
					for (int l = 0; l < 4; ++l) {
						System.out.print(a[l]);
						if (l < 3)
							System.out.print(v[l] == 1 ? "+" : "-");
					}
					System.out.println("=7");
					return;

				}
			}
		}
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
