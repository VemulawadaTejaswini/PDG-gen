
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    long H=gl();
	    long W=gl();
	    long m=H*W;
        //System.out.print(min);
	    if (H==1 || W==1) {
	    	System.out.println(1);
	    	return;
	    }
        if (m%2==0) {
        	System.out.println(m/2);
        }else{
        	System.out.println((m+1)/2);
        }
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