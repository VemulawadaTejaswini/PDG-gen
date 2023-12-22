
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
        int[] A=new int[100001];
        

	    for(int i=0; i<N; i++) {
	        int ind=gi();
	    	A[ind]++;;
	    }
	    
        int max=0;
	    for (int i=0; i<100001;i++) {
	    	int v=A[i];
	    	if(i+1<N)v+=A[i+1];
	    	if(i+2<N)v+=A[i+2];
	    	if(v>max)max=v;
	    }

		System.out.println(max);
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