import java.util.Scanner;

public class Main {
	static long biscuits = 1;
	static long money = 0;
	static long K;
	static long A;
	static long B;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		K = scanner.nextInt();
		A = scanner.nextInt();
		B = scanner.nextInt();

		long A1 = A + 1;
		long K1 = K - 1;
		for (int i = 0; i < K; i++) {
			if (i == K1 && money == 0) {
				knock();
			} else if (B > A1) {
				if (money == 1) {
					moneyToBiscuit();
				} else if (biscuits >= A) {
					biscuitToMoney();
				} else {
					knock();
				}
			} else {
				knock();
			}
		}

		System.out.println(biscuits);
	}

	private static void knock() {
		biscuits++;
	}

	private static void biscuitToMoney() {
		biscuits -= A;
		money++;
	}

	private static void moneyToBiscuit() {
		money--;
		biscuits += B;
	}
}