import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long a[] = new long[N+1];
		long b[] = new long[N];

		for (int i = 0; i < N+1; i++) {
			a[i] =sc.nextLong();
		}
		for (int i = 0; i < N; i++) {
			b[i] = sc.nextLong();
		}

		long cnt = 0;
		for (int i = 0; i < N; i++) {
			if (a[i] <= b[i]) {
				cnt += a[i];

				if (a[i+1] >= ( b[i] - a[i])) {
					cnt += (b[i] - a[i]);
					a[i+1] = a[i+1] - ( b[i] - a[i]);
				} else {
					cnt += a[i+1];
					a[i+1] = 0;
				}
			} else {
				cnt += b[i];
			}
		}
		System.out.println(cnt);
	}
}
