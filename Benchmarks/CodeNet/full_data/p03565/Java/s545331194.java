import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] key = scanner.nextLine().toCharArray();
		char[] part = scanner.nextLine().toCharArray();

		int pLength = part.length;
		if (pLength == 1) {
			for (int kIndex = 0; kIndex < key.length; kIndex++) {
				if (key[kIndex] == part[0]) {
					System.out.println(String.valueOf(key).replaceAll("\\?", "a"));
					return;
				}
			}
		}

		int kIndex = key.length - 1;
		int pIndex = pLength - 1;
		boolean restorable = false;

		while (kIndex >= 0) {
			if (key[kIndex--] != part[pIndex--] && key[kIndex + 1] != '?') pIndex = pLength - 1;
			if (pIndex == -1) {
				for (pIndex = 0; pIndex < pLength; pIndex++) key[kIndex + pIndex + 1] = part[pIndex];
				restorable = true;
				break;
			}
		}

		if (restorable) {
			System.out.println(String.valueOf(key).replaceAll("\\?", "a"));
		} else {
			System.out.println("UNRESTORABLE");
		}
	}
}
