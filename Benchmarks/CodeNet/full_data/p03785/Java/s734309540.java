
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int C = in.nextInt();
		int K = in.nextInt();
		int[] T = new int[N];
		for (int i = 0; i < N; i++) {
			T[i] = in.nextInt();
		}
		Arrays.sort(T);
		long max = T[0] + K;
		int ans = 0;
		int count = 0;
		int index = 0;
		while (index < N) {
			count++;
			if (T[index] > max) {
				ans++;
				count = 0;
				max = T[index] + K;
			} else if (count == C) {
				ans++;
				count = 0;
				if (index + 1 < N) {
					max = T[index + 1] + K;
				}
				index++;
			} else if (index == N - 1) {
				ans++;
				index++;
			} else {
				index++;
			}
		}
		System.out.println(ans);
		in.close();
	}
}