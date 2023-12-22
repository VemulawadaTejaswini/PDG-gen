
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    int K=gi();
	    int[] A=new int[N];

	    int min=Integer.MAX_VALUE;
	    int mi=0;
        for(int i=0; i<N;i++) {
        	A[i]=gi();
        	if(min>A[i]) {
        		min=A[i];
        		mi=i;
        	}
        }

        int s=0;
        int e=N-1;

        int n=(int)Math.ceil((double)(e-s)/(double)(K-1));
        System.out.println(n);

		//System.out.println();
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