
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.next());
		int K = Integer.parseInt(scan.next());
		int[] x = new int[N];
		for (int i = 0; i < N; i++) {
			x[i] = Integer.parseInt(scan.next());
		}
		int time;
		int minTime;
		minTime = Math.min(Math.abs(x[0]) + Math.abs(x[K - 1] - x[0]), Math.abs(x[K - 1] + Math.abs(x[K - 1] - x[0])));
		for (int i = 1; i < N - K + 1; i++) {
			time = Math.min(Math.abs(x[i]) + Math.abs(x[K + i - 1] - x[i]),
					Math.abs(x[K + i - 1] + Math.abs(x[K + i - 1] - x[i])));
			minTime = Math.min(minTime, time);
		}
		System.out.println(minTime);
	}
}
