import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();

		int[][] X = new int[N][D];
		for ( int n = 0 ; n < N ; n++ ) {
			for ( int d = 0 ; d < D ; d++ ) {
				X[n][d] = sc.nextInt();
			}
		}

		int cnt = 0;
		for ( int i = 0 ; i < N ; i++ ) {
			for ( int j = i + 1 ; j < N ; j++ ) {
				int sqSum = squareSum(X[i], X[j]);
				int sqrt = (int) Math.round(Math.sqrt(sqSum));
				if ( sqrt * sqrt == sqSum ) {
					cnt++;
				}
			}
		}

		System.out.println(cnt);
	}

	public static int squareSum(int[] a, int[] b) {
		int sum = 0;
		for ( int d = 0 ; d < a.length ; d++ ) {
			sum += (a[d] - b[d]) * (a[d] - b[d]);
		}
		return sum;
	}

}
