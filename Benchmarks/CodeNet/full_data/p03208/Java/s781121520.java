
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.next());
		int K = Integer.parseInt(scan.next());
		int[] h = new int[N];
		for (int i = 0; i < N; i++) {
			h[i] = Integer.parseInt(scan.next());
		}
		Arrays.sort(h);
		int[] h_diff = new int[N - 1];
		for (int i = 0; i < N - 1; i++) {
			h_diff[i] = Math.abs(h[i + 1] - h[i]);
		}

		int diffMin = 0;
		for (int i = 0; i < K - 1; i++) {
			diffMin += h_diff[i];
		}
		int diff = 0;
		for (int i = K - 1; i < N - 1;) {
			diff = 0;
			for (int j = i; j < i + K - 1; j++) {
				diff += h_diff[j];
			}
			if (diff < diffMin) {
				diffMin = diff;
			}
			i += K - 1;
		}
		System.out.println(diffMin);
	}
}
