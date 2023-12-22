
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    int H=gi();
	    int[] A=new int[N];
	    int[] B=new int[N];

	    int max=0;
	    for (int i=0; i<N;i++) {
	    	A[i]=gi();
	    	B[i]=gi();
	    	max=Math.max(A[i], max);
	    }

	    Arrays.parallelSort(B);

	    long ans=0;
	    int ind=N-1;
	    while(H>0) {
	    	if(ind<0 || max>=B[ind]) {
	    		if(H%max!=0)ans++;
	    		ans+=Math.floorDiv(H, max);
	    		break;
	    	} else {
	    		H-=B[ind];
	    		ind--;
	    		ans++;
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