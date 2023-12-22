import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		if(K == 0) {
			System.out.println(N * N);
			return;
		}
		long ans = 0;
		for(int i = K+1; i <= N; i++)
			ans += N / i * (i - K) + Math.max(0, N % i - K + 1);
		System.out.println(ans);
	}

}