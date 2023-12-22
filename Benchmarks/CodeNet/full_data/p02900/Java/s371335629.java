import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			long A = input.nextLong();
			long B = input.nextLong();
			long gcdAB = gcd(A, B);

			long countPrimeFactor = 0;
			for (int i = 2; i * i < gcdAB; ++i) {
				if (gcdAB % i == 0) {
					++countPrimeFactor;
					
					while (gcdAB % i == 0) {
						gcdAB /= i;
					}
				}
			}
			
			if (gcdAB != 1) {
				++countPrimeFactor;
			}
			
			System.out.println(countPrimeFactor + 1);
		}
	}

	private static long gcd(long a, long b) {
		return b == 0 ? a : gcd(b, a % b);
	}
}
