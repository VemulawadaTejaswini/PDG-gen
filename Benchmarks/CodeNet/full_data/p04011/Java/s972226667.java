import java.util.Scanner;

class Main {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int ans = 0;

		for (int i = 1; i <= n; i++) {
			if (i <= k) {
				ans += x;
			} else {
				ans += y;
			}
		}

		System.out.println(ans);
	}
}