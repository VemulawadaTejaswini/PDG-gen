import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextLong();
		int A[] = new int[N];
		int F[] = new int[N];
		int X[] = new int[N];
		int Ai = 0;
		long n = 0;
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		for(int i = 0; i < N; i++) {
			F[i] = sc.nextInt();
		}
		Arrays.sort(A);
		Arrays.sort(F);
		for(int i = 0; i < N; i++) {
			X[i] = A[i] * F[N-1-i];
		}
		for(int i = 0; i < N; i++) {
			if(X[Ai] <= X[i]) {
				Ai = i;
			}
			if(K-A[Ai] <= 0) {
				A[Ai] -= K;
				K = 0;
				Arrays.sort(A);
				Arrays.sort(F);
				for(int j = 0; j < N; j++) {
					X[j] = A[j] * F[N-1-j];
				}
				Ai = 0;
				break;
			}
			K -= A[Ai];
			A[Ai] = 0;
			Ai = 0;
			Arrays.sort(A);
			Arrays.sort(F);
			for(int j = 0; j < N; j++) {
				X[j] = A[j] * F[N-1-j];
			}
		}
		for(int i = 0; i < N; i++) {
			if(X[Ai] <= X[i]) {
				Ai = i;
			}
			n = X[Ai];
		}
		if(n <= 0) {
			n = 0;
		}
		System.out.println(n);
	}
}
