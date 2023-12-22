
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    int[] L=new int[N*2];
	    int c=0;
	    for (int i=0; i<2*N;i++) {
	    	L[i]=gi();
	    }
	    Arrays.parallelSort(L);
	    for (int i=0; i<N;i++) {
	    	c+=Math.min(L[2*i],L[2*i+1]);
	    }
        System.out.print(c);

//        if (2*X<=Y&& Y<=4*X && Y%2==0) {
//        	System.out.println("Yes");
//        }else{
//        	System.out.println("No");
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