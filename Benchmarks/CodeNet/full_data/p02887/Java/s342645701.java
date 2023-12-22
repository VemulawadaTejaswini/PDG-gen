import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;


	void doIt() {
		int n = sc.nextInt();
		String s = sc.next();
		char[] c = s.toCharArray();
		int len = n;
		for(int i = 1; i < n; i++) {
			if(c[i - 1] == c[i])len--;
		}
		System.out.println(len);
	}

	public static void main(String[] args) {
		new Main().doIt();
	}
}
