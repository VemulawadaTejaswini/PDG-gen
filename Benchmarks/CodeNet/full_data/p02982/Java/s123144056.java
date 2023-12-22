import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		int X[][] = new int[N][D];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < D; j++) {
				X[i][j] = sc.nextInt();
			}
		}
		
		int ans = 0;
		double t = 0;
		for(int i = 0; i < N; i++) {
			for(int j = i; j < N; j++) {
				t = 0;
				if(i == j) continue;
				for(int k = 0; k < D; k++) {
					t += Math.pow(X[i][k] - X[j][k], 2);
				}
				if(Math.sqrt(t) % 1 == 0) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}
