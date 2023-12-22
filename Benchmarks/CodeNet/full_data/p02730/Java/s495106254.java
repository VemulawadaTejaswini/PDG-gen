import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		String str = scn.next();

		int n = str.length();

		if (n % 2 == 0) {
			System.out.println("No");
		} else {

			int i = 0;
			int f = ((n - 1) / 2) - 1;

			boolean ini = ispalidrome(i, f, str);

			i = ((n + 3) / 2) - 1;
			f = n - 1;

			boolean fin = ispalidrome(i, f, str);

			if (ini && fin) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

	}

	private static boolean ispalidrome(int i, int f, String str) {

		while (i <= f) {
			if (str.charAt(i) != str.charAt(f)) {
				return false;
			}
			i++;
			f--;
		}
		return true;
	}

}
