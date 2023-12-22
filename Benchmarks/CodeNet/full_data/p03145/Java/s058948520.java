
import java.util.Scanner;

public class ABC117Main {

	public static void main(String[] args) {

		ABC116_A();
		// ABC116_B();
		// ABC116_C();
		// ABC116_D();
	}

	private static void ABC116_A() {
		Scanner scanner = null;
		int lineAB = 0;
		int lineBC = 0;
		int lineCA = 0;

		try {
			scanner = new Scanner(System.in);
			lineAB = scanner.nextInt();
			lineBC = scanner.nextInt();
			lineCA = scanner.nextInt();

			int result = lineAB * lineBC / 2;
			System.out.println(result);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private static void ABC116_B() {
		Scanner scanner = null;
		String numT = "";
		String numX = "";

		try {
			scanner = new Scanner(System.in);
			numT = scanner.next();
			numX = scanner.next();

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private static void ABC116_C() {
		Scanner scanner = null;
		String numT = "";
		String numX = "";

		try {
			scanner = new Scanner(System.in);
			numT = scanner.next();
			numX = scanner.next();

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private static void ABC116_D() {
		Scanner scanner = null;
		String numT = "";
		String numX = "";

		try {
			scanner = new Scanner(System.in);
			numT = scanner.next();
			numX = scanner.next();

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}
}