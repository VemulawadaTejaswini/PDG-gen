import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int cnt = 0;
		while (N != 0) {
			int jo6, jo9 = 0;
			if (N < 6) {
				N--;
				cnt++;
			} else {
				jo6 = jou6(N);
				jo9 = jou9(N);

				if (N - jo6 < N - jo9) {
					N -= jo6;
					cnt++;
				} else {
					N -= jo9;
					cnt++;
				}
			}

		}
		System.out.println(cnt);
	}

	private static int jou6(int num) {
		int reNum = 0;
		// Nを超えない範囲で乗算を繰り返す。
		for (int i = 1; i < 7; i++) {
			if (i == 1) {
				reNum = 6;
				continue;
			}
			reNum *= 6;
			if (num <= reNum) {
				return reNum / 6;
			}
		}
		return -99;
	}

	private static int jou9(int num) {
		int reNum = 0;
		// Nを超えない範囲で乗算を繰り返す。
		for (int i = 1; i < 7; i++) {
			if (i == 1) {
				reNum = 9;
				continue;
			}
			reNum *= 9;
			if (num <= reNum) {
				return reNum / 9;
			}
		}

		return -99;
	}

}
