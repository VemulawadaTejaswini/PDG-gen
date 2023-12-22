import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextLong();
		int A[] = new int[N];
		int Ar[] = new int[N];
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
		for(int i = 0; i < N; i++) {
			Ar[i] = A[N-1-i];
		}
		for(int i = 0; i < N; i++) {
			A[i] = Ar[i];
		}
		Arrays.sort(F);
		for(int i = 0; i < N; i++) {
			X[i] = A[i] * F[i];
		}
		for(long j = K; j > 0; j--) {
			for (int i = 0; i < N; i++) {
				if(X[Ai] <= X[i]) {
					Ai = i;
				}
			}
			A[Ai]--;
			if(Ai != N-1) {
				if(A[Ai] >= A[Ai+1]) {
				}
				if(A[Ai] <= A[Ai+1]) {
					Ar[Ai] = A[Ai+1];
					Ar[Ai+1] = A[Ai];
					A[Ai] = Ar[Ai];
					A[Ai+1] = Ar[Ai+1];
				}
				X[Ai] = A[Ai] * F[Ai];
				X[Ai+1] = A[Ai+1] * F[Ai+1];
			}
			if(Ai == N-1) {
				X[Ai] = A[Ai] * F[Ai];
			}
			Ai = 0;
		}
		for(int i = 0; i < N; i++) {
			if(X[Ai] <= X[i]) {
				Ai = i;
			}
		}
		n = X[Ai];
		if(n <= 0) {
			n = 0;
		}
		System.out.println(n);
	}
}
