
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int n=gi();
	    long[] A=new long[n];

	    for (int i=0; i<n;i++) {
            A[i]=gl();
	    }
	    
	    long c=0;
	    for (int i=1; i<=n;i++) {
            long m=0;
	    	for (int j=0; j<i;j++) {
            	m+=A[j];
            }
	    	if(m==0) c++;
	    	for (int j=i; j<n;j++) {
            	m+=A[j];
            	m-=A[j-i];
            	if(m==0) c++;
            }
	    }
//	    if (s>x) {
//	    	System.out.println(n-1);
//	    } else {
//	    	Arrays.parallelSort(a);
//
//	    	System.out.println(c);
//	    }
	    System.out.println(c);
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