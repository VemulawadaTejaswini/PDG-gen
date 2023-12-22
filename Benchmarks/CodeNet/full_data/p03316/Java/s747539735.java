import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		int n = Integer.parseInt(N);

		char[] c = N.toCharArray();

		int result = 0;

		for (char m : c) {
			result += Character.getNumericValue(m);
		}

		if (n % result == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();
	}

}
