import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int X=gi();
	    int Y=gi();

	    //System.out.print((int)Math.pow(4, n));
	    int s=0;
	    if (X<=3) {
	    	s+=100000*(4-X);
	    }
	    if (Y<=3) {
	    	s+=100000*(4-Y);
	    }
	    if (X==1 && Y==1) {
	    	s+=400000;
	    }
System.out.print(s);


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