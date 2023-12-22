import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		String[] s = new String[n];
		int m = 0, a = 0, r = 0, c = 0, h = 0, each = 0;
		long ans = 0;
		
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();

			if (s[i].startsWith("M")) {
				each += m == 0 ? 1 : 0;
				m++;
			} else if (s[i].startsWith("A")) {
				each += a == 0 ? 1 : 0;
				a++;
			} else if (s[i].startsWith("R")) {
				each += r == 0 ? 1 : 0;
				r++;
			} else if (s[i].startsWith("C")) {
				each += c == 0 ? 1 : 0;
				c++;
			} else if (s[i].startsWith("H")) {
				each += h == 0 ? 1 : 0;
				h++;
			}
		}
		
		ans += m * a * r;
		ans += m * a * c;
		ans += m * a * h;
		ans += m * r * c;
		ans += m * r * h;
		ans += m * c * h;
		ans += a * r * c;
		ans += a * r * h;
		ans += a * c * h;
		ans += r * c * h;
		
		System.out.println(ans);

		sc.close();
	}
}
