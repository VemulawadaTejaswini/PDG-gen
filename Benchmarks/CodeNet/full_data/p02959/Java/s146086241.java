import java.util.Scanner;

class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt(), cnt = 0;
		int[] a = new int[N + 1], b = new int[N];
		for (int i = 0; i <= N; i++)
			a[i] = sc.nextInt();
		for (int i = 0; i < N; i++)
			b[i] = sc.nextInt();
		for (int i = 0; i < N; i++) {
			if (a[i] < b[i]) {
				cnt += a[i];
				b[i] -= a[i];
				if (a[i + 1] < b[i]) {
					cnt += a[i + 1];
					a[i + 1] = 0;
				} else {
					cnt += b[i];
					a[i + 1] -= b[i];
				}
			} else {
				cnt += b[i];
			}
		}
		System.out.println(cnt);
	}
}