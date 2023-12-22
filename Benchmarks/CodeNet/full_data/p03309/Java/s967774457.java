import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int max = 0;
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			if (Math.abs(A[i]) > max) {
				max = Math.abs(A[i]);
			}
		}

		int ansPlus = 0, ansMinus = 0, plus = 0, minus = 0, prePlus = 0, preMinus = 0;
		boolean flagPlus = true, flagMinus = true;
		for (int i = 0; i < N; i++) {
			prePlus += Math.abs(A[i] - (i));
			preMinus += Math.abs(A[i] - (i));
		}

		for (int b = 1; b < max; b++) {
			plus = 0;
			minus = 0;
			for (int i = 0; i < N; i++) {
				if (flagPlus) {
					plus += Math.abs(A[i] - (b + i));
				}
				if (flagMinus) {
					minus += Math.abs(A[i] - (-b + i));
				}
			}
			if (prePlus < plus && flagPlus) {
				ansPlus = prePlus;
				flagPlus = false;
			}
			if (preMinus < minus && flagMinus) {
				ansMinus = preMinus;
				flagMinus = false;
			}
			prePlus = plus;
			preMinus = minus;
			if (!flagPlus && !flagMinus) {
				break;
			}
		}

		System.out.println(Math.min(ansPlus, ansMinus));
		sc.close();

	}
}
