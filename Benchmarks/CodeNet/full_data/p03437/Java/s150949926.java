import java.util.*;

public class Main{
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Long X = sc.nextLong();
	Long Y = sc.nextLong();
	System.out.println(1e18);
	if ( X % Y == 0 ) System.out.println(-1);
	else {
	    for ( int i = 2;; i++ ) {
		X *= i;
		if ( !(X % Y == 0) ) {
		    if ( X <= 1e18 ) {
			System.out.println(X);
		    } else {
			System.out.println(-1);
		    }
		    return;
		}
	    }
	}
    }
}
