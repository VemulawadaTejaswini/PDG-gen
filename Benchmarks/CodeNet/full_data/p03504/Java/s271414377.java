
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    int C=gi();
	    double[] S=new double[N];
	    int[] T=new int[N];
	    int[] c=new int[N];
	    boolean[][] A=new boolean[C][200001];

	    for (int i=0; i<N;i++) {
	    	S[i]=gd()-0.5;
	    	T[i]=gi();
	    	c[i]=gi()-1;
	    	for(double j=S[i]*2; j<T[i]*2;j++) {
	    		A[c[i]][(int)j]=true;
	    	}
	    }

	    int ans=0;
	    for (int i=1; i<200001;i++) {
	    	int n=0;
	    	for(int j=0; j<C;j++) {
	    		if(A[j][i]) n++;
	    	}
            ans=Math.max(ans, n);
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