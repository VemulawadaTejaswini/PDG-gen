
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main{
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		int n = sc.nextInt();
		int w = sc.nextInt();
		int[] arr = input(n);
		boolean[]dp = new boolean[w+1];
		dp[0] = false ;
		for(int i = 1 ;i <= w;i++) {
			for(int val : arr) {
				if(val <=i) {
					dp[i] |=  (!dp[i - val]);
				}
			}
		}
		if(dp[w])
		System.out.println("First");
		else
			System.out.println("Second");

		
	}
	public static int[] input(int n) throws Exception {

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	public static long[][] input(int n , int m ) throws Exception {

		long[][] arr = new long[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {

				arr[i][j] = sc.nextInt();
			}
		}
		return arr;
	}

}
