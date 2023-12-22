import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    int[] P = new int[N];

	    int min = Integer.MAX_VALUE;
	    int c=0;
	    for (int i=0; i<N; i++) {
	    	P[i] = gi();
	    	if (min>P[i]) {
	    		min=P[i];
	    		c++;
	    	}
	    }
	    
	    
        System.out.println(c);
//        if (X%Y==0) {
//        	System.out.print("-1");
//        }else{
//        	long c=1;
//        	while(true) {
//        		if (((X*c) %Y) != 0) {
//        			System.out.print(X*c);
//        			return;
//        		}
//        		c++;
//        	}
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
}