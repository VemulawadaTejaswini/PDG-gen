import java.util.Scanner;

public class Main {
	/**
	 * Comparing Strings
	 * @param 1 ≤ a ≤ 9
	 * @param 1 ≤ b ≤ 9
	 */
	public static void main(String... args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			StringBuilder sb = new StringBuilder();
			if (a < b) {
				for (int i = 0; i < b; i++) {
					sb.append(a);
				}
			} else {
				for (int i = 0; i < a; i++) {
					sb.append(b);
				}
			}
			System.out.println(sb.toString());
		}
	}
}