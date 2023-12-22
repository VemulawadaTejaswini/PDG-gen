import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int K = scanner.nextInt();

		int[] cumulant = new int[N];

		int sum = 0;

		for (int i = 0; i < N; i++) {
			sum += scanner.nextInt();
			cumulant[i] = sum;
		}

		scanner.close();

		sum = 0;

		for (int i = 0; i + K < N; i++) {
			if (cumulant[i + K] - cumulant[i] > sum)
				sum = cumulant[i + K] - cumulant[i];
		}

		System.out.println((double) (sum + K) / 2);
	}

}
