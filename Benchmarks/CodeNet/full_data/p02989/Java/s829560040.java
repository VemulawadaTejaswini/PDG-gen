import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    int[] D=new int[N];

	    for (int i=0; i<N;i++) {
	    	D[i]=gi();
	    }

	    Arrays.parallelSort(D);

	    int c= D[N/2] - D[N/2 -1];

	    System.out.println(c);

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
}