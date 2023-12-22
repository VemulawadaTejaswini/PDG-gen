import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			int m = sc.nextInt();
			int l[] = new int[m];
			int r[] = new int[m];
			for (int i = 0; i < m; i++) {
				l[i] = sc.nextInt();
				r[i] = sc.nextInt();
			}

			Arrays.sort(l);
			Arrays.sort(r);

			if (l[m - 1] <= r[0]) {
				if (n >= r[0] - l[m - 1] + 1) {
					System.out.println(r[0] - l[m - 1] + 1);
				} else {
					System.out.println(n);
				}
			} else {
				System.out.println(0);
			}

		}
	}
}
