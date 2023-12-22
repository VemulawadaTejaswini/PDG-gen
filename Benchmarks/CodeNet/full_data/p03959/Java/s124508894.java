import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int t[] = new int[x];
		int a[] = new int[x];
		for (int i = 0; i < a.length; i++) {
			t[i] = scanner.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			a[x - 1 - i] = scanner.nextInt();
		}
		if (t[x - 1] != a[x - 1]) {
			System.out.println(0);
			return;
		}
		long ans = 0;
		for (int i = 0; i < a.length; i++) {
			ans = ans * Math.min(a[i], t[i]) % 1000000007;
		}
		System.out.println(ans);
	}
}