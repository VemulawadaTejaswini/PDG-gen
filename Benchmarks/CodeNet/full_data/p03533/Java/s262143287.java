
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    String s=gs();
	    
	    for (int i=0; i<16;i++) {
	    	StringBuilder sb=new StringBuilder();
	    	if ((i>>0&1)==1) {
	    		sb.append('A');
	    	}
	    	sb.append("KIH");
	    	if ((i>>1&1)==1) {
	    		sb.append('A');
	    	}
	    	sb.append("B");
	    	if ((i>>2&1)==1) {
	    		sb.append('A');
	    	}
	    	sb.append("R");
	    	if ((i>>3&1)==1) {
	    		sb.append('A');
	    	}
	    	if (sb.toString().equals(s)) {
	    		System.out.print("YES");
	    		return;
	    	}
	    }
//	    if (s>x) {
//	    	System.out.println(n-1);
//	    } else {
//	    	Arrays.parallelSort(a);
//
//	    	System.out.println(c);
//	    }
	    System.out.println("NO");
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