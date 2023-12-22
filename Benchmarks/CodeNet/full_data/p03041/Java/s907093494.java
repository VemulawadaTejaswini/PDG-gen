import java.util.List;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int n=gi();
	    int k=gi();
	    String S=gs();
	    StringBuilder sb=new StringBuilder();
	    for (int i=0; i<n;i++) {
	    	if(i==k-1) {
	    		String a=S.substring(i, i+1).toLowerCase();
	    		sb.append(a);
	    	} else {
	    		sb.append(S.charAt(i));
	    	}
	    }


	   
	    System.out.print(sb.toString());

//        if (a>b) {
//        	c+=a;
//        	a--;
//        	System.out.print(c+Math.max(a, b));
//        }else {
//        	c+=b;
//        	b--;
//        	System.out.print(c+Math.max(a, b));
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