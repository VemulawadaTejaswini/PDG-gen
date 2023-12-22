
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    long N=gl();
	    long A=gl();
	    long B=gl();
	    long max=B*(N-1)+A;
	    long min=A*(N-1)+B;
	    
	    System.out.println(Math.max(max-min+1,0));
//        if(k==H+W-1) {
//        	System.out.println("Possible");
//        }else {
//        	System.out.println("Impossible");
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