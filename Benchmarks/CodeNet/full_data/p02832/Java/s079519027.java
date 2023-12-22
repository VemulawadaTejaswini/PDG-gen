
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println(solve());
	}

	public static int solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] t = new int[N];

		for (int i = 0; i < N; i++) {
			t[i] = sc.nextInt();
		}

		int k = 1;
		int sum = 0;
		for (int j = 0; j < N; j++) {
			if (t[j] == k) {
				sum++;
				k++;
			}
		}

		int res = N - sum;
		if (sum == 0) {
			res = -1;
		}

		return res;
	}
}
