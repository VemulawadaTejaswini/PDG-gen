import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	int LEN = (int)1e6 + 1;
	void doIt() {
		int N = sc.nextInt();
		int[] X = new int[N];
		for(int i = 0; i < N; i++) {
			X[i] = sc.nextInt();
		}
		/*int min = MAX;
		for(int i = 1; i <= 100; i++) {
			int sum = 0;
			for(int j = 0; j < N; j++) {
				sum += (X[j] - i) * (X[j] - i);
			}
			min = Math.min(min, sum);
		}
		System.out.println(min);*/
		int sum = 0;
		for(int i = 0; i < N; i++) {
			sum += X[i];
		}
		int avg = (int)Math.round((double)sum / N);
		sum = 0;
		for(int i = 0; i < N; i++) {
			sum += (X[i] - avg) * (X[i] - avg);
		}
		System.out.println(sum);
		
		
	}

	public static void main(String[] args) {
		new Main().doIt();
	}

}
