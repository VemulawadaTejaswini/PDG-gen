

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int n=gi();
	    long[] s=new long[n];

	    long ans=0;
	    for (int i=0; i<n;i++) {
	    	s[i]=gl();
	    	ans+=s[i];
	    }
	    
	    if(ans%10!=0) {
	        System.out.println(ans);
	    }
	    Arrays.parallelSort(s);
	    for (int i=0; i<n;i++) {
	    	if (s[i]%10!=0) {
	    		ans-=s[i];
	    		break;
	    	}
	    }
	    //System.out.println(ans);
	    if(ans%10==0) {
	        System.out.println(0);
	    } else {
	    	System.out.println(ans);
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