
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			long[] b = new long[n];
			for (int i = 0; i < n; i++) {
				b[i] = sc.nextLong();
			}
			int result = 0;

			for (int i = 0; i < n; i++) {
				for (int j = i; j < n; j++) {
					int xor = 0;
					int sum = 0;
					for (int k = i; k <= j; k++) {
						xor ^= b[k];
						sum += b[k];
					}
					if (xor == sum) {
						result++;
					}
				}
			}
			System.out.println(result);
		}
	}
}
