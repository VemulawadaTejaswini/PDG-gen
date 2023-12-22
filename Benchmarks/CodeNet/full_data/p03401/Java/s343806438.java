import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N + 2];
		
		A[0] = 0;
		A[N + 1] = 0;
		
		for (int i = 1; i <= N; i++) {
			A[i] = sc.nextInt();
		}
		
		int c = 0;
		for (int i = 1; i < A.length; i++) {
			c += Math.abs(A[i] - A[i - 1]);
		}
		
		for (int i = 1; i <= N; i++) {
			System.out.println(c - Math.abs(A[i] - A[i - 1]) + Math.abs(A[i + 1] - A[i - 1]));
		}
	}
}