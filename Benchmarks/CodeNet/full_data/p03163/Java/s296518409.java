import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int W = sc.nextInt();
	long[][] value = new long[N][W];

	int[] w = new int[N];
	int[] v = new int[N];

	for(int i = 0; i<N; i++) {
	    w[i] = sc.nextInt();
	    v[i] = sc.nextInt();
	}

	for(int i = 0; i< N; i++) {
	    for(int j = 0; j< W; j++) {
		if(i == 0) {
		    if(w[0]<=j) value[i][j] = v[0];
		    continue;
		}
		if(j<w[i]) {
		    value[i][j] = value[i-1][j];
		} else {
		    value[i][j] = Math.max(value[i-1][j-w[i]]+ v[i], value[i-1][j]);
		}
	    }
	}
	System.out.println(value[N-1][W-1]);


    }
}