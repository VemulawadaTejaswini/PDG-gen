
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long[][] memo = new long[n][n];
		boolean[][] memoed = new boolean[n][n];
		long[] a = new long[n];
		for (int i=0;i<n;i++) {
			a[i]=sc.nextLong();
		}
		System.out.println(taro(0,n-1,memo,memoed,a));
		System.out.println();
	}
	
	static long taro(int start, int end, long[][] memo, boolean[][] memoed, long[] a) {
		if (memoed[start][end]) {
			return memo[start][end];
		} else if (start == end) {
			memoed[start][end]=true;
			memo[start][end]=a[start];
			return a[start];
		} else {
			long ret = Math.max(jiro(start,end-1,memo,memoed,a)+a[end], jiro(start+1,end,memo,memoed,a)+a[start]);
			memoed[start][end]=true;
			memo[start][end]=ret;
			return ret;
		}
	}
	
	static long jiro(int start, int end, long[][] memo, boolean[][] memoed, long[] a) {
		if (memoed[start][end]) {
			return memo[start][end];
		} else if (start == end) {
			memoed[start][end]=true;
			memo[start][end]=-a[start];
			return -a[start];
		} else {
			long ret=Math.min(taro(start,end-1,memo,memoed,a)-a[end], taro(start+1,end,memo,memoed,a)-a[start]);
			memoed[start][end]=true;
			memo[start][end]=ret;
			return ret;
		}
	}

}
