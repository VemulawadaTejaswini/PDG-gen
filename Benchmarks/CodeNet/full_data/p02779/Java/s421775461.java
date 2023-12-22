import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		String anString = "YES";
		int roopCount = 0;

		n = scanner.nextInt();

		long[] input = new long[n];

		for (int i = 0; i < n; i++) {
			input[i] = scanner.nextLong();
		}

		exitroop: for (int i = 0; i < n - 1; i++) {
			for (int j = roopCount + 1; j < n; j++) {
				if (input[i] == input[j]) {
					anString = "NO";
					break exitroop;
				}
			}

			roopCount++;
		}

		System.out.println(anString);

	}

}
