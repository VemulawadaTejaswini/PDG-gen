
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    long x=gl();
	    long y=gl();

	    long n=0;
	    if(x>y) {
	    	if(x*y>0) {
	    		n=x-y+2;
	    	} else if(x*y<=0) {
	    		n=1+Math.abs(Math.abs(x)-Math.abs(y));
	    	}
	    } else {
	    	if(x*y>0) {
	    		n=y-x;
	    	} else if(x*y<0) {
	    		n=1+Math.abs(Math.abs(x)-Math.abs(y));
	    	} else {
	    		n=Math.abs(x-y);
	    	}
	    }

        System.out.println(n);

		//System.out.println();
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
