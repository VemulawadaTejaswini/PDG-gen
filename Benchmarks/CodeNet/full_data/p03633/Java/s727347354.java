import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			long[] tmp = new long[n];

			for (int i = 0; i < n; i++) {
				tmp[i] = sc.nextLong();
			}

			Arrays.sort(tmp);

			long result = 1;
			for (int i = 0; i < n; i++) {
				if (result % tmp[n - 1 - i] != 0) {
					result *= tmp[n - 1 - i];
				}
			}

			System.out.println(result);
		}
	}
}