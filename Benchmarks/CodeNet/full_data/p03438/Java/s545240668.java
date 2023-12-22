import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long a[] = new long[n];
		long b[] = new long[n];
		boolean e = false;
		boolean yes = true;
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		for (int i = 0; i < n; i++)
			b[i] = sc.nextInt();
		while (yes) {
			int i = 0;
			int j = 0;
			if (Arrays.equals(a, b)) {
				e = true;
				break;
			}
			e = false;
			for (i = 0; i < n; i++) {
				if (b[i] - a[i] >= 2) {
					for (j = 0; j < n; j++) {
						if (a[j] - b[j] >= 1) {
							a[i] += 2;
							b[j] += 1;
							e = true;
							break;
						}
					}
				}
				if (e || !yes) break;
				if (i == n - 1)
					yes = false;
			}
		}
		if (e)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
