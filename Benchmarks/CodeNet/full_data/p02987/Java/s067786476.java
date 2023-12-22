import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	final int LEN = 100000;

	void doIt() {
		String s = sc.next();
		char c[] = s.toCharArray();
		int cnt[] = new int[1000];
		Arrays.fill(cnt, 0);
		for(int i = 0; i < 4; i++) {
			cnt[c[i]]++;
		}
		for(int i = 0; i < 1000; i++) {
			if(cnt[i] == 0 || cnt[i] == 2) continue;
			System.out.println("No");
			return;
		}
		System.out.println("Yes");
	}
	public static void main(String[] args) {
		new Main().doIt();
	}
}
