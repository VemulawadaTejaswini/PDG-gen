import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    int[] D=new int[N];
	    for (int i=0; i<N; i++) {
	    	D[i]=gi();
	    }
	    
	    int M=gi();
	  int[] T=new int[M];  
      for (int i=0; i<M; i++) {
	    	T[i]=gi();
	    }
	    
	    Arrays.parallelSort(D);
	    Arrays.parallelSort(T);
	    
	    int index=0;
	    for (int i=0; i<M;i++) {
	    	int t=T[i];
	    	while(t!=D[index]) {
	    		if (D[index]>t || index==N-1) {
	    			System.out.print("NO");
	    			return;
	    		}
	    		index++;
	    	}
	    	index++;
	    }
        System.out.println("YES");
//	    if(max>s-max) {
//	    	System.out.println(s-max-1);
//	    }
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