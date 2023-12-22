package abc.abc150.a;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		int x = scanner.nextInt();
		System.out.println(500 * k >= x ? "Yes" : "No");
	}

}
