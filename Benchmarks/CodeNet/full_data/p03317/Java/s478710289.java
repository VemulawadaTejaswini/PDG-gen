import java.util.Scanner;

/*
 * AtCoder Beginner Contest 101 C
 */
public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int K = scanner.nextInt();

		int[] A = new int[N];
		int minNumIndex = 0;
		for (int i = 0; i < N; i++) {
			A[i] = scanner.nextInt();
			if (A[i] == 1) {
				minNumIndex = i + 1;
			}
		}
		
		int result = 1 + (N - K + 1) / (K - 1);
		System.out.println(result);

	}

}