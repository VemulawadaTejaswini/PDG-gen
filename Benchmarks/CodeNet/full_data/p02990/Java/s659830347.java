


import java.util.Scanner;



public class Main {

	public static long MOD = 1_000_000_007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long a = n-k+1;//(n-k+1)Ci
		long b = 1;//(k-1)C(i-1)
		
		for (int i=1;i<=k;i++) {
			System.out.println((a*b)%MOD);
			a=div(a*(n-k+1-i)%MOD, i+1);
			b=div(b*(k-i)%MOD, i);
		}
		
		
	}
	
	static long pow (long x, long y) {
		if (y==0) {
			return 1;
		} else if (y%2==0) {
			long tmp = pow(x,y/2);
			return (tmp*tmp%MOD);
		} else {
			long tmp = pow(x,y/2);
			return (tmp*tmp%MOD)*x%MOD;
		}
	}
	static long div (long x, long y){
		return x*pow(y, MOD-2)%MOD;
	}
}




