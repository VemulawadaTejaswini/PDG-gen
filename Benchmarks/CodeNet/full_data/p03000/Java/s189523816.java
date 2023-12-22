import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;


	void doIt() {
		int n = sc.nextInt();
		int x = sc.nextInt();
		int l[] = new int[n + 1];
		l[0] = 0;
		for(int i = 1; i <= n; i++) {
			l[i] = sc.nextInt();
			l[i] += l[i - 1];
		}
		int cnt = 0;
		for(int i = 0; i <= n; i++) {
			if(l[i] <= x)cnt++;
			else break;
		}
		System.out.println(cnt);
	}


	public static void main(String[] args) {
		new Main().doIt();
	}
}
