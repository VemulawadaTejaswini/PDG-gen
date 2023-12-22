import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static int N, K, ZERO = 0, Z = 0, F = 0;
	static int ANSWER = Integer.MAX_VALUE;
	static int[] DATA;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] lineArr = br.readLine().split(" ");
		N = Integer.parseInt(lineArr[0]);
		K = Integer.parseInt(lineArr[1]);

		DATA = new int[N];

		lineArr = br.readLine().split(" ");

		int tmp;
		for (int i = 0; i < N; i++) {
			tmp = Integer.parseInt(lineArr[i]);

			if (tmp < 0)
				F++;
			else if (tmp > 0)
				Z++;
			else
				ZERO = 1;

			DATA[i] = tmp;
		}

		int start = 0;
		int end = N - K;

		if (F > K)
			start = F - K + ZERO;

		if (Z > K)
			end = F + ZERO;

		if (N == K) {
			int bigger = Math.max(Math.abs(DATA[0]), DATA[N - 1]);
			int smaller = Math.min(Math.abs(DATA[0]), DATA[N - 1]);

			ANSWER = 2 * smaller + bigger;

			System.out.println(ANSWER);

			return;
		}

		int tmpAnswer;
		for (int i = start; i < end; i++) {
			int startValue = DATA[i];
			int endValue = DATA[i + K - 1];

			if (startValue * endValue < 0) {
				int bigger = Math.max(Math.abs(startValue), endValue);
				int smaller = Math.min(Math.abs(startValue), endValue);
				tmpAnswer = 2 * smaller + bigger;

				if (ANSWER > tmpAnswer) {
					ANSWER = tmpAnswer;
				}
			} else {
				tmpAnswer = Math.max(Math.abs(startValue), endValue);

				if (ANSWER > tmpAnswer) {
					ANSWER = tmpAnswer;
				}
			}
		}

		System.out.println(ANSWER);

	}
}