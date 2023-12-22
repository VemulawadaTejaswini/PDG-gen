import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		Long[] A = new Long[N];
		long sum = 0;
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
			sum += A[i];
		}
		sc.close();

		// 配列を降順ソート
		Arrays.sort(A, Collections.reverseOrder());
		long minus = 0;
		while (M > 0) {
			long result = (long) Math.floor(A[0] / 2.0);
			minus += A[0] - result;
			A[0] = result;
			Arrays.sort(A, Collections.reverseOrder());
			M--;
		}
		System.out.println(sum - minus);
	}
}
