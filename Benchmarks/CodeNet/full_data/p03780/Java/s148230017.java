
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    
    private int K;
    private long[] a;
    private long[] S;

    public static void main(String[] args) {
	int N = Integer.parseInt(scan.next());
	int K = Integer.parseInt(scan.next());
	
	long[] a = new long[N];
	for (int i = 0; i < N; i++) {
	    a[i] = Long.parseLong(scan.next());
	}
	Arrays.sort(a);
	
	long[] S = new long[N];
	S[0] = a[0];
	for (int i = 1; i < N; i++) {
	    S[i] = S[i-1] + a[i];
	}

	int ans = 0;
	if(S[N-1] < K) ans = N;
	else {
	    Main m = new Main(K, a, S);
	    for (int i = 0; i < N; i++) {
		int j = m.binarySearch(i, 0, N-1);
		long score = (j==0 ? 0 : (i < j ? S[j]-a[i] : S[j-1]));
		if(score >= K) ans++;
	    }
	}
	
	System.out.println(ans);
	scan.close();
    }

    Main(int K, long[] a, long[] S) {
	this.K = K;
	this.a = a;
	this.S = S;
    }

    boolean isGood(int i, int n) {
	long score = (n==0 ? a[i] : (i < n ? S[n] : S[n-1] + a[i]));
	return (score >= K ? true : false);
    }

    int binarySearch(int i, int from, int to) {
	if(from == to) return from;

	int j = (from+to)/2;
	return isGood(i, j) ? binarySearch(i, from, j) : binarySearch(i, j+1, to);
    }
}
