import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int []h = new int[N];
		for(int i = 0; i < N; i++) {
			h[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(h);
		int e = Integer.MAX_VALUE;

		for(int i = 0; i <= N - K; i++) {
			int t = h[i + K - 1] - h[i];
			//System.out.println(h[i]);
			e = Math.min(e, t);
		}
		System.out.println(e);
	}
}