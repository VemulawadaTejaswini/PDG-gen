import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int w = sc.nextInt();

		int[] alphabet = new int[26];
		for (int i = 0; i < alphabet.length; i++) {
			alphabet[i] = 0;
		}

		for (int i = 0; i < h; i++) {
			String s = sc.next();
			for (int j = 0; j < w; j++) {
				char c = s.charAt(j);
				int ascii = (int) c;
				int alphabetIdx = ascii - 97;
				alphabet[alphabetIdx]++;
			}
		}

		int x1 = 0;
		int x2 = 0;
		for (int i = 0; i < alphabet.length; i++) {
			if (alphabet[i] != 0) {
				if (alphabet[i] % 4 == 0) {

				} else if (alphabet[i] % 2 == 0) {
					x2 ++;
				} else {
					if (alphabet[i] >= 2) {
						if (alphabet[i] % 4 != 0) {
							x2 ++;
						}
					}
					x1 ++;
				}
			}
		}

		if (h % 2 == 0 & w % 2 == 0) {
			if (x1 == 0 && x2 == 0) {
				System.out.print("Yes");
			} else {
				System.out.print("No");
			}
		} else if (h % 2 != 0 & w % 2 != 0) {
			if (x1 == 1 &&
					((x2 == (h - 1) / 2 + (w - 1) / 2)
							|| ((x2 <= (h - 1) / 2 + (w - 1) / 2)
									&& (((h - 1) / 2 + (w - 1) / 2) - x2) % 4 == 0))) {
				System.out.print("Yes");
			} else {
				System.out.print("No");
			}
		} else if (h % 2 == 0 & w % 2 != 0) {
			if (x1 == 0 && ((x2 == h / 2)
					|| ((x2 <= h / 2) && ((h / 2 - x2) % 4 == 0)))) {
				System.out.print("Yes");
			} else {
				System.out.print("No");
			}
		} else if (h % 2 != 0 & w % 2 == 0) {
			if (x1 == 0 && ((x2 == w / 2)
					|| ((x2 <= w / 2) && ((w / 2 - x2) % 4 == 0)))) {
				System.out.print("Yes");
			} else {
				System.out.print("No");
			}
		}
	}
}
