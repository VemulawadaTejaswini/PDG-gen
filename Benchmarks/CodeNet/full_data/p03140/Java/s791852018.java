import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		char[] a = sc.next().toCharArray(), b = sc.next().toCharArray(), c = sc.next().toCharArray();
		int ans = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] == b[i] && a[i] == c[i]) {
			} else if (a[i] == b[i] || a[i] == c[i] || b[i] == c[i]) {
				ans += 1;
			} else {
				ans += 2;
			}
		}
		System.out.println(ans);
	}
}