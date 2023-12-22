import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int r = sc.nextInt();
		sc.close();

		int mod = 2019;
		int ml = l % mod;
		int mr = r % mod;
		if (ml == 0 || mr == 0 || l / mod < r / mod) {
			System.out.println(0);
		} else {
			int ans = mod;
			for (int i = ml; i < mr; i++) {
				for (int j = i + 1; j <= mr; j++) {
					int val = i * j % mod;
					ans = Math.min(ans, val);
				}
			}
			System.out.println(ans);
		}
	}
}
