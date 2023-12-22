import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] a = in.next().toCharArray();
		char[] b = in.next().toCharArray();
		int[][] dp = new int[a.length+1][b.length+1];
		StringBuilder[][] store = new StringBuilder[a.length+1][b.length+1];
		for(int i=0;i<=b.length;i++) {
			store[0][i] = new StringBuilder("");
		}
		for(int i=0;i<=a.length;i++) {
			store[i][0] = new StringBuilder("");
		}
		for(int i=1;i<=a.length;i++) {
			for(int j=1;j<=b.length;j++) {
				StringBuilder x = new StringBuilder(store[i-1][j].append((a[i-1]==b[j-1]? a[i-1]:"")));
				StringBuilder y = new StringBuilder(store[i][j-1]);
				store[i][j] = new StringBuilder(x.length()>y.length()? x:y);
			}
		}
		/*
		for(int i=0;i<=a.length;i++) {
			//System.out.println(Arrays.toString(dp[i]));
			System.out.println(Arrays.toString(store[i]));
		}
		*/
		//System.out.println(dp[a.length][b.length]);
		System.out.println(store[a.length][b.length]);
	}
}
