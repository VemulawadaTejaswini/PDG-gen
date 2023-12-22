import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	int LEN = 0;

	void doIt() {
		char[] s = sc.next().toCharArray();
		int cnt = 0;
		for(int i = 0; i < s.length / 2; i++) {
			if(s[i] != s[s.length - 1 - i]) cnt++;
		}
		System.out.println(cnt);
	}

	public static void main(String[] args) {
		new Main().doIt();
	}
}
