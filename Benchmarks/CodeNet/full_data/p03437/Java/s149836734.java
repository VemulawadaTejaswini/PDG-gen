import java.util.*;

public class Main{
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Long X = sc.nextLong();
	Long Y = sc.nextLong();
	if ( X % Y == 0 ) System.out.println(-1);
	else {
	    for ( int i = 2; X * i <= 1e18; i++ ) {
		if ( X * i % Y != 0 ) {
		    System.out.println(X * i);
		    return;
		}
	    }
	    System.out.println(-1);
	}
    }
}
