import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		String[] s = new String[h + 2];
		s[0] = ",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,";
		s[h + 1] = ",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,";
		for (int i = 1; i <= h; i++) {
			s[i] = sc.next();
		}

		for (int i = 1; i <= h; i++) {
			for (int j = 0; j < w; j++) {
				int count = 0;

				if (j > 0) {
					if (s[i - 1].charAt(j - 1) == '#') {
						count++;
					}
					if (s[i].charAt(j - 1) == '#') {
						count++;
					}
					if (s[i + 1].charAt(j - 1) == '#') {
						count++;
					}
				}
				if (s[i - 1].charAt(j) == '#') {
					count++;
				}
				if (s[i + 1].charAt(j) == '#') {
					count++;
				}
				if (j < w - 1) {
					if (s[i - 1].charAt(j + 1) == '#') {
						count++;
					}
					if (s[i].charAt(j + 1) == '#') {
						count++;
					}
					if (s[i + 1].charAt(j + 1) == '#') {
						count++;
					}
				}
				if (s[i].charAt(j) == '#') {
					System.out.print('#');
				} else {
					System.out.print(count);
				}
			}
			System.out.println();
		}

	}
}