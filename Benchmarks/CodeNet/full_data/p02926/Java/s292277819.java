import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Vec[] arr = new Vec[n];
		for (int i = 0; i < n; i++) {
			Vec v = new Vec();
			v.x = sc.nextInt();
			v.y = sc.nextInt();
			v.atan = Math.atan2(v.y, v.x);
			arr[i] = v;
		}
		sc.close();

		Arrays.sort(arr, (a, b) -> Double.compare(a.atan, b.atan));

		double ans = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < i + n; j++) {
				int x = 0;
				int y = 0;
				for (int k = i; k <= j; k++) {
					x += arr[k % n].x;
					y += arr[k % n].y;
				}
				ans = Math.max(ans, Math.hypot(x, y));
			}
		}
		System.out.println(ans);
	}

	static class Vec {
		int x, y;
		double atan;
	}
}
