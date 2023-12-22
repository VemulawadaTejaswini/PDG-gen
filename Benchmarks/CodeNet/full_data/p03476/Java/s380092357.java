import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		boolean[] prime = new boolean[100001];
		prime[2] = true;
		for (int i = 3; i < 100001; i++) {
			boolean b = true;
			for (int j = 2; j * j <= i; j++) {
				if (i % j == 0) {
					b = false;
					break;
				}
			}
			if (b) {
				prime[i] = true;
			}
		}

		int n = sc.nextInt();
		int l, r, cnt;
		for (int i = 0; i < n; i++) {
			l = sc.nextInt();
			r = sc.nextInt();
			cnt = 0;
			for (int j = l; l <= r; l = l + 2) {
				if (prime[l] && prime[(l + 1) / 2]) {
					cnt++;
				}
			}
			sb.append(cnt +"\n");
		}
		System.out.print(sb);
	}
}
