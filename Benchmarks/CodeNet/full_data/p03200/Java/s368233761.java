

import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    String S=gs();
	    long k=0;
	    long b=0;
	    for (int i=0; i<S.length();i++) {
	    	char c=S.charAt(i);
	    	if(c=='B') {
	    		b++;
	    	} else {
	    		k+=b;
	    	}

	    }
	    System.out.println(k);
//        if(k%2==0) {
//
//		    System.out.println(a-b);
//        } else {
//        	System.out.println(b-a);
//
//        }
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