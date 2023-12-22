
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    int D=gi();
	    int[][]X=new int[N][D];

	    for (int i=0; i<N;i++) {
	    	for (int j=0; j<D;j++) {
	        	X[i][j]=gi();
	        }
        }
	    
	    int c=0;
	    for (int i=0; i<N;i++) {
	    	for (int j=i+1; j<N;j++) {
	    		double s=0;
	    		for (int k=0; k<D;k++) {
		        	s+=Math.pow(X[i][k]-X[j][k], 2);
		        }
	    		s=Math.sqrt(s);
	    		if (Math.floor(s) == s) {
	    			c++;
	    		}
	        }
        }

        System.out.print(c);
//        if (s.charAt(0)=='0' && N!=1) {
//        	System.out.println(-1);
//        }else {
//        	System.out.println(s);
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