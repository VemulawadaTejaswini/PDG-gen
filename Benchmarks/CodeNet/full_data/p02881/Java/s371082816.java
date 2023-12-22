import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		long N = scanner.nextLong();
		long i = 1;
		long j = N;

		for (long s = 2; s < N / 2; s++) {
			if (N % s == 0) {
				i = s;
				j = N / s;
			}
		}
		System.out.println((i - 1) + (j - 1));

	}
}