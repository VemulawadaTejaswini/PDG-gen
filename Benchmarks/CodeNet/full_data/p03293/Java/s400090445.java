import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

        String s=gs();
        String t=gs();
        
        int i=0;
        while(i<s.length()) {
            i++;
            s=s.charAt(s.length()-1)+s.substring(0, s.length()-1);
            if(s.equals(t)) {
            	System.out.println("Yes");
            	return;
            }
        }
        

        System.out.println("No");
        

//	    if (isNumber(s1) && isNumber(s2) && s.charAt(a) == '-') {
//	    	System.out.print("Yes");
//	    }else {
//	    	System.out.print("No");
//	    }



	}
	
	public static int s(int n) {
		String S=String.valueOf(n);
		int c=0;
		for (int i=0; i<S.length();i++) {
			int k=Integer.parseInt(S.substring(i, i+1));
			c+=k;
		}
		return c;
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