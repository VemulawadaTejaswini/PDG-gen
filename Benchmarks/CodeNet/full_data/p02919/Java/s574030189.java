import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 140_E
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int P[] = new int[N];

		for(int i=0; i<N; i++) {
			P[i] = sc.nextInt();
		}
		// Scannerクラスのインスタンスをクローズ
		sc.close();

		int l=0, r=0;
		Integer wk[] = null;
		int ret = 0;

		for(l=0; l<N-1; l++) {
			for(r=l+1; r<N; r++) {
				wk = new Integer[r-l+1];
				for(int i=0; i<=r-l; i++) {
					wk[i] = P[l+i];
				}
				Arrays.sort(wk, Collections.reverseOrder());
				ret += wk[1];
			}
		}
		System.out.println(ret);
	}
}
