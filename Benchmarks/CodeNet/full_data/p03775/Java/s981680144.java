import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		long num = Long.parseLong(input);
		int range = (int) Math.pow(10, (input.length() + 1) / 2);
		int result = 100;
		for (int i = 1; i < range; i++) {
			if (num % i == 0) {
				int candidate = Math.max(length(i), length(num / i));
				if (candidate < result) result = candidate;
			}
		}
		System.out.println(result);
	}

	private static int length(long num) {
		return Long.toString(num).length();
	}
}
