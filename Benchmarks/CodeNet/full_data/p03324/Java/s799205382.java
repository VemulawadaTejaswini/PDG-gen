
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int D = sc.nextInt();
		int N = sc.nextInt();
		sc.close();

		int answer = 0;

		if (D == 0) {
			if (N == 100) {
				answer = 101;
			} else {
				answer = N;
			}

		} else if (D == 1) {
			if (N == 100) {
				answer = 10100;
			} else {
				answer = 100 * N;
			}

		} else if (D == 2) {
			if (N == 100) {
				answer = 1010000;
			} else {
				answer = 10000 * N;
			}
		}

		System.out.print(answer);

	}
}
