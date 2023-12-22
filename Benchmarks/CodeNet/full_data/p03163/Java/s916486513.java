import java.util.*;
class Main {
    static int[] w, v;
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int W = sc.nextInt();
	w = new int[N];
	v = new int[N];

	for(int i = 0; i<N; i++) {
	    w[i] = sc.nextInt();
	    v[i] = sc.nextInt();
	}

	long total = getTotalValue(N, W);
	System.out.println(total);
    }

    public static long getTotalValue(int N, int W) {
	if(W<=0) {
	    return 0;
	}
	if(N<=0) {
	    return 0;
	}
	if(W < w[N-1]) {
	    return getTotalValue(N-1,W);
	}
	return Math.max(getTotalValue(N-1,W), getTotalValue(N-1, W-w[N-1]) + v[N-1]);
    }
}