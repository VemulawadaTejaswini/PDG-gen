
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	static long[] mai;
	static long[] paty;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    long X=gl();
	    mai=new long[N+1];
	    paty=new long[N+1];
        mai[0]=1;
        paty[0]=1;
	    for(int i=1; i<N+1;i++) {
	    	mai[i]=mai[i-1]*2+3;
	    	paty[i]=paty[i-1]*2+1;
	    }
	    System.out.print(f(N,X));
	}

	public static long f(int n, long x) {
        if(x==0)return 0;
		if(n==0) {
			if(x==0) {
				return 0;
			} else {
				return 1;
			}
		}
		long half=(mai[n]-1)/2;
		if (half<x) {
			return paty[n-1] + 1 + f(n-1, x-half-1);
		} else {
			return f(n-1, x-1);
		}
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