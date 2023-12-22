import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long inputNum = scan.nextLong();
		scan.close();

		if (inputNum == 2) {
			System.out.println(2);
			return;
		}
		if (inputNum == 3) {
			System.out.println(3);
			return;
		}

		for (int i = 0; ; i++) {
			if (isPrimeNumber(inputNum + i)) {
				System.out.println(inputNum + i);
				return;
			}
		}
	}

	private static boolean isPrimeNumber(long value) {

		for (int i = 3; i < (value / 2); i++) {
			if (value % i == 0) {
				return false;
			}
		}
		return true;
	}
}