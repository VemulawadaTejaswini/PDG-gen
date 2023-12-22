import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int k = sc.nextInt();
		int s = sc.nextInt();

		int ans = 0;
		if (s < 2) {
			System.out.println(ans);
			return;
		}

		for (int x = 0; x <= k; x++) {
			if (x > s)
				break;
			if (x == s) {
				ans++;
				break;
			}
			if (s - x > k * 2) {
				continue;
			}
			for (int y = 0; y <= k; y++) {
				if (y > s)
					break;
				if (x + y == s) {
					ans++;
					break;
				}
				if (s - x - y > k) {
					continue;
				}
				for (int z = 0; z <= k; z++) {
					if (z > s)
						break;
					if (x + y + z == s) {
						ans++;
						break;
					}
				}
			}
		}
		System.out.println(ans);
		sc.close();
	}
}