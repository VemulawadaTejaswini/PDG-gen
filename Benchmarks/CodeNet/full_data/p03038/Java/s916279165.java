import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int N = 0;
		int M = 0;
		int B = 0;
		int C = 0;
		Scanner sc = new Scanner(System.in);
		N = Integer.parseInt(sc.next());
		M = Integer.parseInt(sc.next());
		int[] A = new int[N];
		int i;
		for (i = 0; i < N; i++) {
			A[i] = Integer.parseInt(sc.next());
		}
		java.util.Arrays.sort(A);
		int j;
		for (i = 0; i < M; i++) {
			B = Integer.parseInt(sc.next());
			C = Integer.parseInt(sc.next());
			for (j = 0; j < N; j++) {
				if (C > A[j]) {
					A[j] = C;
					B--;
					if (B == 0) {
						break;
					}
				} else
					break;
			}
			java.util.Arrays.sort(A);
		}
		int sum = 0;
		for (i = 0; i < N; i++) {
			sum = sum + A[i];
		}
		System.out.println(sum);
	}

}