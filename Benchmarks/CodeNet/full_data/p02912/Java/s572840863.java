import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long A[] = new long[N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
		}
		int check = 2;
		do{
			Arrays.sort(A);
			if(M == 1) {
				A[N-1] /= 2;
				M--;
				break;
			}
			if(N == 1) {
				A[0] /= Math.pow(2, M);
				break;
			}
			long min = A[0];
			long max = A[N-1];
			long mid = (min + max) / 2;
			if(A[N - N/check] >= mid && (N - N/check) <= M) {
				for(int j = N - N/check; j < N; j++) {
					A[j] /= 2;
					M--; 
				}
			}else {
				check *= 2;
				if(check >= N) {
					check = N;
				}
			}
		}while(M > 0);
		long out = 0;
		for(int i = 0; i < N; i++) {
			out += A[i];
		}
		System.out.println(out);
		sc.close();
	}

}
