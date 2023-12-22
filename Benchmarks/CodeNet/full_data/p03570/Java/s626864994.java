import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			execute(scanner);
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private static void execute(Scanner scanner) {
		String s = scanner.nextLine();
		int n1 = 0;
		for (StringBuilder stringBuilder = new StringBuilder(s); stringBuilder.length() > 0;) {
			for (int i = stringBuilder.length(); i > 0; i--) {
				if (kaibun(stringBuilder.substring(0, i))) {
					n1++;
					stringBuilder.delete(0, i);
					break;
				}
			}
		}
		int n2 = 0;
		for (StringBuilder stringBuilder = new StringBuilder(s); stringBuilder.length() > 0;) {
			for (int i = 0; i < stringBuilder.length(); i++) {
				int end = stringBuilder.length();
				if (kaibun(stringBuilder.substring(i, end))) {
					n2++;
					stringBuilder.delete(i, end);
					break;
				}
			}
		}
		System.out.println(Math.min(n1, n2));
	}

	private static boolean kaibun(String string) {
		int[] a = new int[26];
		int base = 'a';
		for (char c : string.toCharArray()) {
			int index = ((int) c) - base;
			a[index] = a[index] + 1;
		}
		int oddCount = 0;
		for (int c : a) {
			if (c % 2 == 1) {
				oddCount++;
			}
			if (oddCount > 1) {
				return false;
			}
		}
		return true;
	}
}
