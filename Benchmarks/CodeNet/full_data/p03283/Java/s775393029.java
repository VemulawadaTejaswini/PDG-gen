import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // city
		int M = sc.nextInt(); // m個のlr区間
		int Q = sc.nextInt(); // q個のpq区間

		int[] L = new int[N+1];
		int[] R = new int[N+1];
		int[][] X = new int[N+1][N+1];
		for (int i = 1; i <= M; i++) {
			L[i] =sc.nextInt();
			R[i] = sc.nextInt();
			X[L[i]][R[i]]++; 
		}
		
		int[][] C = new int[N+1][N+1];
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				C[i][j] = C[i][j-1] + X[i][j];
			}
		}
		
		for (int i = 1; i <= Q; i++) {
			int p = sc.nextInt();
			int q = sc.nextInt();
			int sum = 0;
			for (int j = p; j <=q; j++) {
				sum += C[j][q] - C[j][p-1];
			}
			System.out.println(sum);
		}
		
	}
}
