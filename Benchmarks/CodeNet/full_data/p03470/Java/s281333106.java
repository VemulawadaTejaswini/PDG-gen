
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    List<Integer> D=new ArrayList<Integer>();
	    
	    int c=0;
	    for (int i=0; i<N;i++) {
	    	int d=gi();
	    	if (!D.contains(d)) {
	    		c++;
	    		D.add(d);
	    	}
	    }
	    System.out.println(c);
//	    if (isNumber(s1) && isNumber(s2) && s.charAt(a) == '-') {
//	    	System.out.print("Yes");
//	    }else {
//	    	System.out.print("No");
//	    }



	}

public static boolean isNumber(String val) {
	try {
		Integer.parseInt(val);
		return true;
	} catch (NumberFormatException nfex) {
		return false;
	}
}

	public static int d(int n) {
		int m=0;
		while(true) {
			if(n<1) {
				break;
			}
			int l= n%10;
			m+=l;
			n= (n-l)/10;
		}
		return m;
	}
	public static long d(long n) {
		String a=String.valueOf(n);
		return (long)a.length();
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