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
		//ビットごとの1の数を数える。
		int bitCount[] = new int[65];//インデックス：右からiビット
		Arrays.fill(bitCount, 0);
		for(int i = 0; i < N; i++) {
			for(int j = 0; A[i] >= (1l << j) ; j++) {
				if(((A[j] >> 1) & 1) == 1) {
					bitCount[j]++;
				}
			}
		}
		//Xを求める
		long X = 0;
		for(int i = 64; i >= 0; i--) {
			//0が多いビットは1、1が多いビットは0にしたい
			if(bitCount[i] < N - bitCount[i]) {
				long bit = 1l << i;
				if(X + bit <= K) X += bit;//Kを超えない
			}
		}
		//答えを求める
		long ans = 0;
		for(int i = 0; i < N; i++) ans += (A[i] ^ X);
		System.out.println(ans);
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}
