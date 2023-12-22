import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long Hs[] = new long[N];
		long min = 999999999;
		for (int i = 0; i < N; i++) {
			Hs[i] = sc.nextInt();
		}
		Arrays.sort(Hs);

		for (int i = 0; i <= N - K; i++) {

			long min_ = (Hs[i + K - 1] - Hs[i]);

			if (min > min_) {
				min = min_;
			}


		}

		System.out.println(min);
	}
}
