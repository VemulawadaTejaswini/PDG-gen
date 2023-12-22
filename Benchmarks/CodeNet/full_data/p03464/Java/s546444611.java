import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int K = scanner.nextInt();
		int A[] = new int[K + 1];
		for (int i = 1; i <= K; i++) {
			A[i] = scanner.nextInt();
		}
		A[0] = 1;
		scanner.close();
		int NLarge = 0;
		int NSmall = 2;
		for (int i = K - 1; i > 0; i--) {
			if (NSmall / A[i - 1] > 0) {
				NSmall = NSmall + NSmall % A[i];
			} else {
				NSmall = NSmall + A[i] - NSmall % A[i];
			}
		}
		NLarge = A[1] * (NSmall / A[1] + 1) - 1;
		int NCheck = NSmall;
		for (int i = 0; i <= K; i++) {
			NCheck = A[i] * (NCheck / A[i]);
		}
		if (NCheck == 2) {
			System.out.println(NSmall + " " + NLarge);
		} else {
			System.out.println(-1);
		}
	}
	
}