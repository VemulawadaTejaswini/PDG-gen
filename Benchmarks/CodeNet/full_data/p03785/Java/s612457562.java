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
		long max = 0;
		int ans = 0;
		int count = 0;
		for (int i = 0; i < N; i++) {
			if (T[i] > max || count >= C) {
				ans++;
				max = T[i] + K;
				count = 0;
			}
			count++;
		}
		System.out.println(ans);
		in.close();
	}
}