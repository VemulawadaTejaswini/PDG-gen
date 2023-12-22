
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String s = sc.next();
			long k = sc.nextLong();

			int count = 0;
			int tmp = 1;
			char before = ' ';
			for (char c : s.toCharArray()) {
				if (before == c) {
					tmp++;
				} else {
					count += tmp / 2;
					tmp = 1;
				}
				before = c;
			}
			if (tmp == s.length()) {
				long result = tmp * k / 2;
				System.out.println(result);
				return;
			} else if (1 < tmp) {
				count += tmp / 2;
			}
			long result = count * k;
			char[] ca = s.toCharArray();
			if (s.length() > 1 && ca[0] != ca[1] && ca[s.length() - 2] != ca[s.length() - 1] && ca[0] == ca[s.length() - 1]) {
				result += k - 1;
			}
			System.out.println(result);
		}
	}
}
