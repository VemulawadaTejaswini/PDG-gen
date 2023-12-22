import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int C = sc.nextInt();
		int[][] A = new int[N][M];
		int[] B = new int[M];
		for(int i = 0; i < M; i++){
			B[i] = sc.nextInt();
		}
		for(int i = 0; i < N; i++){
			for(int j = 0; j < M; j++){
				A[i][j] = sc.nextInt();
			}
		}
		sc.close();
		int result = 0;
		for(int i = 0; i < N; i++){
			int r = multiply(A[i], B, C);
			if(r > 0) result++;
		}
		System.out.println(result);
	}
	
	
	public static int multiply(int[] A, int[] B, int C){
		int result = 0;
		for(int i = 0; i < A.length; i++){
			result += (A[i] * B[i]);
		}
		return result + C;
		
	}
	

}
