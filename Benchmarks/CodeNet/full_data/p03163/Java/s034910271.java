import java.io.*;
import java.util.*;
public class Main {
	static int N;
	static int W;
	static int[] w;
	static int[] v;
	static int[][] memo;
	static int UNCAL = -1;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter p = new PrintWriter(System.out);
		N = sc.nextInt();
		W = sc.nextInt();
		w = new int[N];
		v = new int[N];
		for(int  i = 0 ; i<N ; i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}
		memo = new int[N][W+1];
		for(int[]a:memo)
			Arrays.fill(a,-1);
		System.out.println(dp(0,W));
		
		}
	public static long dp(int i , int remw) {
		if(i==N)
			return 0;
		if(memo[i][remw]!=UNCAL)
			return memo[i][remw];
		long leave = dp(i+1,remw);
		long take = -1;
		if(remw-w[i]>=0)
			take = dp(i+1,remw-w[i])+v[i];
		return Math.max(take,leave);
		
	}
		
	}
	
