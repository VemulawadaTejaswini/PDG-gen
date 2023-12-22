

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	static long[][] dp;
    static int ind=1;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int n=gi();
	    int[] A=new int[n];
	    int[] B=new int[n];
	    int[] C=new int[n];

        for (int i=0; i< n;i++) {
        	A[i]=gi();
        }
        for (int i=0; i< n;i++) {
        	B[i]=gi();
        }
        for (int i=0; i< n;i++) {
        	C[i]=gi();
        }

        Arrays.parallelSort(A);
        Arrays.parallelSort(B);
        Arrays.parallelSort(C);
        long ans=0;

        for (int i=n-1; i>=0;i--) {
            int a=A[i];
        	for(int j=n-1; j>=0;j--) {
        		int b=B[j];
        		if(a>=b) break;
        		int l=0;
        		int r=n;
        		while(r-l>1) {
        			int ind=(l+r)/2;
        			int c=C[ind];
        			if(c>=b) {
        				r=ind;
        			} else {
        				l=ind;
        			}
        		}
        		ans+=l+1;
        	}
        }
        System.out.println(ans);
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