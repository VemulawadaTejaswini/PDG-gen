import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int ans = 0;
		if (x >= 0 && y >= 0) {
			if (y >= x) {
				ans = y - x;
			} else if (y < x) {
				ans = x - y + 2;
			}
		} else if (x <= 0 && y <= 0) {
			if (y <= x) {
				ans = Math.abs(x - y) + 2;
			} else {
				ans = Math.abs(x - y);
			}
		} else {
			ans = Math.abs(x + y) + 1;
		}
		System.out.println(ans);
	}
}
