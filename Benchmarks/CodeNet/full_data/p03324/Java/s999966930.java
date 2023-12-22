
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int D = sc.nextInt();
		int N = sc.nextInt();
		sc.close();

		int answer = 0;

		if (D == 0) {
			for (int i = 1; i <= N; i++) {
				if (i % 100 == 0) {
					continue;
				}
				answer = i * N;
			}
		} else if (D == 1) {
			answer = 100 * N;
		} else if (D == 2) {
			answer = 10000 * N;
		}

		System.out.print(answer);

	}
}
