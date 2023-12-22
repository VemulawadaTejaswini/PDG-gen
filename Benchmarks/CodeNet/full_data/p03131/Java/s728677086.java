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

		for (long i = 0; i < K; i++) {
			//System.out.println(biscuits + ", " + money);
			if (i == K - 1 && money == 0) {
				knock();
			} else if (B > A + 1) {
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