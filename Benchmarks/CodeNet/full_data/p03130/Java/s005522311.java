
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int[] a=new int[4];
	    
	    
	    for (int i=0; i<6;i++) {
	    	int e=gi();
	    	a[e-1]++;
	    }
	    
	    int k=0;
	    for (int i=0; i<4;i++) {
	    	if(a[i]%2==1)k++;
	    }

	    if (k<=2) {
	    	System.out.println("YES");
	    } else {
	    	System.out.println("NO");
	    }
	    //System.out.println(y);
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