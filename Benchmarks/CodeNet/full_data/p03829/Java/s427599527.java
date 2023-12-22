import java.util.*;
import java.io.*;

class Main {
    public static void main( String args[] ) throws IOException {
		int n = 0;
		int a = 0;
		int b = 0;
		int xb = 0;
		int xc = 0;
		int xp = 0;
		int result = 0;

		Scanner scan = new Scanner( System.in );

		n = scan.nextInt();
		a = scan.nextInt();
		b = scan.nextInt();

		xb = scan.nextInt();

		for( int i = 1 ; i < n ; i++ ){
			xc = scan.nextInt();
			xp = (xc - xb);
			if( xp * a < b ){
				result += xp * a;
			}
			else{
				result += b;
			}

			xb = xc;
		}

        System.out.println( result );
    }
}
