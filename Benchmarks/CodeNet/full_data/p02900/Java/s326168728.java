import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		long A = scanner.nextLong();
		long B = scanner.nextLong();
		long N;
		long ans = 0;
		if (A > B)
			N = A;
		else
			N = B;

		for (long i = 1; i < N; i++) {
			if (A % i == 0 && B % i == 0) {
				boolean b = true;
				for (long j = 2; j < i; j++) {
					if (i % j == 0) {
						b = false;
						break;
					}
				}
				if (b)
					ans++;
			}
		}

		System.out.println(ans);

	}
}