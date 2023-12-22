import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    int M=gi();
	    //int[] A=new int[N];
	    int[] C=new int[N];

	    for(int i=0;i<M; i++) {
	    	int a=gi();
	    	int b=gi();
	    	C[a-1]++;
	    	C[b-1]++;
	    }
	    for(int i=0;i<N; i++) {
	    	System.out.println(C[i]);
	    }
        //System.out.println((H-h)*(W-w));
//        if (flg) {
//        	System.out.print("YES");
//        }else {
//        	System.out.print("NO");
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