import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextInt();
		long A[] = new long[N];
		for(int i = 0 ; i < N ; ++i) {
			A[i] = sc.nextLong() % K;			
		}
		long cnt = 0;
		for(int k = 1 ; k <= N ; ++k) {
			long S = 0;
			for(int i = 0 ; i < k ; ++i) {
				S = (S + A[i]) % K;
			}
			if(S == k) {
				++cnt;
			}
			for(int i = k ; i < N ; ++i) {
				S = (S + A[i] - A[i - k] + K) % K;
				if(S == k) {
					++cnt;
				}
			}
//			System.out.println(k+" "+cnt);
		}
		System.out.println(cnt);
	}
}
