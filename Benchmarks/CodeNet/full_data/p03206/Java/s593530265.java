
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ABC115_A();
		// ABC115_B();
		// ABC115_C();
		// ABC115_D();
	}

	private static void ABC115_A() {
		Scanner scanner = null;
		int date = 0;

		try {
			scanner = new Scanner(System.in);
			date = scanner.nextInt();

			switch (date) {
			case 22:
				System.out.println("Christmas Eve Eve Eve");
				break;
			case 23:
				System.out.println("Christmas Eve Eve");
				break;
			case 24:
				System.out.println("Christmas Eve");
				break;
			case 25:
				System.out.println("Christmas");
				break;
			default:
				System.out.println("fail!");
				break;
			}

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private static void ABC115_B() {
		Scanner scanner = null;
		int lineAB = 0;
		int lineBC = 0;
		int lineCA = 0;

		try {
			scanner = new Scanner(System.in);
			lineAB = scanner.nextInt();

			System.out.println("");

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private static void ABC115_C() {
		Scanner scanner = null;
		int lineAB = 0;
		int lineBC = 0;
		int lineCA = 0;

		try {
			scanner = new Scanner(System.in);
			lineAB = scanner.nextInt();

			System.out.println("");

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private static void ABC115_D() {
		Scanner scanner = null;
		int lineAB = 0;
		int lineBC = 0;
		int lineCA = 0;

		try {
			scanner = new Scanner(System.in);
			lineAB = scanner.nextInt();

			System.out.println("");

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}
}