import java.util.Scanner;

public class Main {
	private static int N, M;
	private static int cnt = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		int[] a = new int[M];
		for (int i = 0; i < M; i++) {
			a[i] = sc.nextInt();
		}

		check(0 , a);

		System.out.println(cnt % 1000000007);
	}

	private static void check(int step, int[] a) {
		if (step >= N - 1) {
			cnt++;
			return;
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] == step) {
				//System.out.println("引っかかった");
				return;
			}
		}

		check(step + 1, a);
		check(step + 2, a);
	}
}