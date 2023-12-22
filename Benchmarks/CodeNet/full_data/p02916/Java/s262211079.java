import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 140_B
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] A = new int[N];
		int[] B = new int[N];
		int[] C = new int[N];

		int i = 0;
		int ret = 0;

		for(i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		for(i=0; i<N; i++) {
			B[i] = sc.nextInt();
		}
		for(i=0; i<N-1; i++) {
			C[i] = sc.nextInt();
		}
	    // Scannerクラスのインスタンスをクローズ
		sc.close();

		for(i=0; i<N; i++) {
			ret += B[i];
			ret += C[i];
		}

		// 最後に食べた料理だけ、追加の満足度はゼロ（差し引き）
		ret -= C[A[N-1]-1];

		System.out.println(ret);

	}

}
