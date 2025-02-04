import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] a = new char[n][];
		char[][] b = new char[m][];
		for (int i = 0; i < n; i++) {
			a[i] = sc.next().toCharArray();
		}
		for (int i = 0; i < m; i++) {
			b[i] = sc.next().toCharArray();
		}
		for (int i = 0; i < n - m + 1; i++) {
			L: for (int j = 0; j < n - m + 1; j++) {
				for (int ii = 0; ii < m; ii++) {
					for (int jj = 0; jj < m; jj++) {
						if (a[ii][jj] != b[ii][jj]) {
							continue L;
						}
					}
				}
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
