import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		// aがnより大きいパタン
		if (a >= n) {
			System.out.println(a);
		}
		// bがnより大きいばたん
		else if (b >= n) {
			System.out.println(a);
		}
		// a+bがnより大きいパタン
		else if ((a + b) >= n) {
			System.out.println(a);
		}
		// a+nがn以下のパタン
		else {
			int ab = a + b;
			int count = n / ab;
			int remainder = n % ab;
			int ans = a * count;
			if (remainder >= a) {
				ans = ans + a;
			} else {
				ans = ans + remainder;
			}
			System.out.println(ans);
		}
	}
}
