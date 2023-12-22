import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int[] A = new int[N];
		for(int i = 0; i < N; i++) {
			A[i] = stdIn.nextInt();
		}
		
		Arrays.sort(A);
		
		int M = A[N-1]-A[0];
		for(int i = 1; i < N-1; i++) {
			M += A[i];
		}
		System.out.println(M);
		
		System.out.println(A[0]+ " " +A[1]);
		int ans = A[0]-A[1];
		for(int i = 2; i < N-1; i++) {
			System.out.println(ans+ " " +A[i]);
			ans -= A[i];
		}
		System.out.println(A[N-1]+ " " +ans);

	}

}