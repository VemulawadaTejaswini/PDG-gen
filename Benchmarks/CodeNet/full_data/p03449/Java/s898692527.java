import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[][] A = new int[2][N];
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < N; j++) {
				A[i][j] = sc.nextInt();
			}
		}		
		
		int sum = 0;

		for(int i = 0; i < N; i++) {
			int temp = 0;
			for(int j = 0; j <= i; j++) {
				temp += A[0][j];
			}
			for(int j = i; j < N; j++) {
				temp += A[1][j];
			}
			sum = Math.max(sum, temp);
		}
		System.out.println(sum);
	}
}
