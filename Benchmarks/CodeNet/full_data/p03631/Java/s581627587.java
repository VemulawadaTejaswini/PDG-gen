import java.util.Scanner;

public class Main {

	/** 入力数字桁数 */
	private static final int N = 3;

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			char[] n = scanner.next().toCharArray();
			System.out.println((n[0] == n[N - 1]) ? "Yes" : "No");
		}
	}
}
