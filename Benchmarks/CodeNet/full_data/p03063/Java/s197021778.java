
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int n=gi();
	    String S=gs();
	    int b=0;
	    int w=0;
	    int[] ba=new int[n+1];
	    int[] wa=new int[n+1];
	    for(int i=0; i<n;i++) {
	    	char c=S.charAt(i);
	    	if(c=='.') {
	    		w++;
	    		ba[i+1]=ba[i];
	    		wa[i+1]=wa[i]+1;
	    	} else {
	    		b++;
	    		ba[i+1]=ba[i]+1;
	    		wa[i+1]=wa[i];
	    	}
	    }

	    int min=b;
	    for (int i=1; i<n+1;i++) {
	    	int m=(w-wa[i-1])+ba[i-1];
	    	if(m<min)min=m;
	    }
//	    if (s>x) {
//	    	System.out.println(n-1);
//	    } else {
//	    	Arrays.parallelSort(a);
//
//	    	System.out.println(c);
//	    }
	    System.out.println(min);
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