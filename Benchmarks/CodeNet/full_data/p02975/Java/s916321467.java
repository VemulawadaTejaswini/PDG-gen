
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    long n=gl();

	    long ans=0;
	    for (int i=0; i<n; i++) {
	    	long a=gl();
	    	ans^=a;
	    }


	    //System.out.println(l);
        if(ans==0) {

		    System.out.println("Yes");
        } else {
        	System.out.println("No");

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