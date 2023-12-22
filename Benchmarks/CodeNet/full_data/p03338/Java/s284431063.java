
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

        int N=gi();
        String S=gs();
        int max=0;
        for(int i=1; i<N-1; i++) {
        	String S1=S.substring(0, i);
        	String S2=S.substring(i);
        	String S3="";
        	int c=0;
        	for (int j=0; j<S1.length(); j++) {
        		String m=S1.substring(j,j+1);
        		if(S2.contains(m) && !S3.contains(m)) {
        			S3+=m;
        			c++;
        		}
        	}
        	if(c>max) {
        		max=c;
        	}
        	
        }


	    System.out.println(max);

//	    if (isNumber(s1) && isNumber(s2) && s.charAt(a) == '-') {
//	    	System.out.print("Yes");
//	    }else {
//	    	System.out.print("No");
//	    }



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