import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println(solve());
	}
	
	public static long solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] V = new long[N];
		for (int i = 0; i < N; i++) {
			V[i] = sc.nextLong();
		}
		
		for (int i = 0; i < N - 1; i++) {
			if (V[i] < 0) {
				V[i] = (-1) * V[i];
				V[i + 1] = (-1) * V[i + 1];
			}
		}
		
		long sum = 0;
		for (int i = 0; i < V.length; i++) {
			sum += V[i];
		}
		return sum;
	}
}
