import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	int LEN = (int)1e6 + 1;

	void doIt() {
		int N = sc.nextInt();
		int M = sc.nextInt();
		int d[] = new int[N + 1];
		Arrays.fill(d, -1);
		for(int i = 0; i < M; i++) {
			int s = sc.nextInt();
			int c = sc.nextInt();
			if(d[s] != -1 && d[s] != c) {
				System.out.println(-1);
				return;
			}
			else {
				d[s] = c;
			}
		}
		if(d[1] == 0 && N != 1) {
			System.out.println(-1);
			return;
		}
		if(d[1] == -1 && N != 1) {
			d[1] = 1;
		}
		for(int i = 1; i <= N; i++) {
			System.out.print((d[i] == -1)?0:d[i]);
		}
		System.out.println();

	}

	public static void main(String[] args) {
		new Main().doIt();
	}

}
