import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		int ans = 0, l = 0, r = 0;

		for (int i = 0; i < m; i++) {
			int b = sc.nextInt();
			if (x < b) {
				r++;
			} else {
				l++;
			}
		}

		if (r < l) {
			ans = r;
		} else {
			ans = l;
		}

		System.out.println(ans);

		sc.close();
	}
}
