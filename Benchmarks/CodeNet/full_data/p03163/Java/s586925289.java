import java.util.Arrays;
import java.util.Scanner;

public class Main {
final static int INF=(int) 1e9;
static int []w;
static int []v;
static long memo[][];
static int n;
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int maxw=sc.nextInt();
		v=new int[n+1];
		w=new int[n+1];
		memo=new long[maxw+1][n+1];
		for(int i=0;i<=maxw;i++)
			Arrays.fill(memo[i],-1);
		for(int i=0;i<n;i++ ) {
			w[i]=sc.nextInt();
			v[i]=sc.nextInt();
		}
		
		System.out.println(dp(maxw,0));
		
	}
	public static long dp(int remw,int idx) {
		if(remw<0) {
			return -INF;
		}
		if(remw==0||idx==n) {
			return 0;
		}
		if(memo[remw][idx]!=-1)
			return memo[remw][idx];
		
		return memo[remw][idx]=Math.max(dp(remw-w[idx],idx+1)+v[idx],dp(remw,idx+1));
	}

}
