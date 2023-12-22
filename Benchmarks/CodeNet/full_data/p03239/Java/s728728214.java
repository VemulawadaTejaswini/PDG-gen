import java.util.*;
public class Main {

		static void solve() {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int T = sc.nextInt();
			int[] c = new int[n];
			int[] t = new int[n];
			int res = 0;
			int min = Integer.MAX_VALUE;
			for(int i = 0;i<n;i++) {
				c[i] = sc.nextInt();
				t[i] = sc.nextInt();
			}
			for(int i = 0;i<n;i++) {
				if(t[i]<=T) {
					if(min>c[i]) {
					min = c[i];
					res = c[i];
					}
				}
			}
			if(res == 0) {
				System.out.println("TLE");
			}else
			System.out.println(res);
			
			sc.close();
			
		}
	public static void main(String[] args) {
		solve();
	}

}
