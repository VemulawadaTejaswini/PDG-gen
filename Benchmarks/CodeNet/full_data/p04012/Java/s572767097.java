import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		solve(s);
		s.close();
	}

	public static void solve(Scanner s) {
		String w = s.next();
		int[] array = new int[23];

		for (char c : w.toCharArray()) {
			array[c - 97]++;
		}

		for (int i : array) {
			if (i % 2 != 0) {
				System.out.println("No");
				return;
			}
		}

		System.out.println("Yes");
	}
}