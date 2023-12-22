
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    long N=gi();
	    long no=0;
	    long m=0;
	    long x=(long)Math.floor(Math.sqrt(N*2));
	    while(true) {
	        long y=(x*(x+1))/2;
	        if (y >N) {
	        	break;
	        }
	        x++;
	    }
	    m=((x*(x+1))/2)-N;

	    for (long i=1; i<=x;i++) {
	    	if (i!=m) {
	    	    System.out.println(i);
	    	}
	    }
//	    if (s>x) {
//	    	System.out.println(n-1);
//	    } else {
//	    	Arrays.parallelSort(a);
//
//	    	System.out.println(c);
//	    }
	    //System.out.println(q*4);
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