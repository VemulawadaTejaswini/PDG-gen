import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    String n=gs();
	    //String y=gs();

        //System.out.println(2*b-a);
        if ((n.charAt(0)==n.charAt(1)&&n.charAt(01)==n.charAt(2)) || (n.charAt(1)==n.charAt(2)&&n.charAt(2)==n.charAt(3))) {
        	System.out.print("Yes");
        }else {
        	System.out.print("No");
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