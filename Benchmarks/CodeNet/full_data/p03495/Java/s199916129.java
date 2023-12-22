import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		int[] A = new int[N];
		for(int i = 0;i < N;i++) {
			A[i] = Integer.parseInt(sc.next());
		}
		sc.close();
		int[] cnt = new int[N];
		for(int i=0;i<A.length;i++) {
			for(int j = 0;j < N;j++) {
				if(A[i] - 1 == j) {
					cnt[j]++;
				}
			}
		}
		Arrays.sort(cnt);
		int ans = 0;
		if(N-K-1 >= 0) {
			for(int i = N-K-1;i > 0;i--) {
				ans += cnt[i];
			}
		}
		System.out.println(ans);
	}
}