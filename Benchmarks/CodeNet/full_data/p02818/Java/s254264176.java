import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int K = sc.nextInt();
		sc.close();

		if (K <= A) {
			for (int i = 0; i < K; i++) {
				A--;
			}
		} else {
			for (int i = 0; i < K - A; i++) {
				B--;
			}
			A = 0;
		}
		System.out.println(A+" "+B);
	}
}
