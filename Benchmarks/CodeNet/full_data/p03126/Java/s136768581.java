
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

        int n=gi();
        int m=gi();
        int[] K=new int[n];
        boolean[][] A = new boolean[n][m];
        
        for (int i=0; i<n;i++) {
        	for (int j=0; j<m;j++) {
            	A[i][j]=false;
            	
            }
        }
        for (int i=0; i<n;i++) {
        	K[i]=gi();
        	for (int j=0; j<K[i];j++) {
            	int a=gi();
            	A[i][a-1]=true;
            	
            }
        }
        
        int s=0;
        for (int i=0; i<m;i++) {
        	boolean flg=true;
        	for (int j=0; j<n;j++) {
            	if(A[j][i]==false) {
            		flg=false;
            		break;
            	}
            	
            }
        	if(flg)s++;
        }
	    System.out.println(s);

//        if (s>L[n-2]) {
//        	System.out.println("Yes");
//        }else {
//        	System.out.println("No");
//        }
	}


	public static long d(long n) {
		String a=String.valueOf(n);
		return (long)a.length();
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