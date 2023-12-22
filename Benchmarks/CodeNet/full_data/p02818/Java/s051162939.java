import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long K = sc.nextLong();
		sc.close();

		if (K <= A) {
			for (long i = 0; i < K; i++) {
				A--;
			}
		} else {
			for (long i = 0; i < K - A; i++) {
				B--;
			}
			A = 0;
		}
		System.out.println(A+" "+B);
	}
}
