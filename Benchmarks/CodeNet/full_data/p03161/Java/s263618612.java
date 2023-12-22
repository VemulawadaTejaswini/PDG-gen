import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int K = sc.nextInt();
	int[] h = new int[N];
	for(int i = 0; i<N; i++) {
	    h[i] = sc.nextInt();
	}
	int[] cost = new int[N];

	cost[0] = 0;

	for(int i = 1; i<N; i++) {
	    int min = 10000000;
	    for(int k = 1; k < K+1 && (i-k)>= 0; k++) {
		int c = cost[i-k] + Math.abs(h[i] - h[i-k]);
		if(min>c) min=c;
	    }
	    cost[i] = min;
	}
	System.out.println(cost[N-1]);


    }
}