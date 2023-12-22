import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int H = Integer.parseInt(sc.next());
		int W = Integer.parseInt(sc.next());
		int D = Integer.parseInt(sc.next());
		int A[][] = new int[H][W];
		int x[] = new int[H * W];
		int y[] = new int[H * W];
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				A[i][j] = Integer.parseInt(sc.next()) - 1;
				x[A[i][j]] = j;
				y[A[i][j]] = i;
			}
		}
		int Q = Integer.parseInt(sc.next());
		int L[] = new int[Q];
		int R[] = new int[Q];
		for(int i = 0; i < Q; i++) {
			L[i] = Integer.parseInt(sc.next()) - 1;
			R[i] = Integer.parseInt(sc.next()) - 1;
		}
		
		for(int i = 0; i < Q; i++) {
			int ans = 0;
			int cnt = L[i];
			while(cnt != R[i]) {
				ans += Math.abs(x[cnt + D] - x[cnt]);
				ans += Math.abs(y[cnt + D] - y[cnt]);
				cnt += D;
			}
			System.out.println(ans);
		}
	}
}
