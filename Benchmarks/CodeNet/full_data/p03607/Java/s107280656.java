import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long a[] = new long[n];
		for (int i = 0; i <= n-1; i++) {
			a[i] = sc.nextLong();
		}
		Arrays.sort(a);
		long sta, gol;
		long ans = 0;
		sta = 0;
		gol = 0;
		long nag = 0;

		if (n != 1) {
			for (int i = 0; i <= n - 2; i++) {
				if (a[i] != a[i + 1]) {

					gol = i;
					nag = gol - sta + 1;
					sta=i+1;
					if (nag % 2 == 1) {

ans++;
					}
				} else if (i == n - 2 && (a[i] == a[i + 1])) {

					gol = i + 1;
					nag = gol - sta + 1;
					sta = i + 1;
					if (nag % 2 == 1) {
						ans++;
					}

				}

			}
		} else {

			ans = 1;

		}
		System.out.println(ans);
	}
}