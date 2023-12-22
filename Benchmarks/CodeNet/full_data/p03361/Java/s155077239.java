
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int H=gi();
	    int W=gi();
	    char[][] S=new char[H][W];

	    for (int i=0; i<H; i++) {
	    	String s=gs();
	    	for (int j=0; j<W; j++) {
                S[i][j]=s.charAt(j);
	    	}
	    }
	    
	    for (int i=0; i<H; i++) {
	    	for (int j=0; j<W; j++) {
	    		if (S[i][j]=='#') {
                    boolean f=false;
                    if (i!=0 && S[i-1][j]=='#') {
                        f=true;
	    		    }else if (i!=H-1 && S[i+1][j]=='#') {
                        f=true;
	    		    } else if (j!=0 && S[i][j-1]=='#') {
                        f=true;
	    		    } else if (j!=W-1 && S[i][j+1]=='#') {
                        f=true;
	    		    }
                    if(!f) {
                    	System.out.println("No");
                      return;
                    }
	    	    }
	    	}
	    }

	    System.out.println("Yes");
//        if (f) {
//    	    String a=Sq.substring(0, S.lastIndexOf(T)) + T + Sq.substring(S.lastIndexOf(T)+T.length());
//    	    System.out.print(a.replaceAll("\\?", "a"));
//        }else {
//        	System.out.print("UNRESTORABLE");
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