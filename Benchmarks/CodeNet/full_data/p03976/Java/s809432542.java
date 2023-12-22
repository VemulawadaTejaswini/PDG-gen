import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int K = sc.nextInt();
		long[] hist = new long[26];
		for (int i = 0; i < N; ++i) {
			hist[sc.next().charAt(0) - 'A']++;
		}
		for (int i = 1;; ++i) {
			int sum = 0;
			for (int j = 0; j < hist.length; ++j) {
				sum += Math.min(i, hist[j]);
			}
			if (sum < K * i) {
				System.out.println(i - 1);
				return;
			}
		}

	}
}
