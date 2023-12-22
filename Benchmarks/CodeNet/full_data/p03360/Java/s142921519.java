import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();
		int sum = 0;

		if (A >= B && A >= C) {
			sum = countUp(A, K) + B + C;
		} else if (B >= A && B >= C) {
			sum = countUp(B, K) + A + C;
		} else {
			sum = countUp(C, K) + A + B;
		}
		System.out.println(sum);
	}

	public static int countUp(int baseCount, int roopCount) {
		for (int i = 1; i <= roopCount ; i++) {
			baseCount = baseCount*2;
		}
		return baseCount;
	}
}
