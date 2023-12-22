
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    long A=gl();
	    long B=gl();
	    long C=gl();
	    long X=gl();
	    long Y=gl();

	    long a1=A*X+B*Y;
	    long a2=Math.max(X, Y)*C*2;
	    long a3=Math.min(X, Y)*C*2;
	    if(X>Y) {
	    	a3+=(X-Y)*A;
	    } else {
	    	a3+=(Y-X)*B;
	    }

		System.out.println(Math.min(a1, Math.min(a2, a3)));
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