import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long x[] = new long[N];
		long y[] = new long[N];
		long h[] = new long[N];
		for (int i = 0; i < N; i++) {
			x[i] = sc.nextLong();
			y[i] = sc.nextLong();
			h[i] = sc.nextLong();
		}
		for (int X = 0; X <= 100; X++) {
			for (int Y = 0; Y <= 100; Y++) {
				long temp = 0;
				boolean b = true;
				for (int i = 0; i < N; i++) {
					long t = Math.abs(X - x[i]) + Math.abs(Y - y[i]) + h[i];
					if (h[i] > 0) {
						if (temp == 0) {
							temp = t;
						} else {
							if (t != temp) {
								b = false;
								break;
							}
						}
					}
				}
				if (b == true && temp > 0) {
					System.out.println(X + " " + Y + " " + temp);
					return;
				}
			}
		}

		for (int X = 0; X <= 100; X++) {
			for (int Y = 0; Y <= 100; Y++) {
				boolean b = true;
				for (int i = 0; i < N; i++) {
					long t = Math.abs(X - x[i]) + Math.abs(Y - y[i]);
					if (1 - t > 0) {
						b = false;
						break;
					}
				}
				System.out.println(X + " " + Y + " " + 1);
				return;
			}
		}

	}
}