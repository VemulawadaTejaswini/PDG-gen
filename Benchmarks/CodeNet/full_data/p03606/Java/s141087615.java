
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int n=gi();
	    int[] l= new int[n];
	    int[] r= new int[n];
	    int c=0;
	    for(int i=0; i<n; i++) {
	    	l[i]=gi();
	    	r[i]=gi();
	    	c+= r[i]-l[i]+1;
	    }
	    
	    //System.out.print(String.valueOf(s.charAt(0))+ (s.length()-2)+s.charAt(s.length()-1));

	    System.out.print(c);


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