import java.util.*;

class Main {
	public static void main(String args[]) {
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    String S = sc.next();
	    String F = S.substring(0,N/2);
	    String L = S.substring(N/2);
	    
		if (N%2 == 1 || !F.equals(L)) {
	    	System.out.println("No");
		} else {
	    	System.out.println("Yes");
	    }
	}
}
