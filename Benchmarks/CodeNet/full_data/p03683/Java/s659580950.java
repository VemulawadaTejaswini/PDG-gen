

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    long n=gl();
	    long m=gl();
	    
	    //System.out.println(ans);
	    if(n==m) {
	    	long ans=2;
	    	long i=n;
	    	while(i>0) {
	    		ans*=i;
	    		ans=ans%1000000007;
	    		i--;
	    	}
	    	i=m;
	    	while(i>0) {
	    		ans*=i;
	    		ans=ans%1000000007;
	    		i--;
	    	}
	        System.out.println(ans);
	    } else if(Math.abs(n-m)==1) {
	    	long ans=1;
	    	long i=n;
	    	while(i>0) {
	    		ans*=i;
	    		ans=ans%1000000007;
	    		i--;
	    	}
	    	i=m;
	    	while(i>0) {
	    		ans*=i;
	    		ans=ans%1000000007;
	    		i--;
	    	}
	        System.out.println(ans);
	    } else {
	    	System.out.print(0);
	    }
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