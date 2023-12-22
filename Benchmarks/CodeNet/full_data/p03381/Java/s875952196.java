

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    long[] X1=new long[N];
	    List<Long> X2=new ArrayList<Long>();

	    for(int i=0; i<N;i++) {
	    	X1[i]=gl();
	    	X2.add(X1[i]);
	    }

	    Collections.sort(X2);

	    long a1=X2.get(N/2 - 1);
	    long a2=X2.get(N/2);
	    for(int i=0; i<N;i++) {
	    	int index =X2.indexOf(X1[i]);
            if(index<N/2) {
            	System.out.println(a2);
            } else {
            	System.out.println(a1);
            }
	    }
	    //System.out.print(sum);
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