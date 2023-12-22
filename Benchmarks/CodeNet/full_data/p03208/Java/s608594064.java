import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long N = sc.nextInt();
		long K = sc.nextInt();
		long Hs[] = new long[(int) N];
		int min = 99999999;
		for (int i = 0; i < N; i++) {
			Hs[i] = sc.nextInt();
		}
		Arrays.sort(Hs);

		for (int i = 0; i <= N - K; i++) {

			int min_ = (int) (Hs[(int) (i + K - 1)] - Hs[i]);

			if (min > min_) {
				min = min_;
			}


		}

		System.out.println(min);
	}
}
