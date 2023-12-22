import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), T = sc.nextInt(), t[] = new int[N], ans = 0;
		for (int i = 0; i < N; ++i) t[i] = sc.nextInt();
		sc.close();
		for (int i = 1; i < N; ++i) {
			if (t[i] - t[i - 1] > T) ans += T;
			else ans += t[i] - t[i - 1];
		}
		System.out.print(ans + T);
	}
}