
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextLong();
		long A[] = new long[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
		}
		sc.close();
		// Aを二進数に直した時の、2^kがでる回数をk番目の要素に格納した配列
		int bi_A[] = new int[30];
		// 初期化
		for (int i = 0; i < bi_A.length; i++) {
			bi_A[i] = 0;
		}

		int cnt;
		for (long tmp : A) {
			while (tmp != 0) {
				cnt = -1;
				while (tmp >= Math.pow(2, cnt+1)) {
					cnt++;
				}
				if(cnt >= 0) {
				bi_A[cnt]++;
				tmp -= Math.pow(2, cnt);
				}
			}
		}
		// bi_Aが完成
		// 各要素は最高でN回現れる。
		// ある桁がk回現れている時、その桁の要素をXが持つ時、現れた回数が、N-k回に変換される。
		// よって、bi_Aの要素が、N/2より大きいかいなかで判断する。

		long sumX=0;
			for (int i=bi_A.length;i>0;i--) {
				if(bi_A[i-1]>N-bi_A[i-1]) {
					//何もしない
				}else {				
					if(K>sumX + Math.pow(2, i-1)) {
						bi_A[i-1]=N-bi_A[i-1];
						sumX+=Math.pow(2, i-1);
					}else {
					}
				}
			}
			
		

		long ans = 0;
		for (int i = 0; i < bi_A.length; i++) {
			ans += bi_A[i] * (long) Math.pow(2, i);
		}

		System.out.println(ans);

	}
}