
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static long[][] C = new long[51][51];

    public static void main(String[] args) {
	int N = Integer.parseInt(scan.next());
	int A = Integer.parseInt(scan.next());
	int B = Integer.parseInt(scan.next());
	
	long[] v = new long[N];
	for (int i = 0; i < N; i++) {
	    v[i] = Long.parseLong(scan.next());
	}
	Arrays.sort(v);
	for (int i = 0; i < N/2; i++) {
	    long tmp = v[i];
	    v[i] = v[N-1-i];
	    v[N-1-i] = tmp;
	}
	
	long[] sum = new long[N];
	sum[0] = v[0];
	for (int i = 1; i < N; i++) {
	    sum[i] = sum[i-1] + v[i];
	}

	double max = sum[A-1] / (double)A;
	long count = 0;
	int X = 0;
	for (int i = 0; i < N; i++) {
	    if(v[A-1] == v[i]) X++;
	}
	if(v[0] != v[A-1]) {
	    int Y = 0;
	    for (int i = 0; i < A; i++) {
		if(v[i] == v[A-1]) {
		    Y++;
		}
	    }
	    count = combination(X, Y);
	    
	} else {
	    for (int i = A; i <= B; i++) {
		if(v[i-1] == v[A-1])
		    count += combination(X, i);
	    }
	}

	System.out.println(String.format("%.6f", max));
	System.out.println(count);
	scan.close();
    }

    private static long combination(int n, int r) {
	if(C[n][r] > 0) return C[n][r];
	
	if(n-r < r) return C[n][r] = combination(n, n-r);
	if(r-1 >= 0) return C[n][r] = n * combination(n-1, r-1) / r;

	return C[n][r] = 1;
    }
}
