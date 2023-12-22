import java.util.Arrays;
import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] l = new int[2 * n];
		for (int i = 0; i < 2 * n; i++) {
			l[i] = -sc.nextInt();
		}
		Arrays.sort(l);
		int sum = 0;
		for (int i = 0; i < 2 * n; i++) {
			if (i % 2 == 1) {
				sum += l[i];
			}
		}
		System.out.println(-sum);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
