
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int n=gi();
	    long k=gl();
	    int[] A=new int[n];

        for (int i=0; i<n; i++) {
        	A[i]=gi();
        }

        long ans =0;
        long ans2=0;
        for (int i=0; i<n; i++) {
        	for (int j=i+1; j<n; j++) {
            	if(A[i]>A[j]) {
            		ans++;
            	} else if(A[i]<A[j]) {
            		ans2++;
            	}
            }
        }
        

        long k1 =(k*(k+1)/2)% 1000000007;
        long k2 =(k*(k-1)/2)% 1000000007;
        ans=(ans*k1)% 1000000007;
        ans2=(ans2*k2)% 1000000007;
        ans=(ans+ans2) % 1000000007;


	    System.out.println(ans);
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