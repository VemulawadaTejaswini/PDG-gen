import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[][] za = new long[N][2];
		
		for(int i = 0; i < N; i++) {
			za[i][0] = sc.nextLong();
			za[i][1] = sc.nextLong();
		}
		
		Arrays.sort(za, (a1, a2) -> Long.compare(a1[1], a2[1]));
		int total = 100;
		
		for(int k = 0; k < N; k++) {
			if(k == N - 1) {
				int cost = N;
				total = Math.min(cost, total);
			}
			for(int i = k + 1; i < N; i++) {
				long p = za[i][0] - za[k][0];
				long q = za[i][1] - za[k][1];
				int cost = i;
				if(i + i - k > N - 1) {
					cost += N - 1 - i;
				}
				for(int j = i + i - k; j < N; j += i - k) {
					if(za[j][0] == za[j - (i - k)][0] + p && za[j][1] == za[j - (i - k)][1] + q) {
						cost += i - k - 1;
					} else {
						cost += i - k;
					}
					if(j + i - k > N - 1) {
						cost += N - 1 - j;
					}
				}
				total = Math.min(total, cost);
			}
		}
		if(N > 1) {
			System.out.println(total);
		} else {
			System.out.println(1);
		}
	}
}
