import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int p[] = new int[N];
		double expectedValue[] = new double[N];

		for (int i = 0; i < N; i++) {
			p[i] = sc.nextInt();
			expectedValue[i] = (double)(0.5*p[i]*(p[i]+1))/p[i];
		}

		double maxValue = 0;
		for (int i = 0; i < K; i++) {
			maxValue += expectedValue[i];
		}

		double tmp = maxValue;
		for (int i = 0; i <N; i++) {
			if (K + i < N) {
				tmp = tmp - expectedValue[i] + expectedValue[K + i];
			}
			if (maxValue < tmp) maxValue = tmp;
		}

		System.out.println(maxValue);
	}
}