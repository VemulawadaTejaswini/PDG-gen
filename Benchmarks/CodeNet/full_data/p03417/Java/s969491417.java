import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		long ans = 0;

		if (n == 1 && m >= 3)
			ans = m - 2;
		else if (m == 1 && n >= 3)
			ans = n - 2;
		else if (n == 1 && m == 1)
			ans = 1;
		else if (n != 1 && m != 1)
			ans = (long) (n - 2) * (long) (m - 2);
		else
			ans = 0;

		System.out.println(ans);

	}
}
