import java.util.*;

public class Main{
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String S = sc.next();
	StringBuilder sb = new StringBuilder();
	sb.append(S);
	if ( S.length() == 2 ) {
	    System.out.println(S);
	} else if ( S.length() == 3 ) {
	    sb.reverse();
	    String s = sb.toString();
	    System.out.println(s);
	}
    }
}
