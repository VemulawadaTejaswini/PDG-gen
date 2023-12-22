import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
		
	void doIt() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k[] = new int[n];
		for(int i = 0; i < m; i++) {
			int knum = sc.nextInt();
			for(int j = 0; j < knum; j++) {
				k[sc.nextInt() - 1] += (1 << i);
			}
		}
		int p = 0;
		for(int i = 0; i < m; i++) {
			p += sc.nextInt() << i; 
		}
		int cnt = 0;
		for(int i = 0; i < (1 << n); i++) {
			int check = 0;
			for(int j = 0; j < n; j++){
				if(((i >> j) & 1) == 1) {
					check ^= k[j];
				}
			}
			if(check == p) cnt++;
		}
		System.out.println(cnt);
	}

	
	public static void main(String[] args) {
		new Main().doIt();
	}
}
