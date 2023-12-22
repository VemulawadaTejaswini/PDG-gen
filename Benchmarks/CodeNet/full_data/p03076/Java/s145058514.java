import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		for (int i = 0; i < 5; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		int min = 10;
		int idx = 0;
		for (int i = 0; i < 5; i++) {
			int m = a[i] % 10;
			if (m == 0) m = 10;
			if (m < min) {
				min = m;
				idx = i;
			}
		}

		int ans = 0;
		for (int i = 0; i < 5; i++) {
			if (i != idx) {
				ans += a[i];
			}
			int m = ans % 10;
			if (m == 0) m = 10;
			ans += 10 - m;
		}
		System.out.println(ans + a[idx]);
	}
}
