import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int ans = 0, big = 0, mid = 0, sma = 0;
		
		if (a >= b && a >= c) {
			// big = a;
			if (b >= c) {
				mid = a - b;
				sma = a - c;
			} else {
				mid = a - c;
				sma = a - b;
			}
		} else if (b >= a && b >= c) {
			// big = b;
			if (a >= c) {
				mid = b - a;
				sma = b - c;
			} else {
				mid = b - c;
				sma = b - a;
			}
		} else {
			// big = c;
			if (b >= a) {
				mid = c - b;
				sma = c - a;
			} else {
				mid = c - a;
				sma = c - b;
			}
		}
		
		while (sma > 0) {
			if (mid > 0 && sma > 0) {
				mid--;
				sma--;
				ans++;
			} else {
				sma -= 2;
				ans++;
			}
		}
		
		if (sma != 0) {
			ans++;
		}
		
		System.out.println(ans);

		sc.close();
	}
}
