import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int concat[][] = new int[N][N];

		for (int i = 0; i < N; i ++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			concat[i][0] = B;
			concat[i][1] = A;
		}

		Arrays.sort(concat, (a, b) -> Integer.compare(a[0], b[0]));

		boolean possible = true;
		long sum = 0;

		for (int i = 0; i < N; i++) {
			sum += concat[i][1];
			if (concat[i][0] < sum) {
				possible = false;
				break;
			}
		}

		if (possible) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}