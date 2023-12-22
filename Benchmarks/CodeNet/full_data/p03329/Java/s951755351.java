
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();

	    int min=Integer.MAX_VALUE;
	    for (int i=0; i<=Math.floorDiv(N, 9);i++) {
	    	int nN=9*i;
	    	int sN=6*Math.floorDiv(N-nN, 6);
	    	int oN=N-nN-sN;
	    	String nNs=Nsin(nN,9);
	    	String sNs=Nsin(sN,6);
	    	int v=oN;
	    	for (int j=0; j<nNs.length();j++) {
	    		int m=Integer.valueOf(nNs.substring(j,j+1));
	    		v+=m;
	    	}
	    	for (int j=0; j<sNs.length();j++) {
	    		int m=Integer.valueOf(sNs.substring(j,j+1));
	    		v+=m;
	    	}
	        if(v<min)min=v;
	    }

	    System.out.println(min);
//        if (f) {
//    	    String a=Sq.substring(0, S.lastIndexOf(T)) + T + Sq.substring(S.lastIndexOf(T)+T.length());
//    	    System.out.print(a.replaceAll("\\?", "a"));
//        }else {
//        	System.out.print("UNRESTORABLE");
//        }
	}

	// s進数で表した時の文字列
	public static String Nsin(int n, int s) {
		if(n==0) return "0";

		StringBuffer sb=new StringBuffer();
		while(n!=0) {
			int a=n%s;
			sb.append(a);
			n=(n-a)/s;
		}

		return sb.reverse().toString();
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