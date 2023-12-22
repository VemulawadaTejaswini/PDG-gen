

import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);


	    int N=gi();
	    long[] T=new long[N];
	    long[] A=new long[N];

        for (int i=0; i<N; i++) {
        	T[i]=gl();
        	A[i]=gl();
        }

        long ht=1;
        long ha=1;
        for (int i=0; i<N; i++) {
        	long tn=ht%T[i] ==0 ? ht/T[i]: Math.floorDiv(ht, T[i])+1;
        	long ta=ha%A[i] ==0 ? ha/A[i]: Math.floorDiv(ha, A[i])+1;
            long hi=Math.max(tn, ta);
            ht=hi*T[i];
            ha=hi*A[i];
        }

        System.out.println(ht+ha);

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