import java.util.*;

public class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		System.out.println(cal(n , cnt));
	}

	private static int cal(int n, int cnt) {
		if (n < 6) return cnt + n;
		else if (n >= 6 && n < 9) return cnt + 1 + n % 6;
		else if (n >= 9 && n < 36) {
			int min = n;
			for (int i = n / 9 ; i >= 0 ; i--) {
				int tmp = 0;
				tmp = i + (n - 9*i)/ 6 + (n-9*i) % 6;
				if (min > tmp) min = tmp;
			}
			return cnt + min;
		}
		else {
			int tmp6 = 1;
			int tmp9 = 1;
			for (int i = 1 ; Math.pow(6, i) <= n ; i++) {
				tmp6 = tmp6 * 6;
			}
			for (int i = 1 ; Math.pow(9, i) <= n ; i++) {
				tmp9 = tmp9 * 9;
			}
			if (tmp6 < tmp9) {
				return cal(n - tmp9, cnt + 1);
			} else {
				return cal(n - tmp6, cnt + 1);
			}
		}
	}
}
