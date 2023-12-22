import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] A = new int[N + 1];
		int[][] candy = new int[N + 1][N + 1];
		int[][] sumCandy = new int[N + 1][N + 1];
		int[][] arrA = new int[N + 1][N + 1];
		long count = 0;
		A[0] = 0;	
		
		for(int i = 1; i < (N + 1); i++) {
			A[i] = sc.nextInt();
			candy[i][0] = 0;
		}
		
		for(int i = 1; i < (N + 1); i++) {
			for(int j = 1; j < (N + 1); j++) {
				if(i <= j) {
					arrA[i][j] = A[j];
				} else {
					arrA[i][j] = 0;
				}
			}
		}
		
		for(int i = 1; i < (N + 1); i++) {
			for(int j = 1; j < (N + 1); j++) {
				candy[i][j] = candy[i][j - 1] + arrA[i][j];
				sumCandy[i][j] = candy[i][j] - candy[i][i - 1];
				if((sumCandy[i][j] % M == 0) && (sumCandy[i][j] > 0)) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
