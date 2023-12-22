import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String S = sc.next();
    	int B = 0;
    	int W = 0;
    	for (int i = 0; i < S.length(); i++) {
    		if (i%2 == 0) {
    			if (S.charAt(i) == '0') {
    				W++;
    			} else {
    				B++;
    			}
    		} else {
    			if (S.charAt(i) == '0') {
    				B++;
    			} else {
    				W++;
    			}
    		}
    	}
    	System.out.println(Math.min(B, W));
    }
}