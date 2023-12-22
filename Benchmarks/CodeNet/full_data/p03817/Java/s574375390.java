import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    long x=gl();
	    long c=Math.floorDiv(x, 11);
	    long a=x%11;

	    //System.out.println(m);
	    if(a==0) {
	        System.out.println(c*2);
	    } else if(a<=6){
	    	System.out.println(c*2+1);
	    } else {
	    	System.out.println(c*2+2);
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