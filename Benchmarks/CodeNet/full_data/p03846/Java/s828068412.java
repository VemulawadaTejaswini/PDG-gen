import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[Integer.parseInt(sc.next())]++;
		}

		long ans = 1;
		boolean flag = false;
		for (int i = 0; i < n; i++) {
			if (n % 2 == 1) {
				if (i % 2 == 0) {
					if (i == 0) {
						if (a[i] != 1) {
							flag = true;
							break;
						}
					} else {
						if (a[i] != 2) {
							flag = true;
							break;
						}
					}
				} else {
					if (a[i] != 0) {
						flag = true;
						break;
					}
				}
			} else {
				if (i % 2 == 1) {
					if (a[i] != 2) {
						flag = true;
						break;
					}
				} else {
					if (a[i] != 0) {
						flag = true;
						break;
					}
				}
			}
		}
		if (!flag) {
			for (int i = 0; i < n / 2; i++) {
				ans *= 2;
				ans %= 1000000007;
			}
			System.out.println(ans);
		} else {
			System.out.println(0);
		}
		sc.close();
	}
}
