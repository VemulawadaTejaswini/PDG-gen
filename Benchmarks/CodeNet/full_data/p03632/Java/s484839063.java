import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		int ans = 0;

		if (c < a) {
			if (d < a) {
				ans = 0;
			} else {
				ans = d - a;
			}
		}
		if (c >= a) {
			if (d <= b) {
				ans = d - c;
			} else {
				ans = b - c;
			}
		}
		if (b < c) {
			ans = 0;
		}

		System.out.println(ans);
	}
}
