import java.util.*;
public class Main {
	public static void main(String[] args){
		int mod = (int)Math.pow(10,9) + 7;
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		int p = 1;
		for ( int i=0; i<n; i++ ) {
			p = (p*2)%mod;
		}
		p--;

		p = p - getCombinationNumbers(n, a);
		p = p - getCombinationNumbers(n, b);

		while(p<0) {
			p = p + mod;
		}

		System.out.println(p);
	}

	private static int getCombinationNumbers( int n, int k ) {
		int mod = (int)Math.pow(10,9) + 7;
		if ( k==0 || k==n ) return 1;
		else if ( k==1 || k==(n-1) ) return n;
		else return ((getCombinationNumbers(n-1, k-1))%mod+(getCombinationNumbers(n-1, k))%mod)%mod;
	}

}