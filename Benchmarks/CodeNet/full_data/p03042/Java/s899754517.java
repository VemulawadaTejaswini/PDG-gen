import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String s = sc.next();

			int a = Integer.parseInt(s.substring(0, 2));
			int b = Integer.parseInt(s.substring(2));

			if (isMonth(a)) {
				if (isMonth(b)) {
					System.out.println("AMBIGUOUS");
				} else if (isYear(b)) {
					System.out.println("MMYY");
				} else {
					System.out.println("NA");
				}
			} else if (isYear(a)) {
				if (isMonth(b)) {
					System.out.println("YYMM");
				} else {
					System.out.println("NA");
				}
			} else {
				System.out.println("NA");
			}
		}

	}

	private static boolean isMonth(int i) {
		if (0 < i && i < 13) {
			return true;
		}
		return false;
	}

	private static boolean isYear(int i) {
		if (0 <= i && i < 100) {
			return true;
		}
		return false;
	}
}