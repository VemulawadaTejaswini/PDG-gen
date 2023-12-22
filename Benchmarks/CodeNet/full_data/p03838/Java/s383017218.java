import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int ans = 0;
		if (x > y) {
			if (x < 0) {
				ans++;
				y *= -1;
			} else if (y >= 0) {
				ans++;
				x *= -1;
			} else {
				if (Math.abs(x) >= Math.abs(y)) {
					ans++;
					x *= -1;
				} else {
					ans++;
					y *= -1;
				}
			}
		}
		if (x >= 0) {
			ans += y - x;
		} else if (y <= 0) {
			ans += y - x;
		} else {
			if (Math.abs(x) <= y) {
				ans += y - Math.abs(x) + 1;
			} else {
				ans += y - x;
			}
		}
		System.out.println(ans);
	}
}
