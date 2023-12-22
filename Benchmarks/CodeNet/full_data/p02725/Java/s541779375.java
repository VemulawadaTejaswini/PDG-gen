import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int K = sc.nextInt();
		int N = sc.nextInt();
		int[] A = new int[N];

		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}

		int[] B = new int[N];

		int max = Integer.MIN_VALUE / 2;
		int min = Integer.MAX_VALUE / 2;
		for(int i=0; i<N; i++) {
			if(A[i] < K/2)
				B[i] = A[i] + K;
			else
				B[i] = A[i];
			min = Math.min(min, B[i]);
			max = Math.max(max, B[i]);
		}

		int ans = Math.min(A[N-1] - A[0], max - min);

		System.out.println(ans);
	}

}
