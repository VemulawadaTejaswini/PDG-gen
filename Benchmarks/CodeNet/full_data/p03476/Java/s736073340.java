
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int Q=gi();
	    int[] L=new int[Q];
	    int[] R=new int[Q];

	    int max=0;
	    for (int i=0; i<Q;i++) {
	    	L[i]=gi();
	    	R[i]=gi();
	    	max=Math.max(max, R[i]);
	    }

	    boolean[] isP=new boolean[max+1];

	    for (int i=2; i<(max+1);i++) {
	    	isP[i]=true;
	    }
	    for (int i=2; i<(max+1)/2;i++) {
	    	if(isP[i]) {
	    		int v=i;
	    		while(v+i<max+1) {
	    			v+=i;
	    			isP[v]=false;
	    		}
	    	}
	    }

	    int[] pn=new int[max+1];
	    int n=0;
	    for (int i=1; i<max+1;i++) {
	    	if(i%2==1 && isP[i] && isP[(i+1)/2])n++;
	    	pn[i]=n;
	    }

	    for(int i=0; i<Q;i++) {
	    	System.out.println(pn[R[i]]-pn[L[i]-1]);
	    }
        //System.out.println(ans);
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