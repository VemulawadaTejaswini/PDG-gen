import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int W[] = new int[N];
		for(int i = 0; i < N; i++) {
			W[i] = sc.nextInt();
		}
		int ans = 1000;
		for(int i = 0; i < N; i ++) {
			int g1 = 0;
			int g2 = 0;
			for(int j = 0; j < N; j++) {
				if(j > i) {
					g1 += W[j];
				} else {
					g2 += W[j];
				}
			}
			ans = Math.min(ans, Math.abs(g1 - g2));
		}
		System.out.println(ans);
	}
}
