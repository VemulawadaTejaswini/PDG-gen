import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		long[] A = new long[N];

		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextLong();
		}

		long barA = 0;
		long barB = 0;

		for (int i = 0; i < (N / 2); i++) {
			barA += A[i];
			barB += A[N-i-1];
		}

		long ans = 0;

		if (N%2 == 1) {
			long left = A[N / 2];
			ans = Math.abs(Math.max(barA,barB) - (Math.min(barA,barB) + left));
		}else {
			ans = Math.abs(Math.max(barA,barB) - (Math.min(barA,barB)));
		}

		System.out.println(ans);

	}
}
