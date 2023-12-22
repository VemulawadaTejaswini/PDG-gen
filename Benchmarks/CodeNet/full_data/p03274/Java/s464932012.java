import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static int N, K, Z = 0, F = 0;
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
			DATA[i] = Integer.parseInt(lineArr[i]);
			tmp = Integer.parseInt(lineArr[i]);

			if (tmp < 0) {
				F++;
			} else if (tmp == 0) {
				Z++;
			}

			DATA[i] = tmp;
		}

		int start = 0;
		if (F > K) {
			start = F - K + Z;
		}

		int tempAnswer;
		int startValue = DATA[start];
		int endValue = DATA[start + K - 1];

		for (int i = start + 1; i < N && startValue <= 0; i++) {
			if (endValue <= 0) {
				tempAnswer = Math.abs(startValue);
				if (ANSWER > tempAnswer) {
					ANSWER = tempAnswer;
				}
			} else if (startValue <= 0 && endValue > 0) {
				tempAnswer = endValue - startValue + Math.min(Math.abs(startValue), Math.abs(endValue));

				if (ANSWER > tempAnswer) {
					ANSWER = tempAnswer;
				}
			} else if (startValue > 0) {
				if (ANSWER > endValue) {
					ANSWER = endValue;
				}

			}

			if (i + K - 1 < N) {
				startValue = DATA[i];
				endValue = DATA[i + K - 1];
			} else {
				break;
			}
		}

		System.out.println(ANSWER);

	}
}