import java.io.*;
import java.util.*;
public class Main {
	static int H;
	static int W;
	static char[][] in;
	static long[][] memo;
	static int UNCAL = -1;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter p = new PrintWriter(System.out);
		H = sc.nextInt();
		W = sc.nextInt();
		in = new char[H][W];
		for(int i = 0 ; i<H ;i++) {
			char[] x = sc.next().toCharArray();
			in[i] = x;
		}
		memo = new long[H][W+1];
		for(long[]a:memo)
			Arrays.fill(a,-1);
		System.out.println(dp(0,0));
		}
	public static long dp(int i , int j) {
		if(i==H-1 && j==W-1)
			return 1;
		if(i>=H || j>=W || in[i][j]=='#')
			return 0;
		if(memo[i][j]!=UNCAL)
			return memo[i][j];
		long right = dp(i+1,j);
		long down = dp(i,j+1);
		memo[i][j] = (right+down)%(1000000000+7);
		return memo[i][j];
	}
		
	}
	
