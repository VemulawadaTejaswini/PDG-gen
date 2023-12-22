import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	int LEN = 0;

	void doIt() {
		int n = sc.nextInt();
		char[] s = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();
		StringBuilder strb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			strb.append(s[i]);
			strb.append(t[i]);
		}
		System.out.println(strb.toString());
		
	}

	public static void main(String[] args) {
		new Main().doIt();
	}
}
