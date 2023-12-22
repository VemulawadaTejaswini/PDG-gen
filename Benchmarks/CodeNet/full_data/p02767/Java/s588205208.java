

import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    int[] S=new int[N];
	    
	    double m=0;
	    for (int i=0; i<N; i++) {
	    	S[i]=gi();
	    	m+=S[i];
	    }
	    m=Math.round(m/N);

	    long s=0;
	    for (int i=0; i<N; i++) {
	    	s+=(m-S[i])*(m-S[i]);
	    }

        System.out.print(s);
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