

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

        int n=gi();
boolean flg=false;
        for (int i=0; i<=25; i++ ) {
        	for (int j=0; j<15;j++) {
        		if(i*4+j*7==n) {
        			flg=true;
        			break;
        		}
        	}
        }
        //System.out.println("No");
        

	    if (flg) {
	    	System.out.print("Yes");
	    }else {
	    	System.out.print("No");
	    }



	}
	
	public static int s(int n) {
		String S=String.valueOf(n);
		int c=0;
		for (int i=0; i<S.length();i++) {
			int k=Integer.parseInt(S.substring(i, i+1));
			c+=k;
		}
		return c;
	}

	public static long d(long n) {
		String a=String.valueOf(n);
		return (long)a.length();
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