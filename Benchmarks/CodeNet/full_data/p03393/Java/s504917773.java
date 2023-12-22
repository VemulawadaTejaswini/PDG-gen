
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    String S=gs();
	    String abc="abcdefghijklmnopqrstuvwxyz";

        if(S.length()<26) {
        	char c='z';
        	for(int i=0; i<abc.length();i++) {
        		if(!S.contains(abc.subSequence(i, i+1))) {
        			c=abc.charAt(i);
        			break;
        		}
        	}
		    System.out.println(S+c);
        } else {
        	char bc=S.charAt(S.length()-1);
        	StringBuilder sb=new StringBuilder();
        	sb.append(bc);
        	boolean f=false;
        	for(int i=S.length()-2; i>=0;i--) {
        		char c=S.charAt(i);
        		if(c>bc) {
                    bc=c;
                    sb.append(c);
        		} else {
        			f=true;
        			break;
        		}
        	}
        	
        	if(f) {
        		String a=sb.toString();
        		String so=S.substring(0, S.length()-a.length()-1);
        		char c='z';
            	for(int i=0; i<abc.length();i++) {
            		if(a.contains(abc.subSequence(i, i+1))) {
            			c=abc.charAt(i);
            			break;
            		}
            	}
        		System.out.println(so+c);
        	} else {
        		System.out.println(-1);
        	}
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