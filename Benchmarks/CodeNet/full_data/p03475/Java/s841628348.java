import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    int[] C=new int[N-1];
	    int[] S=new int[N-1];
	    int[] F=new int[N-1];

	    for (int i=0; i<N-1; i++) {
            C[i]=gi();
            S[i]=gi();
            F[i]=gi();
	    }
	    for (int i=0; i<N-1; i++) {
	    	int t=0;
	    	for (int j=i; j<N-1; j++) {
                  if (t<S[j]) {
                	  t=S[j];
                  }
                  while(t%F[j]!=0) {
                      t++;
                  }
                  t+=C[j];
		    }
	    	System.out.println(t);
	    }
	    System.out.println(0);
//        if (f) {
//    	    String a=Sq.substring(0, S.lastIndexOf(T)) + T + Sq.substring(S.lastIndexOf(T)+T.length());
//    	    System.out.print(a.replaceAll("\\?", "a"));
//        }else {
//        	System.out.print("UNRESTORABLE");
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