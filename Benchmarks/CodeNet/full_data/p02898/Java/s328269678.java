
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    int K=gi();
	    int[] H=new int[N];
	    
	    int c=0;
	    for(int i=0; i<N; i++) {
	    	H[i]=gi();
	    	if(H[i]>=K)c++;
	    }

        System.out.print(c);
//        if (c<=2) {
//        	System.out.println("YES");
//        }else {
//        	System.out.println("NO");
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

	// doubleとして入力を取得
	public static double gd() {
		return Double.parseDouble(scanner.next());
	}
}