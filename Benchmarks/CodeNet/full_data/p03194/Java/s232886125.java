import java.util.Scanner;

public class Main {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long N = sc.nextLong();
		long P = sc.nextLong();

		long num = 1;

		for (long i = 1; i <= P/N; i++) {

			if (P % i != 0) {
				continue;
			}

			long n = (long) Math.pow(i, N);

			if (n > P) {
				break;
			}

			if (P%n == 0) {
				num = i;
			}
		}
		System.out.println(num);
	}
}
