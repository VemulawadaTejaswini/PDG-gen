

import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    long[] A=new long[N];
	    long[] B=new long[N];

        for(int i=0; i<N;i++) {
            A[i]=gl();
            B[i]=gl();
	    }
	    long c=0;
	    for(int i=N-1; i>=0;i--) {
            A[i]+=c;
            c+=(B[i]-(A[i]%B[i]))%B[i];
	    }

        System.out.println(c);

		//System.out.println();
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