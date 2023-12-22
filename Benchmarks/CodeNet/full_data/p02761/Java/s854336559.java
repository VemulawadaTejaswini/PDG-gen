import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int anser = -1;

		int n = scan.nextInt();
		int m = scan.nextInt();

		int[] s = new int[m];
		int[] c = new int[m];

		for (int i = 0; i < m; i++) {
			s[i] = scan.nextInt();
			c[i] = scan.nextInt();
		}

		if (n == 1) {
			out_of_loop: for (int i = 0; i <= 9; i++) {
				for (int j = 0; j < m; j++) {
					if (i != c[j]) {
						break;
					}
					if (j == m - 1) {
						anser = i;
						break out_of_loop;
					}
				}
			}
		}

		if (n == 2) {
			out_of_loop: for (int i = 10; i <= 99; i++) {
				for (int j = 0; j < m; j++) {
					if (s[j] == 1) {
						if (i / 10 != c[j]) {
							break;
						}
					}
					if (s[j] == 2) {
						if (i % 10 != c[j]) {
							break;
						}
					}
					if (j == m - 1) {
						anser = i;
						break out_of_loop;
					}

				}
			}
		}

		if (n == 3) {
			out_of_loop: for (int i = 100; i <= 999; i++) {
				for (int j = 0; j < m; j++) {
					if (s[j] == 1) {
						if (i / 100 != c[j]) {
							break;
						}
					}
					if (s[j] == 2) {
						if (i / 10 % 10 != c[j]) {
							break;
						}
					}

					if (s[j] == 3) {
						if (i % 10 != c[j]) {
							break;
						}
					}
					if (j == m - 1) {
						anser = i;
						break out_of_loop;
					}

				}
			}
		}

		System.out.println(anser);
	}

}
