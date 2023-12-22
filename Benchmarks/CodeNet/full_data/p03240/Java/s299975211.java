import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long x[] = new long[N];
		long y[] = new long[N];
		long h[] = new long[N];
		for(int i = 0; i < N; i++) {
			x[i] = sc.nextLong();
			y[i] = sc.nextLong();
			h[i] = sc.nextLong();
		}
		
		long ans_x = 0;
		long ans_y = 0;
		long ans_h = 0;
		boolean flag = true;
		
		outer: for(int i = 0; i <= 100; i++) {
			ans_y = i;
			for(int j = 0; j <= 100; j++) {
				ans_x = j;
				int cnt = 0;
				while(h[cnt] == 0) {
					cnt++;
				}
				ans_h = h[cnt] + Math.abs(ans_x - x[cnt]) + Math.abs(ans_y - y[cnt]);
				flag = true;
				inner: for(int k = 0; k < N; k++) {
					if(ans_h - Math.abs(ans_x - x[k]) - Math.abs(ans_y - y[k]) != h[k]) {
						if(h[k] != 0) {
							flag = false;
						}
						continue inner;
					}
				}
				if(flag) {
					break outer;
				}
			}
		}
		
		System.out.println(ans_x + " " + ans_y + " " + ans_h);
	}
}
