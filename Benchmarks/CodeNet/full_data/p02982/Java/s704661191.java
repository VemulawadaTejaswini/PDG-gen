import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int D = Integer.parseInt(sc.next());
		int[][] X = new int[N][D];
		for(int i = 0;i < N;i++) {
			for(int  j = 0;j < D;j++) {
				X[i][j] = Integer.parseInt(sc.next());
			}
		}
		sc.close();
		int ans = 0;
		for(int i = 0;i < N;i++) {
			for(int j = i+1;j < N;j++) {
				int norm = 0;
				for(int k = 0;k < D;k++) {
					int diff = Math.abs(X[i][k] - X[j][k]);
					norm += Math.pow(diff,2);
				}
				boolean flg = false;
				for(int k = 0;k <= norm;k++) {
					if(k * k == norm) {
						flg = true;
					}
				}
				if(flg) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}
