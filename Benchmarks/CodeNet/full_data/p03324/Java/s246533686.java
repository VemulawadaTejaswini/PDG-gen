import java.util.Scanner;

/*
 * AtCoder Beginner Contest 100 B
 */
public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int D = scanner.nextInt();
		int N = scanner.nextInt();

		int result = (int) Math.pow(100, D) * N;
		if (D == 0 && N == 100) {
			result = N + 1;
		}

		System.out.println(result);

	}

}