
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ABC11X_A();
		// ABC11X_B();
		// ABC11X_C();
		// ABC11X_D();
	}

	private static void ABC11X_A() {
		Scanner scanner = null;
		int nenrei = 0;

		try {
			scanner = new Scanner(System.in);
			nenrei = scanner.nextInt();
			switch (nenrei) {
			case 3:
			case 5:
			case 7:
				System.out.println("YES");
				break;
			default:
				System.out.println("NO");
				break;
			}

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private static void ABC11X_B() {
		Scanner scanner = null;
		int lineAB = 0;

		try {
			scanner = new Scanner(System.in);
			lineAB = scanner.nextInt();

			System.out.println();

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private static void ABC11X_C() {
		Scanner scanner = null;
		int lineAB = 0;

		try {
			scanner = new Scanner(System.in);
			lineAB = scanner.nextInt();

			System.out.println();

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private static void ABC11X_D() {
		Scanner scanner = null;
		int lineAB = 0;

		try {
			scanner = new Scanner(System.in);
			lineAB = scanner.nextInt();

			System.out.println();

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}
}