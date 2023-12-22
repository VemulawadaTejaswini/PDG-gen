import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	int LEN = (int)1e6 + 1;

	void doIt() {
		int N = sc.nextInt();
		char[] S = sc.next().toCharArray();
		int cnt = 0;
		for(int i = 0; i < N - 2; i++) {
			if(S[i] == 'A' && S[i + 1] == 'B' && S[i + 2] == 'C')
				cnt++;
		}
		System.out.println(cnt);
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}

}
