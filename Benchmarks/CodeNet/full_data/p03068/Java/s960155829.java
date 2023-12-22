import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			scanner.nextInt();
			String s = scanner.next();
			int k = scanner.nextInt();

			char target = s.charAt(k - 1);
			char[] cs = s.toCharArray();
			for (char c : cs) {
				if (c == target) {
					System.out.print(c);
				} else {
					System.out.print('*');
				}
			}
			System.out.println();
		}
	}

}
