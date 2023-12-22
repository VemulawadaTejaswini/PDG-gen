import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 要素の入力、格納
		int N = sc.nextInt();
		int K = sc.nextInt();
		int x[] = new int[N];
		int y[] = new int[N];
		String c[] = new String[N];
		for (int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			c[i] = sc.next();
		}
		int a = 0;
		int b = 0;
		int d = N;
		int ans = 0;

		for (int i = 0; i < K + 1; i++) {
			for (int j = 0; j < K + 1; j++) {
				a = 0;
				for (int k = 0; k < N; k++) {
					if (((x[k] + i) / K) % 2 == ((y[k] + j) / K) % 2) {
						if (c[k].equals("W")) {
							a++;
						}
					} else {
						if (c[k].equals("B")) {
							a++;
						}
					}
				}
				if (a > b) {
					b = a;
				}
				if (b < d) {
					d = b;
				}
			}
		}
		ans = Math.max(a, (N - d));

		// 出力
		System.out.println(ans);
	}
}
