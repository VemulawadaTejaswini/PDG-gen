import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			sc.nextLine();
			Double A[] = new Double[N];
			Double B[] = new Double[N];
			for (int i = 0; i < N; i++) {
				A[i] = sc.nextDouble();
				B[i] = sc.nextDouble();
			}
			double cnt = 0;
			for (int i = N - 1; i >= 0; i--) {
				if (B[i] != 1) {
					double div = (A[i] + cnt) % B[i];
					cnt = cnt + (B[i] - div);
				}
			}
			System.out.println((int)cnt);
		}
	}
}
