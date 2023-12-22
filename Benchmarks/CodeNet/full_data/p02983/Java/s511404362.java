
import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);

		long L = sc.nextInt();
		long R = sc.nextInt();

		long n[] = new long[(int) (R - L + 1)];
		long a = 0;
		long min = 1000000000;

		for (int i = 0; i < R - L + 1; i++) {
			n[i] = L + i;
		}

		if (R - L >= 2019) {
			System.out.print(0);
			return;
		}

		for (int i = 0; i < R - L + 1; i++) {
			for (int j = i + 1; j < R - L + 1; j++) {
				a = (n[i] * n[j]) % 2019;
				if (a < min) {
					min = a;
				}
			}
		}
		System.out.print(min);
	}
}
