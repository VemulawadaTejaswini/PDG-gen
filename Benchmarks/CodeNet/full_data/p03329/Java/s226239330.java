import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		int ans = 0, a = 1, b = 1;

		while (n >= 81) {
			a = 1;
			while (n >= Math.pow(9, a)) {
				a++;
			}
			if (a != 1) {
				a--;
				n -= Math.pow(9, a);
				ans++;
			}
		}
		while (n >= 36) {
			b = 1;
			while (n >= Math.pow(6, b)) {
				b++;
			}
			if (b != 1) {
				b--;
				n -= Math.pow(6, b);
				ans++;
			}
		}
		while (n > 14) {
			n -= 9;
			ans++;
		}
		while (n >= 6) {
			n -= 6;
			ans++;
		}
		ans += n;

		System.out.println(ans);

		sc.close();
	}
}
