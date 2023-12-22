import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int C = sc.nextInt();
		int[] B = new int[M];
		int[][] A = new int[N][M];
		for (int i = 0; i < M; i++) {
			B[i] = sc.nextInt();
		}
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		int result = 0;
		int correct = 0;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				result += A[i][j]*B[j];
			}
			if(result+C > 0)correct += 1;
			result = 0;
		}
		System.out.println(correct);
	}
}