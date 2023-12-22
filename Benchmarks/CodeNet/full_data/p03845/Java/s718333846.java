import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] T = new int[N];
		for (int i=0; i<N; i++) {
			T[i] = sc.nextInt();
		}
		int M = sc.nextInt();
		int [] P = new int[M];
		int [] X = new int[M];
		for (int i=0; i<M; i++) {
			P[i] = sc.nextInt();
			X[i] = sc.nextInt();
		}
		for (int i=0; i<M; i++) {
			int res = 0;
			for (int j=1; j<=N; j++) {
				if (P[i] == j) {
					res += X[i];
				}else {
					res += T[j-1];
				}
			}			
			System.out.println(res);
		}
	}
}
