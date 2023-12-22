import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int ans = 0;
		if (m % n == 0) {
			ans = m / n;
		} else {
			int tmp = m / n;
			while (true) {
				if ((m - tmp * n) % tmp == 0) {
					break;
				} else {
					tmp--;
				}
			}
			ans = tmp;
		}
		System.out.println(ans);
	}
}