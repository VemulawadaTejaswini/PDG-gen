import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    String a= gs();
	    String b= gs();
	    String c= gs();

        System.out.print(a.toUpperCase().charAt(0)+b.toUpperCase().charAt(0)+c.toUpperCase().charAt(0));
//        if (b-a==c-b) {
//        	System.out.print("YES");
//        }else{
//        	System.out.print("NO");
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