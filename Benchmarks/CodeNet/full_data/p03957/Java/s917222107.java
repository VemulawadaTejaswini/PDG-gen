import java.util.*;

public class Main{
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String S = sc.next();
	boolean f1 = true,f2 = true;
	int indexC = -1,indexF = -2;
	for ( int i = 0; i < S.length(); i++ ) {
	    if (f1 && S.charAt(i) == 'C') {
		indexC = i;
		f1 = false;
	    } else if ( !f1 && S.charAt(i) == 'F' ) {
		indexF = i;
		f2 = false;
	    }
	}
	if ( !f1 && !f2 && indexC < indexF ) System.out.println("Yes");
	else System.out.println("No");
    }
}
