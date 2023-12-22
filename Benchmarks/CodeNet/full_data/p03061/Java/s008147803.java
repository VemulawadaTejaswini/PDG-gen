import java.util.Scanner;

public class Main {
	
	static long[] maxPas = new long[5];
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		
		if(N == 2) {
			System.out.println(Math.max(A[0], A[0]));
			System.exit(0);
		}

		int ans = 0;
		for(int i=0; i<N; i++) {
			int tmp = A[i];
			if(i==0) {
				A[i] = A[i+1];
			} else {
				A[i] = A[i-1];
			}
			ans = gcd(A) > ans ? gcd(A) : ans;
			A[i] = tmp;
			
		}
		System.out.println(ans);

	}
	
	public static final int gcd(final int[] param) {
	    final int len = param.length;
	    int g = gcd(param[0], param[1]); 
	    for (int i = 1; i < len - 1; i++) {
	        g = gcd(g, param[i + 1]);  
	    }
	    return g;
	}
	
	static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}

}