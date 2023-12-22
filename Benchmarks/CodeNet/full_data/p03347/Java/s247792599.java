import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = Long.parseLong(sc.next());
		if (a[0] != 0) {
			System.out.println("-1");
			return;
		}
		long ans = 0;
		for (int i = n - 1; i >= 1; i--) {
			if (a[i] - a[i - 1] == 1) {
				ans++;
			}
			else if (a[i] % (a[i - 1] + 1) == 0) {
				ans += a[i] / (a[i - 1] + 1);
			}
			else {
				ans += a[i];
			}
		}
		System.out.println(ans);
	}
}