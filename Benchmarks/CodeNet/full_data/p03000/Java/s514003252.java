
import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int X = sc.nextInt();

		int L[] = new int[N];
		int D[] = new int[N + 1];

		int count = 0;

		for (int i = 0; i < N; i++) {
			L[i] = sc.nextInt();
		}

		for (int i = 0; i <= N; i++) {
			if (i == 0) {
				D[0] = 0;
				continue;
			}

			D[i] = D[i - 1] + L[i - 1];

		}

		for (int i = 0; i <= N; i++) {
			if (D[i] <= X) {
				count++;
			}
		}

		System.out.print(count);

	}
}
