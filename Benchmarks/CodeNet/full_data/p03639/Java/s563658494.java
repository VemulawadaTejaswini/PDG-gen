import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int[] a = new int[n];
		int cnt4 = 0;
		int cnt2 = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			if (a[i] % 4 == 0) {
				cnt4++;
			} else if (a[i] % 4 != 0 && a[i] % 2 == 0) {
				cnt2++;
			}
		}
		if (n % 2 == 0) {
			n = n - cnt4 * 2 - cnt2;
		} else {
			n = n - cnt4 * 2;
			if (n == 1) {
				n = 0;
			} else {
				n = n - cnt2;
			}
		}
		if (n <= 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}