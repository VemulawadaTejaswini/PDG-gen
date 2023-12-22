
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int n=gi();
	    int min=Integer.MAX_VALUE;
	    for(int i=1; i<=Math.floorDiv(n,2)+1;i++) {
	    	int a=i;
	    	int b=n-i;
	    	int ac=0;
	    	int bc=0;
	    	while(a>0) {
	    		int q=a%10;
	    		ac+=q;
	    		a=(a-q)/10;
	    	}
	    	while(b>0) {
	    		int q=b%10;
	    		bc+=q;
	    		b=(b-q)/10;
	    	}
	    	if(min>ac+bc) {
	    		min=ac+bc;
	    	}
	    	
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