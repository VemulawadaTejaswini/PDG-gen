
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    long N=gl();
	    long A=gl();
	    long B=gl();
	    
       //System.out.print((int)Math.floor(Math.sqrt(n)));
	    long s=Math.floorDiv(N, A+B);
	    long a=N%(A+B);

        if (a<A) {
    	    System.out.print(s*A+a);
        }else {
        	System.out.print(s*A+A);
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