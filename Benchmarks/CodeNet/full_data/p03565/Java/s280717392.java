
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    String S=gs();
	    String T=gs();

	    int ind=T.length()-1;
	    boolean f=false;
	    for (int i=0; i<S.length(); i++) {
	    	char c=S.charAt(S.length()-1-i);
	    	if (!f) {
	    	    if (c=='?') {
	    		    S=S.substring(0, S.length()-1-i) + T.charAt(ind) + S.substring(S.length()-i);
	    		    ind--;
	    	    } else if(c==T.charAt(ind)) {
	    		    ind--;
	    	    } else {
	    	    	ind=T.length()-1;
	    	    }
	    	} else {
	    		if (c=='?') {
	    		    S=S.substring(0, S.length()-1-i) + "a" + S.substring(S.length()-i);
	    	    }
	    	}
	    	if(ind<0)f=true;
	    }
//	    System.out.print(c);
        if (f) {
    	    System.out.print(S);
        }else {
        	System.out.print("UNRESTORABLE");
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