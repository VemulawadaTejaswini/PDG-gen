import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		int C = A - 1;
		int D = B - 1;

		int sum = +0;
		if (A < B) {
			sum += B;
			if (A < D) {
				sum += D;
			} else {
				sum += A;
			}
		} else {
			sum += A;
			if (B < C) {
				sum += C;
			} else {
				sum += B;
			}
		}
		System.out.println(sum);
	}
}
