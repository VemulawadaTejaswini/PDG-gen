import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int K = scan.nextInt();
		int sum = 0;

		for (int i = 0; i <= K; i++) {
			for (int j = 1; j <= K; K++) {
				for (int k = 1; k <= K; k++) {
					sum += gcd(i, gcd(j , k));
				}
			}
		}

	}

	static int gcd(int p, int q) {
		if (p % q == 0) {
			return q;
		}
		return gcd(q, p % q);
	}
}