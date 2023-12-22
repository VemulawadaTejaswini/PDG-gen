

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	static int[][] dp;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int n=gi();
	    int[] a=new int[n];
	    dp=new int[n][n];

	    int c=0;
	    for(int i=0; i<n;i++) {
	    	dp[i][i]=gi();
	    	if(dp[i][i]==0) c++;
	    }
	    
	    for (int i=1; i<n;i++) {
	    	for (int j=0; j<n-i;j++) {
		    	dp[j][j+i]=dp[j+1][j+i]+dp[j][j+i-1]-dp[j+1][j+i-1];
		    	if(dp[j][j+i]==0) c++;
		    }
	    }

	    System.out.println(c);
	}

	// 文字列として入力を取得
	public static String gs() {
		return scanner.next();
	}

	// intとして入力を取得
	public static int gi() {
		return Integer.parseInt(scanner.next());
	}

	// longとして入力を取得
	public static long gl() {
		return Long.parseLong(scanner.next());
	}

	// doubleとして入力を取得
	public static double gd() {
		return Double.parseDouble(scanner.next());
	}
}