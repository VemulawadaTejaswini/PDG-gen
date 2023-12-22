import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    String A=gs();
	    String B=gs();

	    
        //System.out.println((H-h)*(W-w));
        if (A.length()>B.length()) {
        	System.out.print("GREATER");
        }else if(A.length()<B.length()){
        	System.out.print("LESS");
        }else {
        	for (int i=0; i<A.length();i++) {
        		int a=Integer.parseInt(String.valueOf(A.charAt(i)));
        		int b=Integer.parseInt(String.valueOf(A.charAt(i)));
        		if (a>b) {
        			System.out.print("GREATER");
        			return;
        		}else if(a<b) {
        			System.out.print("LESS");
        			return;
        		}
        	}
        	System.out.print("EQUAL");
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