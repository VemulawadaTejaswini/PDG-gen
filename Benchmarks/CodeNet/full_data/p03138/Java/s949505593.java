import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	void doIt() {
		sD();
	}
	
	void sD() {
		int N = sc.nextInt();
		long K = sc.nextLong();
		long A[] = new long[N];
		for(int i = 0; i < N; i++) A[i] = sc.nextLong();
		int bit[] = new int[100];
		Arrays.fill(bit, 0);
		for(int i = 0; i < N; i++) {
			for(int j = 0; A[i] >= Math.pow(2, j) ; j++) {
				int b = (int)(A[i] >> j) & 1;
				//System.out.println(Math.pow(2, j));
				if(b == 1) {
					bit[j]++;
				}
			}
		}
		long ans = 0;
				for(int i = 0; i < 100; i++) {
			if(Math.pow(2, i) > K) {
				ans += Math.pow(2, i) * bit[i];
			}
			else if(bit[i] < N - bit[i]) {
				bit[i] = N - bit[i];
				ans += Math.pow(2, i) * bit[i];
			}
			else ans += Math.pow(2, i) * bit[i];
		}
		System.out.println(ans);
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}
