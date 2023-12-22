import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int cnt = 0;

		if (k == 0) {
			System.out.println(n * n);
			return;
		}

		for (int b = k + 1; b <= n; b++) {
			cnt += b - k;
			cnt += (n - k) / b;
		}

		System.out.println(cnt);
	}
}
