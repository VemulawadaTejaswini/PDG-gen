
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    long[] A=new long[N];

	    long sum=0;
	    for(int i=0; i<N; i++) {
	        A[i]=gl();
	        sum+=A[i];
	    }

	    long x=0;
	    long y=sum;
	    long min=Long.MAX_VALUE;
	    for(int i=0; i<N-1; i++) {
	    	long a=A[i];
	    	x+=a;
	    	y-=a;
	    	long v=Math.abs(y-x);
	    	if(min>v)min=v;
	    }

		System.out.println(min);
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