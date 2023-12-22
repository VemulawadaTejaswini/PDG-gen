import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int X = sc.nextInt();
	int[] x = new int[N+1];
	int[] y = new int[N];
	int min = Integer.MAX_VALUE;
	x[0] = X;
	for(int i = 1; i<N+1; i++) {
	    x[i] = sc.nextInt();
	}
	Arrays.sort(x);
	for(int i = 0; i<N; i++) {
	    y[i]=x[i+1]-x[i];
	    if(min>y[i]) min = y[i];
	}
	//min=4
	int m = min;
	int cnt = 2;
	for(int i = 0; i<N-1; i++) {
	    if(y[i]%m!=0) {
		m = min/cnt;
		if(m<1) break;
		i=0;
		cnt++;
	    }
	}
	System.out.println((m<1)?1:m);


    }
}