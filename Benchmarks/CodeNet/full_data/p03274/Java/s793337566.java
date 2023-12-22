import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{

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
		if (F > K)
			start = F - K + ZERO;

		int end = N - K;
		if (Z > K)
			end = F;

		if (start == end) {
			int startValue = DATA[start];
			int endValue = DATA[start + K - 1];
			if (startValue * endValue < 0) {
				int bigger = Math.max(Math.abs(startValue), Math.abs(endValue));
				int smaller = Math.min(Math.abs(startValue), Math.abs(endValue));
				ANSWER = 2 * smaller + bigger;
			} else if (startValue < 0) {
				ANSWER = Math.abs(startValue);
			} else if (startValue >= 0) {
				ANSWER = endValue;
			}

			System.out.println(ANSWER);

			return;
		}

		int tmpAnswer;
		for (int i = start; i <= end; i++) {
			int startValue = DATA[i];
			int endValue = DATA[i + K - 1];

			if (startValue * endValue >= 0) {
				tmpAnswer = Math.max(Math.abs(startValue), Math.abs(endValue));

				if (ANSWER > tmpAnswer) {
					ANSWER = tmpAnswer;
				}
			} else {
				int bigger = Math.max(Math.abs(startValue), Math.abs(endValue));
				int smaller = Math.min(Math.abs(startValue), Math.abs(endValue));
				tmpAnswer = 2 * smaller + bigger;

				if (ANSWER > tmpAnswer) {
					ANSWER = tmpAnswer;
				}
			}

		}

		System.out.println(ANSWER);
	}
}