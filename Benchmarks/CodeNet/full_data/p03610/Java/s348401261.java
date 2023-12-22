
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);
	    String az="abcdefghijklmnopqrstuvwxyz";

	    String s=gs();
	    
	    //System.out.print(String.valueOf(s.charAt(0))+ (s.length()-2)+s.charAt(s.length()-1));
	    StringBuilder sb= new StringBuilder();
	    for (int i=0; i<s.length(); i+=2) {
	    	sb.append(s.charAt(i));
	    }

	    System.out.print(sb.toString());


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