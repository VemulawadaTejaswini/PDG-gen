import java.util.Scanner;

public class Main {

	public static int A[];

	public static void main(String[] args) {
		//Input
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());

		A = new int[N];
		for(int i = 0 ; i < N ; i++ ) {
			A[i] = Integer.parseInt(sc.next());
		}

		sc.close();

		//Logic
		long answer = dp(N, 0);

		//Output
		System.out.println(answer);

	}

	public static long dp(int i, int j) {
		if(i == 0 && j == 0) {
			return 0;
		} else if (i == 0 && j == 1) {
			return -1000000000*100;
		}

		if(j == 0) {
			long l = dp(i-1, 0)+A[i-1];
			long r = dp(i-1, 1)-A[i-1];
			return Math.max(l, r);
		} else {
			long l = dp(i-1, 0)-A[i-1];
			long r = dp(i-1, 1)+A[i-1];
			return Math.max(l, r);
		}

	}

}
