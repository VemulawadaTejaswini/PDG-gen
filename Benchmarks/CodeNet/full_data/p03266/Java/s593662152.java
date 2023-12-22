import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		if (k % 2 == 1) {
			int wa =0;
			for (int i = 1; i <= n; i++) {
				if (i % k == 0) {
					wa++;
				}}
			System.out.println(wa * wa * wa);

		} else {
			int wa = 0;
			int wa2 = 0;
			for (int i = 1; i <= n; i++) {
				if (i % k == 0) {
					wa++;
				}
				if ((i % k) == (k / 2)) {
					wa2++;
				}
			}

			System.out.println((wa * wa * wa) + (wa2 * wa2 * wa2));

		}

	}
}