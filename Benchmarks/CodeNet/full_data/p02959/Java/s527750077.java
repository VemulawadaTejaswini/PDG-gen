import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N + 1];
		long[] B = new long[N];
		for(int i = 0; i < N + 1; i++) {
			A[i] = sc.nextLong();
		}
		for(int i = 0; i < N; i++) {
			B[i] = sc.nextLong();
		}
		sc.close();
		long ans = 0L;
		for(int i = 0; i < N; i++) {
			// 勇者B[i]がモンスターA[i]を倒せる数
			long hit = Math.min(A[i], B[i]);
			// モンスターA[i]の残数
			// A[i] -= hit;
			// 勇者B[i]の残機
			B[i] -= hit;
			// 倒した合計の加算
			ans += hit;
			// 勇者B[i]がモンスターA[i + 1]を倒せる数
			hit = Math.min(A[i + 1], B[i]);
			// モンスターA[i + 1]の残数
			A[i + 1] -= hit;
			// 勇者B[i]の残機
			// B[i] -= hit;
			// 倒した合計の加算
			ans += hit;
		}
		System.out.println(ans);
	}
}
