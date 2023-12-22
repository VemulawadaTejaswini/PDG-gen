
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			String s = sc.next();

			for (char c : s.toCharArray()) {
				System.out.print(convert(c, n));
			}
			System.out.println();
		}
	}

	private static char convert(char c, int n) {
		int tmp = c - 'A';
		tmp += n;
		tmp %= 26;
		return (char) (tmp + 'A');
	}
}
