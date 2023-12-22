import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int x=gi();
        int a=gi();
        int b=gi();
        
	    int c= x-a;
	    while(c>=b) {
	    	c-=b;
	    }
        System.out.println(c);
//        if ((a*b) %2==0) {
//        	System.out.print("Even");
//        }else {
//        	System.out.print("Odd");
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