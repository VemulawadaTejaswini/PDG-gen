import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		String anString = "YES";

		n = scanner.nextInt();

		long[] input = new long[n];

		exitroop: for (int i = 0; i < n; i++) {
			input[i] = scanner.nextLong();

			for (int j = 0; j < i; j++) {
				if (input[i] == input[j]) {
					anString = "NO";
					break exitroop;
				}
			}
		}

		System.out.println(anString);

	}

}
