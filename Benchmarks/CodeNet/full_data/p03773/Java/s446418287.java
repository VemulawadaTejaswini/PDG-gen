import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int a= gi();
	    int b= gi();

        System.out.print((a+b)%24);
//        if ((a.equals("H") && b.equals("H")) || (a.equals("D") && b.equals("D"))) {
//        	System.out.print("H");
//        }else{
//        	System.out.print("D");
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
}