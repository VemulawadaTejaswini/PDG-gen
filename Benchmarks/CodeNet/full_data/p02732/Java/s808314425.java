import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		long[] CNT = new long[N + 1];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			CNT[A[i]]++;
		}
		sc.close();

		long total = 0;
		for ( int i = 1 ; i <= N ; i++ ) {
			total += CNT[i] * (CNT[i] - 1) / 2;
		}

		StringBuilder ans = new StringBuilder();
		for ( int k = 0 ; k < N ; k++ ) {
			int num = A[k];
			long kcnt = total - CNT[num] * (CNT[num] - 1) / 2 + (CNT[num] - 1) * (CNT[num] - 2) / 2;
			ans.append(kcnt);
			ans.append("\n");
		}
		System.out.println(ans.toString());
	}
}
