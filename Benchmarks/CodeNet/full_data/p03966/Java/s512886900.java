
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);


	    int N=gi();
	    double[] T=new double[N];
	    double[] A=new double[N];

        for (int i=0; i<N; i++) {
        	T[i]=gd();
        	A[i]=gd();
        }

        double ht=1;
        double ha=1;
        for (int i=0; i<N; i++) {
            double hi=Math.max(Math.ceil(ht/T[i]), Math.ceil(ha/A[i]));
            ht=hi*T[i];
            ha=hi*A[i];
        }

        System.out.println((long)(ht+ha));

//        if(ans==0) {
//
//		    System.out.println("Yes");
//        } else {
//        	System.out.println("No");
//
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