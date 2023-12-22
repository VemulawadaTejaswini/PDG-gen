import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] a = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
		}
		int ans = 0;
		for (int i = 1; i <= n; i++) {
			if (a[a[i]] == i) {
				ans++;
			}
		}
		System.out.println(ans / 2);
	}
}