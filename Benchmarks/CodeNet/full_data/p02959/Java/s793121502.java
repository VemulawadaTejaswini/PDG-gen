
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] a = new int[n + 1];
			int[] b = new int[n];
			long result = 0;

			for (int i = 0; i <= n; i++) {
				a[i] = sc.nextInt();
			}
			for (int i = 0; i < n; i++) {
				b[i] = sc.nextInt();
			}

			int before = 0;
			for (int i = 0; i < n; i++) {
				// bがのこり倒せる数
				int tmp = b[i] - (a[i] - before);
				if (tmp < 0) {
					// 全部
					result += b[i];
					before = 0;
				} else {
					// a[i]を全滅
					result += (a[i] - before);
					// 倒したかず
					int tmp2 = a[i + 1] - tmp;
					if  (tmp2 < 0) {
						result += a[i + 1];
						before = a[i + 1];
					} else {
						result += tmp;
						before = tmp;
					}
				}
			}

			System.out.println(result);
		}
	}
}
