

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

        String s=gs();

        if(!s.substring(0,1).equals("A")) {
        	System.out.println("WA");
        	return;
        }
        
        if(!s.substring(2, s.length()-1).contains("C")) {
        	System.out.println("WA");
        	return;
        }
        
        if (s.length() - s.replace("C", "").length() !=1) {
        	System.out.println("WA");
        	return;
        }

        int c=0;
        for (int i=0; i<s.length(); i++) {
        	if(Character.isUpperCase( s.charAt( i ) )) {
        		c++;
        	}
        }
        //System.out.println("No");
        

	    if (c==2) {
	    	System.out.print("AC");
	    }else {
	    	System.out.print("WA");
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