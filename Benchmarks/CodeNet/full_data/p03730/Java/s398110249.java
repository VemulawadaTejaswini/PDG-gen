import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int A=gi();
	    int B=gi();
	    int C=gi();
boolean flg=false;
	    for(int i=1;i<=B; i++) {
	    	if(((A*i)%B) == C) {
	    		flg=true;
	    	}
	    }
        //System.out.println((H-h)*(W-w));
        if (flg) {
        	System.out.print("YES");
        }else {
        	System.out.print("NO");
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