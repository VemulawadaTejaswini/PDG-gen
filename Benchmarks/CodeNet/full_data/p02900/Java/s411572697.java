import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long A = Long.parseLong(sc.next());
		long B = Long.parseLong(sc.next());

		sc.close();

		if (A < B) {
			long temp = A;
			A = B;
			B = temp;
		}
		long M = myGCD(A, B);
//		System.out.println(M);

		long res = 1;
		for (long i = 2; i <= M; i++) {
			if(M % i == 0) {
//				System.out.println("i:" + i + ", M:" + M);
				res++;
				while(M % i == 0) {
					M /= i;
				}
//				System.out.println("M:" + M);
			}
		}

		System.out.println(res);
	}

	private static long myGCD(long A, long B) {
		if (A < B) {
			long temp = A;
			A = B;
			B = temp;
		}
		while (true) {
			if (A % B == 0) {
				return B;
			}
			long temp = B;
			B = A % B;
			A = temp;
		}
	}
}
