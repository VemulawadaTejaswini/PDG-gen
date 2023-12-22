
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int A=gi();
	    int B=gi();
	    
//	    for(int i=0; i<N;i++) {
//	    	A[i]=gi();
//	    	s+=A[i];
//	    }
//	    
	    
       // System.out.print(sb.toString());

        if (A>B) {
    	    for(int i=0; i<A;i++) {
    	    	System.out.print(B);
	    }
        }else{
        	for(int i=0; i<B;i++) {
    	    	System.out.print(A);
	    }
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