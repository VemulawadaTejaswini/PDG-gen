import java.io.InputStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
	}

	private static void solve(InputStream is) {
		try (Scanner cin = new Scanner(is)) {
			int a = cin.nextInt();
			int b = cin.nextInt();
			int c = cin.nextInt();
			int x = cin.nextInt();

			int ans = 0;
			int sum;

			for (int ai = 0; ai <= a; ai++) {
				for (int bi = 0; bi <= b; bi++) {
					for (int ci = 0; ci <= c; ci++) {
						sum = (500 * ai + 100 * bi + 50 * ci);
						if (sum == x) {
							ans++;
							break;
						} else if (sum > x) {
							break;
						}
					}
				}
			}
			System.out.println(ans);
		}
	}
}