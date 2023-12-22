
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    String s=gs();
	    String t=gs();
	    int a=gi();
	    int b=gi();
	    String u= gs();

	    //System.out.print(String.valueOf(c));

        if (s.equals(u)) {
        	System.out.print((a-1) + " " + b);
        }else {
        	System.out.print((a) + " " + (b-1));
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