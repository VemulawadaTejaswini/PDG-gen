import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int x = scanner.nextInt();
		int dis[] = new int[n];
		int ans = 0;

		int min = 2000000000;
		for (int i = 0; i < n; i++) {
			int tar = Math.abs(scanner.nextInt() - x);
			min = Math.min(min, tar);
			dis[i] = tar;
		}

		boolean judge = true;
		for (int j = min; j > 0; j /= 2) {
			if (j == 1) {
				System.out.println(1);
				return;
			}
			for (int i = 0; i < n; i++) {
				if (dis[i] % j != 0 && j % 2 == 1) {
					System.out.println(1);
					return;
				}
				if (dis[i] % j != 0) {
					judge = false;
					break;
				} else {
					judge = true;
					ans = j;
				}
			}
			if (judge) {
				System.out.println(ans);
				return;
			}
		}

	}
}