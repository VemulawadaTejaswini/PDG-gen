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
		int bitCount[] = new int[64];//インデックス：右からiビット
		Arrays.fill(bitCount, 0);
		for(int i = 0; i < N; i++) {
			for(int j = 0; A[i] >= (1l << j) ; j++) {
				if(((A[i] >> j) & 1) == 1) {
					bitCount[j]++;
				}
			}
		}
		//System.out.println(Arrays.toString(bitCount));
		
		//Xを求める
		long X = 0;
		for(int i = 62; i >= 0; i--) {//0~62ビットに数値、63ビットに符号。
			//0が多いビットは1、1が多いビットは0にしたい
			if(bitCount[i] < N - bitCount[i]) {
				long bit = 1l << i;
				if(X + bit <= K) X += bit;//Kを超えない
			}
		}
		//System.out.println(X);
		
		//答えを求める
		long ans = 0;
		for(int i = 0; i < N; i++) ans += (A[i] ^ X);
		System.out.println(ans);
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}
