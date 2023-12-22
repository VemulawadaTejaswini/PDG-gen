import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		long[] a = new long[N+1];
		for(int i=0; i<N+1; i++) {
			a[i] = sc.nextLong();
		}

		long[] b = new long[N];
		for(int i=0; i<N; i++) {
			b[i] = sc.nextLong();
		}

		sc.close();

		long cnt = 0;
		//後ろから算出 N+1は勇者nしか倒せない
		for(int i=N; i>0; i--) {
			//街i+1が勇者iのキャパオーバの場合は街iは全て倒せない。
			if(a[i]>=b[i-1]) {
				cnt += b[i-1];
				a[i] -= b[i-1];
				b[i-1] = 0;
			//街i+1が勇者iが全て倒せる場合は街iは全て倒せる
			}else if(a[i]<b[i-1]) {
				cnt += a[i];
				b[i-1] -= a[i];
				a[i] = 0;
				//勇者iが街iのモンスター倒せる場合
				//街iのモンスターの方が多い場合
				if(a[i-1]>=b[i-1]) {
					cnt += b[i-1];
					a[i-1] -= b[i-1];
					b[i-1] = 0;
				//街iのモンスターの方が少ない場合
				}else if(a[i-1]<b[i-1]){
					cnt += a[i-1];
					b[i-1] -= a[i-1];
					a[i-1] = 0;
				}
			}
		}
		System.out.println(cnt);
	}
}