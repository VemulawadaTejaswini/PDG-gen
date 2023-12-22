import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}

		for (int i = 0; i < n; i++) {
			long b = sc.nextLong();
			if (a[i] < b) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}
