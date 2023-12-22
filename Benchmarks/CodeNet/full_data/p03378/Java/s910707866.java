import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		int[] masu = new int[n];
		int to0 = 0, toN = 0;

		for (int i = 0; i < m; i++) {
			masu[sc.nextInt()] = -1;
		}

		for (int i = x; i < n; i++) {
			if (masu[i] == -1) {
				toN++;
			}
		}

		for (int i = x; i > 0; i--) {
			if (masu[i] == -1) {
				to0++;
			}
		}

		System.out.print(Math.min(toN, to0));
	}
}