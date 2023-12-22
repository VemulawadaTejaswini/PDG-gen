import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {
			// TODO 140_C
			Scanner sc = new Scanner(System.in);

			int N = sc.nextInt();
			int A[] = new int[N+2];
			int ASum = 0;
			int B[] = new int[N+1];

			int i = 0;

			for(i=1; i<N; i++) {
				B[i] =  sc.nextInt();
			}
			// Scannerクラスのインスタンスをクローズ
			sc.close();

			A[1] = B[1];
			A[N] = B[N-1];
			for(i=2; i<N; i++) {
				A[i] = Math.min(B[i-1], B[i]);
			}

			for(i=1; i<N+1; i++) {
				ASum += A[i];
			}

			System.out.println(ASum);

    	}
    }