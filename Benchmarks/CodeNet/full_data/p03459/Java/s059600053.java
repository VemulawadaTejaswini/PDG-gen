
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    int[] T=new int[N];
	    int[] X=new int[N];
	    int[] Y=new int[N];

	    for(int i=0; i<N; i++) {
	    	T[i]=gi();
	    	X[i]=gi();
	    	Y[i]=gi();
	    }

	    boolean f=true;
	    int bt=0;
	    int bx=0;
	    int by=0;
	    for (int i=0; i< N; i++) {
	    	int t=T[i];
	    	int x=X[i];
	    	int y=Y[i];
	    	int dt= t-bt;
	    	int dk=Math.abs(x-bx)+Math.abs(y-by);
	    	if(dt<dk || dt%2!=dk%2) {
	    		System.out.print("No");
	    		return;
	    	}
	    	bt=t;
	    	bx=x;
	    	by=y;
	    }

	    System.out.print("Yes");
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