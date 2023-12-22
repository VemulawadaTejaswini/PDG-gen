import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sc.next());
		}

		int ans = 0;

		if (a[0] == 1) {
			ans = 1;
		} else if (n == a[0]) {
			ans = n;
		} else {

			for (int i = 1; i < n; i++) {
				if (a[0] > a[i])
					ans++;
			}
		}
		System.out.println(ans);
	}

}
