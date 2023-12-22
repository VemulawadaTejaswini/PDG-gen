import java.util.Scanner;

public class Main {

	static int mod = 1000000007;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[in.nextInt()]++;
		}
		long ans = 1;
		if (N % 2 == 0 && A[0] == 0) {
			for (int i = 1; i < N; i += 2) {
				if (A[i] != 2) {
					ans = 0;
					break;
				}
				ans *= 2 % mod;
			}
		} else if (N % 2 != 0 && A[0] == 1) {
			for (int i = 2; i < N; i += 2) {
				if (A[i] != 2) {
					ans = 0;
					break;
				}
				ans *= 2 % mod;
			}
		} else {
			ans = 0;
		}
		System.out.println(ans);
		in.close();
	}
}