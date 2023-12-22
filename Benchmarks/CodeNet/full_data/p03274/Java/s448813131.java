import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		int[] x = new int[N];
		for (int i=0;i<N;i++) {
			x[i] = sc.nextInt();
		}

		int Z=0;
		for (int i=0;i<N;i++) {
			if(x[i]<=0) {
				Z = i;
			}
		}

		int min = Integer.MAX_VALUE;
		int xx;

		// 右にしか行けない（０より大きい値しかない）
		if (x[Z] > 0) {
			min = x[K-1];
		}
		// 左にしか行けない（０以下しかない）
		else if (Z==N-1) {
			min = x[Z-K+1];
		}
		else {
			// 右だけに行くパターン（右にK本以上ある場合だけ）
			if (N-1-Z >= K) {
				xx = Math.abs(x[K+Z]);
				if (xx < min) {
					min = xx;
				}
			}
			// 左だけに行くパターン（左にK本以上ある場合だけ）
			if (Z+1 >= K) {
				xx = Math.abs(x[Z-K+1]);
				if (xx < min) {
					min = xx;
				}
			}
			// 右にi本、左にK-i本のパターン
			for (int i=1; i <= K ; i++) {
				if (Z+i >= N-1) {
					break;
				}
				xx = Math.abs(x[Z+i])*2 + Math.abs(x[Z-K+1+i]);
				if (xx <= min) {
					min = xx;
				}
			}
			// 左にi本、右にK-i本のパターン
			for (int i=0; i < K ; i++) {
				if (Z < i) {
					break;
				}
				xx = Math.abs(x[Z-i])*2 + Math.abs(x[Z+K-1-i]);
				if (xx <= min) {
					min = xx;
				}
			}


		}

		System.out.println(min);

	}
}

