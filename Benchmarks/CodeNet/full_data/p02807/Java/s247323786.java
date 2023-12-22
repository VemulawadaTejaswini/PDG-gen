import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int[] x = new int[n];
		// スペース区切りの入力
		for ( int i=0; i<n; i++ ) {
			x[i] = sc.nextInt();
		}

		int[] d = new int[n-1];
		for ( int i=0; i<n-1; i++ ) {
			d[i] = x[n-1] - x[i];
		}

		BigInteger t = new BigInteger(0);
		BigInteger t1 = new BigInteger(0);
		t1 = fct(n-1);

		for ( int i=0; i<n-1; i++ ) {
			BigInteger t2 = new BigInteger(0);
			t2 = t1.multiply(i+1);
			t = t.add(t2);
		}

		// 出力
		System.out.println(t);
	}

	private static BigInteger fct(int p){
		if (p <= 1) {
			return (BigInteger.ONE);
		} else {
			return fct(p-1).multiply(BigInteger.valueOf(p));
		}
	}
}