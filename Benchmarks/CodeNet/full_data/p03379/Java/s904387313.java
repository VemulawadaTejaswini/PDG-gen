import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int []X = new int[N];
		for(int i = 0; i < N; i++) {
			X[i] = scan.nextInt();
		}
		scan.close();
		int []A = new int[N];
		System.arraycopy(X, 0, A, 0, N);
		Arrays.sort(A);
		int m1 = A[N / 2 - 1];
		int m2 = A[N / 2];
		for(int i = 0; i < N; i++) {
			if(X[i] > m1) {
				System.out.println(m1);
			}else {
				System.out.println(m2);
			}
		}

	}
}