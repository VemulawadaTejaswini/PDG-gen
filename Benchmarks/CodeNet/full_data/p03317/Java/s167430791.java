import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		int n = N - 1;
		int k = K - 1;
		int ans = 0;
		if (n % k != 0) {
			ans = (n / k) + 1;
		} else {
			ans = n / k;
		}
		System.out.println(ans);
	}
}
