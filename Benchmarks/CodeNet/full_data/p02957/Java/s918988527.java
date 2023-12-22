
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int A=gi();
	    int B=gi();

	    if ((A-B) % 2==0) {
	    	System.out.print((A+B)/2);
	    } else {
	    	System.out.print("IMPOSSIBLE");
	    }
        //System.out.println((int)(K* Math.pow(K-1, N-1)));
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