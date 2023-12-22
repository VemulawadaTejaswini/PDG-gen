import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    String S=gs();
        int[] c = new int[26];
	    for (int i=0; i<S.length();i++) {
	    	int ind=S.charAt(i) -97;
	    	c[ind]++;
	    }
	    
	    for (int i=0; i<c.length;i++) {
	    	if (c[i]%2!=0) {
	    		System.out.print("No");
	    		return;
	    	}
	    }
   
        System.out.print("Yes");
//        if (a<=c&&c<=b) {
//        	System.out.print("Yes");
//        }else{
//        	System.out.print("No");
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
}