import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int N;
	static int[]A, B, C;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		A = new int[N];
		B = new int[N];
		C = new int[N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		for(int i = 0; i < N; i++) {
			B[i] = sc.nextInt();
		}
		for(int i = 0; i < N; i++) {
			C[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(A);
		Arrays.sort(B);
		Arrays.sort(C);
		long ans = 0;
		for(int i = 0; i < N; i++) {
			int k = A[i];
			int id1 = bs(k, B);
			if(id1 != -1 && id1 != N) {
				for(int j = id1; j < N; j++) {
					int k2 = B[j];
					int id2 = bs(k2, C);
//					System.out.println(k2);;
//					System.out.println(id1 + " " + id2);
					if(id2 != -1 && id2 != N) {
						ans += (N - id2);
					}
				}

			}
		}
		System.out.println(ans);
	}
	static int bs(int k, int[]G) {
		int l = -1;
		int r = N;
		while(r - l > 1) {
			int mid = (l + r) / 2;
			if(G[mid] > k) {
				 r = mid;
			}else {
				l = mid;
			}
		}
		return r;
	}
}