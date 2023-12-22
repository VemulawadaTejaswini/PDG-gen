import java.util.List;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int a=gi();
	    int b=gi();
	    int t=gi();
	    
	    int s=b*Math.floorDiv(t, a);


	   
	    System.out.print(s);

//        if (a>b) {
//        	c+=a;
//        	a--;
//        	System.out.print(c+Math.max(a, b));
//        }else {
//        	c+=b;
//        	b--;
//        	System.out.print(c+Math.max(a, b));
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