//package godiji;

import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Main {
	static Scanner scn = new Scanner(System.in);
	static int mod = 1000000007;
	static String fans = "";

	public static void main(String[] args) {
		fans="";
		String str = scn.next(), otr = scn.next();
		int memo[][]=new int[str.length()+1][otr.length()+1];
		for(int i=0;i<=str.length();i++)
		{
			for(int j=0;j<=otr.length();j++)
			{
				memo[i][j]=-1;
			}
		}
		int a=lcs(str, otr, 0, 0, "",memo);
		System.out.println(fans);
	}

	public static int lcs(String str, String otr, int n, int m, String ans,int memo[][]) {
		if (str.length() == 0 || otr.length() == 0)
			return 0;
		if (n == str.length() || m == otr.length()) {
			if (ans.length() > fans.length()) {
				fans=ans;
			}
			return 0;
		}
//		if(memo[n][m]!=-1)
//			return memo[n][m];
		if (str.charAt(n) == otr.charAt(m)) {
			int a = lcs(str, otr, n + 1, m + 1, ans + str.charAt(n),memo) + 1;
			if(memo[n][m]!=-1)
			memo[n][m]+=a;
			else
				memo[n][m]=a;
			return a;
		}
			

		int a = lcs(str, otr, n + 1, m, ans,memo);
		int b = lcs(str, otr, n, m + 1, ans,memo);
		memo[n][m]=Math.max(a, b);
		return Math.max(a, b);

	}

	public static int maxhappy(int arr[][], int i, int j) {
		if (i == arr.length) {
			return 0;
		}

		int a = Integer.MIN_VALUE, b = Integer.MIN_VALUE;
		for (int k = 0; k < 3; k++) {
			if (k != j) {
				b = maxhappy(arr, i + 1, k) + arr[i][k];
			}
			a = Math.max(a, b);
		}
		return a;
	}

	public static long string(int n, String str, long memo[]) {
		if (str.length() == n) {
			boolean bl = true;
			for (int i = 0; i < n - 1; i++) {
				if (str.charAt(i) == '1' && str.charAt(i + 1) == '1') {
					bl = false;
					break;
				}
			}
			if (bl)
				return 1;
			else
				return 0;
		}

		long a = (string(n, str + "0", memo)) % mod;
		long b = (string(n, str + "1", memo)) % mod;
		return (a + b) % mod;
	}

	public static int gcd(int a, int n) {

		if (a == 0)
			return n;
		return gcd(n % a, a);
	}
}

class pair {
	int x;
	int y;

	pair(int a, int b) {
		this.x = a;
		this.y = b;
	}
}

class sorting implements Comparator<pair> {

	@Override
	public int compare(pair o1, pair o2) {
		// TODO Auto-generated method stub

		int a = Math.max(o1.x, o2.x), b = o1.y - o2.y;
		if (b > 0)
			return -1;
		else
			return 0;
	}

}
