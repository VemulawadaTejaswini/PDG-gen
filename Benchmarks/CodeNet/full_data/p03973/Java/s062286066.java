
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int a[] = new int[N];
		int nowp = 1;
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}

		long ans = 0;
		for (int i = 0; i < a.length; i++) {
			// System.out.println("a[" + i + ":" + a[i]);
			// System.out.println("po:" + nowp);
			if (a[i] == nowp) {
				nowp++;
				// System.out.println("nowp++");
				continue;

			}
			if (a[i] < nowp) {
				// System.out.println(ans);
				continue;
			}
			// System.out.println(ans + a[i] / nowp - 1);
			if (a[i] % nowp == 0 || nowp == 1) {
			ans = ans + a[i] / nowp-1;
			if (nowp == 1) {
				nowp++;
			}
			} else {
			ans = ans + a[i] / nowp;
			}

		}
		System.out.println(ans);

	}
}
