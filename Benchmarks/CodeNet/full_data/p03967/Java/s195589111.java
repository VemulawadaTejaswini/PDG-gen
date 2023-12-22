
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    String s=gs();

	    int g=0;
	    int p=0;
	    int point=0;
	    for (int i=0; i<s.length();i++) {
	    	char c=s.charAt(i);
	    	if(c=='g') {
	    		if(p+1<=g) {
	    			point++;
	    			p++;
	    		} else {
	    			g++;
	    		}
	    	} else {
	    		if(p+1<=g) {
	    			p++;
	    		} else {
	    			g++;
	    			point--;
	    		}
	    	}
	    }

	    System.out.println(point);
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