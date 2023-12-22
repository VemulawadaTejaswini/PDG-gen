
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);
int N=gi();
	    String S=gs();
	    String T=gs();
	    StringBuilder sb=new StringBuilder();
	    for (int i=0; i<S.length();i++) {
	    	sb.append(S.charAt(i));
	    	sb.append(T.charAt(i));
	    }
	   
        System.out.print(sb.toString());

//        if (2*X<=Y&& Y<=4*X && Y%2==0) {
//        	System.out.println("Yes");
//        }else{
//        	System.out.println("No");
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