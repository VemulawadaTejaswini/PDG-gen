

import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    long K=gl();
	    long[] A=new long[N];
	    long[] B=new long[N];
	    
	    for(int i=0; i<N;i++) {
	    	A[i]=gl();
	    	B[i]=gl();
	    }
	    
	    long m=0;
	    long r=0;
	    for(int i=0; i<N;i++) {
	    	m+=B[i];
	    	r=A[i];
	    	if(K<=m) {
	    		break;
	    	}
	    	
	    }
        System.out.print(r);
	    
//        if (m%2==0) {
//        	System.out.println(m/2);
//        }else{
//        	System.out.println((m+1)/2);
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