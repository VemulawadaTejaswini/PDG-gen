
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];
		float sum = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			sum += (float) a[i];
		}

		BigDecimal bd = new BigDecimal((float) sum / n);
		int ave = bd.ROUND_HALF_UP;

		System.out.println(sum);
		System.out.println(ave);

		int ans = 0;
		for (int i = 0; i < n; i++) {
			int tmp = ave - a[i];
			ans += tmp * tmp;
		}
		System.out.println(ans);

	}

	void run1() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int min = Integer.MAX_VALUE / 2;
		for (int i = -100; i <= 100; i++) {
			int sum = 0;
			for (int j = 0; j < n; j++) {
				int tmp = i - a[j];
				sum += tmp * tmp;
			}
			min = Math.min(min, sum);
		}
		System.out.println(min);
	}

	public static void main(String[] args) {
		new Main().run1();
	}

}
