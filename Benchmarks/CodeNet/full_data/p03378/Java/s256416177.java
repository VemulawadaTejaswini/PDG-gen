import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int[] A = new int[M + 1];
		
		for (int i = 1; i <= M; i++) {
			A[i] = sc.nextInt();
		}
		
		int nCost = 0;
		for (int i = X + 1; i < N; i++) {
			for (int j = 1;j <= M; j++) {
				if (i == A[j]) {
					nCost++;
					break;
				}
			}
		}
		
		int zeroCost = 0;
		for (int i = X - 1; i > 0; i--) {
			for (int j = 1;j <= M; j++) {
				if (i == A[j]) {
					zeroCost++;
					break;
				}
			}
		}
		
		System.out.println(Math.min(nCost, zeroCost));
	}
}
