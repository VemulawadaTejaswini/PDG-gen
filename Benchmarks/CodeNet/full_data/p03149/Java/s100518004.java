import java.util.*;

class Main{
    public static void main( String[] args ) {
	Scanner sc = new Scanner(System.in);
	int num[] = new int[4];
	for ( int i = 0; i < 4; i++ ) {
	    num[i] = sc.nextInt();
	}
	boolean f1 = false,f2 = false,f3 = false,f4 = false;
	for ( int i = 0; i < 4; i++ ) {
	    if ( num[i] == 1 ) f1 = true;
	    else if ( num[i] == 9 ) f2 = true;
	    else if ( num[i] == 7 ) f3 = true;
	    else if ( num[i] == 4 ) f4 = true;
	}

	if ( f1 && f2 && f3 && f4 ) System.out.println("YES");
	else System.out.println("NO");
    }
}
