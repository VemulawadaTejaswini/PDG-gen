
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static int N;
    private static int Ma;
    private static int Mb;
    private static final int INF = 100000;

    public static void main(String[] args) {
	N = Integer.parseInt(scan.next());
	Ma = Integer.parseInt(scan.next());
	Mb = Integer.parseInt(scan.next());

	int[] a = new int[N];
	int[] b = new int[N];
	int[] c = new int[N];
	for (int i = 0; i < N; i++) {
	    a[i] = Integer.parseInt(scan.next());
	    b[i] = Integer.parseInt(scan.next());
	    c[i] = Integer.parseInt(scan.next());
	}

	int[][][] dp = new int[N+1][401][401];
	for (int i = 0; i < N+1; i++) {
	    for (int j = 0; j < 401; j++) {
		for (int k = 0; k < 401; k++) {
		    dp[i][j][k] = INF;
		}
	    }
	}
	dp[0][0][0] = 0;

	for (int i = 0; i < N; i++) {
	    for (int ca = 0; ca < 401; ca++) {
		for (int cb = 0; cb < 401; cb++) {
		    dp[i+1][ca][cb] = min(dp[i+1][ca][cb], dp[i][ca][cb]);
		    if(ca+a[i] < 401 && cb+b[i] < 401) {
			dp[i+1][ca+a[i]][cb+b[i]] = min(dp[i+1][ca+a[i]][cb+b[i]], dp[i][ca][cb]+c[i]);
		    }
		}
	    }
	}

	int min = INF;
	for (int ca = 0; ca < 401; ca++) {
	    for (int cb = 0; cb < 401; cb++) {
		if(ca == 0 && cb == 0) continue;
		if(match(ca, cb) && dp[N][ca][cb] < min) min = dp[N][ca][cb];
	    }
	}

	System.out.println(min == INF ? -1 : min);
	scan.close();
    }

    private static int min(int x, int y) {
	return (x < y ? x : y);
    }

    private static boolean match(int ma, int mb) {
	return (ma * Mb == mb * Ma);
    }
}
