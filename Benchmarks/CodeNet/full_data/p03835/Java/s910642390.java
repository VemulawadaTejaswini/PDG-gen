import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		int s = scanner.nextInt();

		int ans = 0;
		for (int x = 0; x <= k; x++) {
			for (int y = s - x; y <= 2 * k; y++) {
				int z = s - x - y;
				if (x + y + z == s) {
					ans++;
				}
			}
		}

		System.out.println(ans);
	}
}
