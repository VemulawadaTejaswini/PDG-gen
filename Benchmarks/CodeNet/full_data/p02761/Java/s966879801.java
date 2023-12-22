import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    int M=gi();
	    int[] S=new int[M];
	    int[] C=new int[M];
	    StringBuilder sb=new StringBuilder();
	    for (int i=0; i<N; i++) {
	    	sb.append("X");
	    }

	    for (int i=0; i<M; i++) {
	    	S[i]=gi();
	    	C[i]=gi();
	    	if(sb.charAt(S[i]-1) == 'X') {
	    		sb.setCharAt(S[i]-1, String.valueOf(C[i]).charAt(0));
	    	} else if (sb.charAt(S[i]-1) != String.valueOf(C[i]).charAt(0)) {
	    		System.out.println("-1");
	    		return;
	    	}
	    }

	    for (int i=0; i<N; i++) {
	    	if(sb.charAt(i) == 'X') {
	    		if (N!=1 && i==0) {
	    		    sb.setCharAt(i, '1');
	    		} else {
	    			sb.setCharAt(i, '0');
	    		}
	    	}
	    }

        //System.out.print(x);
	    String s=sb.toString();
        if (s.charAt(0)=='0' && N!=1) {
        	System.out.println(-1);
        }else {
        	System.out.println(s);
        }
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