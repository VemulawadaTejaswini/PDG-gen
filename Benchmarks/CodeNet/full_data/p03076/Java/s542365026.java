import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		int d = Integer.parseInt(sc.next());
		int e = Integer.parseInt(sc.next());
		int min = 10;
		if (a % 10 != 0) {
			if (a % 10 < min) {
				min = a % 10;
			}
			a = a / 10 * 10 + 10;
		}
		if (b % 10 != 0) {
			if (b % 10 < min) {
				min = b % 10;
			}
			b = b / 10 * 10 + 10;
		}
		if (c % 10 != 0) {
			if (c % 10 < min) {
				min = c % 10;
			}
			c = c / 10 * 10 + 10;
		}
		if (d % 10 != 0) {
			if (d % 10 < min) {
				min = d % 10;
			}
			d = d / 10 * 10 + 10;
		}
		if (e % 10 != 0) {
			if (e % 10 < min) {
				min = e % 10;
			}
			e = e / 10 * 10 + 10;
		}
		int ans = a + b + c + d + e - 10 + min;
		System.out.println(ans);
		sc.close();
	}
}