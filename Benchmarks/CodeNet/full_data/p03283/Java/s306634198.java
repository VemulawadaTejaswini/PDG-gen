import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); 
		int M = sc.nextInt(); 
		int Q = sc.nextInt(); 

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
		
		int[] p =new int[Q+1];
		int[] q =new int[Q+1];
		
		for (int i = 1; i <= Q; i++) {
			p[i] = sc.nextInt();
			q[i] = sc.nextInt(); 
		}
		for (int i = 1; i <= Q; i++) {
			int sum = 0;
			for (int j = p[i]; j <=q[i]; j++) {
				sum += C[j][q[i]] - C[j][p[i]-1];
				if (sum >= 1) {
//					System.out.println("sum: " + sum);
//					System.out.print("C[" + j + "][" + q + "] = " + C[j][q]);
//					System.out.println(" - C[" + j + "][" + (p-1) + "] = " + C[j][p-1]);
				}
			}
			System.out.println(sum);
		}
		sc.close();
	}
}