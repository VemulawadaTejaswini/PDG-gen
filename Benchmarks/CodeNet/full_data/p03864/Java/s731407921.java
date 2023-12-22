import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int cnt = 0;
		for (int i = 1; i < n; i++) {
			if (a[i - 1] + a[i] <= x) {
			} else {
				if (a[i - 1] <= x) {
					cnt += a[i] - (x - a[i - 1]);
					a[i] = x - a[i - 1];
				} else {
					cnt += a[i] + (a[i - 1] - x);
					a[i] = 0;
					a[i - 1] = a[i - 1] - (x - a[i]);
				}
			}
		}
		System.out.println(cnt);
	}
}
