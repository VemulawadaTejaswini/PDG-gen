
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    long i=357;
	    int c=0;
	    while(i<=N) {
	    	String s=String.valueOf(i);
	    	if (s.contains("3") && s.contains("5") && s.contains("7")) c++;
	    	StringBuilder sb=new StringBuilder();
	    	boolean f=false;
	    	for (int j=0; j<s.length();j++) {
	    		char a=s.charAt(s.length()-1-j);
	    		if(f) {
	    			sb.append(a);
	    		} else {
	    			if (a=='3') {
	    				sb.append('5');
	    				f=true;
	    			} else if (a=='5') {
	    				sb.append('7');
	    				f=true;
	    			} else {
	    				sb.append('3');
	    			}
	    		}
	    	}
	    	if(!f) sb.append(3);
	    	StringBuffer sb2=new StringBuffer(sb);
	    	i=Long.parseLong(sb2.reverse().toString());
	    }

        System.out.println(c);
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