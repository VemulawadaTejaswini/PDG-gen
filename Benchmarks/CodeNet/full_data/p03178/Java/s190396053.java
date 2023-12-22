import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int d;
	static final int MOD=(int)1e9+7;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		d=scan.nextInt();
		dp=new long[s.length()][2][d];
		for(long[][] dd:dp) {
			for(long[] ddd:dd) Arrays.fill(ddd,-1);
		}
		System.out.println(go(0,0,0,s)-1);
	}
	static long[][][] dp;
	public static long go(int at, int less, int rem, String s) {
		if(at==s.length()) {
			return rem==0?1:0;
		}
		if(dp[at][less][rem]!=-1) return dp[at][less][rem];
		long res=0L;
		int end=(less==1)?9:s.charAt(at)-'0';
		for(int i=0;i<=end;i++) {
			int nxtless=less;
			if(i<end) nxtless=1;
			res=(res+go(at+1,nxtless,(rem+i)%d,s))%MOD;
		}
		return dp[at][less][rem]=res;
	}
}