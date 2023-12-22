import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		
		for(int i = 0; i < N; i++) {
			A[i] = stdIn.nextInt();
		}
		
		for(int i = 0; i <= A[0]; i++) {
			B[0] = i;
			for(int j = 1; j < N; j++) {
				B[j] = A[j-1]-B[j-1];
			}
			if(A[N-1]-B[N-1] == B[0]) {
				break;
			}
		}
		
		for(int i = 0; i < N; i++) {
			System.out.println(2*B[i]);
		}

	}

}