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

			if (tmp < 0) {
				F++;
			} else if (tmp > 0) {
				Z++;
			} else {
				ZERO = 1;
			}

			DATA[i] = tmp;
		}

		if (Z == 0) {
			System.out.println(Math.abs(DATA[N - K]));
			return;
		} else if (F == 0) {
			System.out.println(Math.abs(DATA[K - 1]));
			return;
		}

		int start = 0;
		if (F > K) {
			start = F - K + ZERO;
		}

		int end = N - K;
		if (Z > K) {
			start = F;
		}

		for (int i = start; i <= end; i++) {
			int startValue = DATA[i];
			int endValue = DATA[i + K - 1];

			if (startValue * endValue < 0) {
				int bigger = Math.max(Math.abs(startValue), Math.abs(endValue));
				int smaller = Math.min(Math.abs(startValue), Math.abs(endValue));

				int tempAnswer = 2 * smaller + bigger;
				if (ANSWER > tempAnswer) {
					ANSWER = tempAnswer;
				}
			} else {
				int tempAnswer = Math.max(Math.abs(startValue), Math.abs(endValue));

				if (ANSWER > tempAnswer) {
					ANSWER = tempAnswer;
				}
			}
		}

		System.out.println(ANSWER);

	}
}