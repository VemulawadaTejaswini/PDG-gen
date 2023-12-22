import java.util.*;


public class Main {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] B = new int[N-1];
		for(int i = 0; i < N-1; i++) {
			B[i] = sc.nextInt();
		}
		int[] A = new int[N];
		
			A[0] = B[0];
		
		if(N > 2) {
			for(int i = 1; i < N-1; i++) {
				if(B[i-1] != B[i]) {
					A[i] = Math.min(B[i-1], B[i]);
				}
				else {
					A[i] = B[i];
				}
			A[N-1] = B[N-2];
			}
		}
		else {
			A[1] = A[0];
		}
		int R = 0;
		for(int i = 0; i < N; i++) {
			R += A[i];
			//System.out.println(A[i]);
		}
		System.out.println(R);
	}
}