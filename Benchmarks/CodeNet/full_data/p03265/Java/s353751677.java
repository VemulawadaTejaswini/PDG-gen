
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

        int x1=gi();
        int y1=gi();
        int x2=gi();
        int y2=gi();
        
        int dx=x2-x1;
        int dy=y2-y1;
        
        int x3=x2-dy;
        int y3=y2+dx;
        int x4=x3-dx;
        int y4=y3-dy;

        
        System.out.println(x3+" "+y3+" "+x4+" "+y4);
//        if (a>0) {
//        	System.out.println("Yes");
//        }else {
//        	System.out.println("No");
//        }
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