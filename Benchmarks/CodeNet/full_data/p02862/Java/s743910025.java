import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args){

		solve_abc145_d();
	}
  
  	public static void solve_abc145_d(){

		Scanner sc = new Scanner(System.in);

		final int MOD = 1000000007;
		final int MAX = 800000;

		int X = sc.nextInt();
		int Y = sc.nextInt();

		if((2 * Y - X) % 3 != 0 || (2 * X - Y) % 3 != 0){
			System.out.println(0);
			sc.close();
			return;
		}

		BigInteger[] fac = new BigInteger[MAX];
		BigInteger[] finv = new BigInteger[MAX];
		BigInteger[] inv = new BigInteger[MAX];

		
		int a = (2 * Y - X) / 3;
		int b = (2 * X - Y) / 3;

		int n = a + b;

		solve_abc034_c_COMinit(MOD, MAX, fac, finv, inv);
		BigInteger ans = solve_abc034_c_COM(MOD, n, a, fac, finv);

		System.out.println(ans.intValue());
		sc.close();

	}

  	public static void solve_abc034_c_COMinit(final int MOD, final int MAX,
			BigInteger[] fac, BigInteger[] finv, BigInteger[] inv ){

		// final int MAX = 510000;
		// final int MOD = 1000000007;

		fac[0] = fac[1] = BigInteger.valueOf(1);
		finv[0] = finv[1] = BigInteger.valueOf(1);
		inv[1] = BigInteger.valueOf(1);

		for(int i=2; i<MAX; i++){
			fac[i] = fac[i-1].multiply(BigInteger.valueOf(i)).mod(BigInteger.valueOf(MOD));
			inv[i] = BigInteger.valueOf(MOD).subtract(inv[MOD%i].multiply(BigInteger.valueOf(MOD/i).mod(BigInteger.valueOf(MOD))));
			finv[i] = finv[i-1].multiply(inv[i]).mod(BigInteger.valueOf(MOD));
		}
	}

	public static BigInteger solve_abc034_c_COM(final int MOD, int n, int k, BigInteger fac[], BigInteger[] finv){

		if(n < k) return BigInteger.valueOf(0);
		if(n < 0 || k < 0) return BigInteger.valueOf(0);
		return fac[n].multiply(finv[k].multiply(finv[n-k]).mod(BigInteger.valueOf(MOD))).mod(BigInteger.valueOf(MOD));
	}


}