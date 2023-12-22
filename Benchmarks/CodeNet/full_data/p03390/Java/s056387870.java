import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		long A[] = new long[q];
		long B[] = new long[q];
		for (int i = 0; i < q; i++) {
			A[i] = sc.nextLong();
			B[i] = sc.nextLong();
		}

		for (int j = 0; j < q; j++) {
			long ans = 0;
			long a = A[j];
			long b = B[j];
			long x = a * b - 1;
			long tmp = 0;
			long sqr = (long) Math.floor(Math.sqrt(x));
			ans += sqr;
			for (long i = sqr + 1; i < a * b; i++) {
				if (tmp != x / i) {
					ans++;
				} else {
					ans += x / i - 1;
					break;
				}
				tmp = x / i;
			}
			if (a <= sqr || b <= sqr) {
				ans -= 1;
			}
			System.out.println(ans);
		}

	}
}
