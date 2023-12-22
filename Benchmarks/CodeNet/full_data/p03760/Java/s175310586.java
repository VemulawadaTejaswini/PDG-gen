import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String O = sc.next();
    	String E = sc.next();
    	StringBuilder sb = new StringBuilder();
    	for (int i = 0; i < E.length(); i++) {
    		sb.append(O.charAt(i)).append(E.charAt(i));
    	}
    	if (O.length() != E.length()) {
    		sb.append(O.charAt(O.length()-1));
    	}
    	System.out.println(sb);
    }
}