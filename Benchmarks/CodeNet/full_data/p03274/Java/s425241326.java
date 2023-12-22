import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		long []x = new long[N];
		for(int i = 0; i < N; i++) {
			long t = scan.nextLong();
			x[i] = t;
		}
		scan.close();
		if(N == 1) {
			System.out.println(Math.abs(x[0]));
			System.exit(0);
		}
		if(K == 1) {
			long min = Math.abs(x[0]);
			for(int i = 0; i < N; i++) {
				if(min < Math.abs(x[i])) {
					min = Math.abs(x[i]);
				}
			}
			System.out.println(min);
			System.exit(0);
		}
		long []y = new long[N - 1];
		for(int i = 0; i < N - 1; i++) {
			y[i] = Math.abs(x[i + 1] - x[i]);
		}
		long []B = new long[N];
		B[0] = 0;
		for(int i = 1; i < N; i++) {
			B[i] = y[i - 1] + B[i - 1];
		}
		long min = Long.MAX_VALUE;
		for(int i = 1; i < N - K; i++) {
			long t = B[i + K - 1] - B[i] + Math.min(Math.abs(x[i]), Math.abs(x[i + K - 1]));
			if(min > t) {
				min = t;
			}
		}
		System.out.println(min);
//		for(long i : y) {
//			System.out.println(i);
//		}


	}
}