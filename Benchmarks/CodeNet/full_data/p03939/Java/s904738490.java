
import java.util.*;

public class Main {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner( System.in );

        int N  = sc.nextInt();
        int d1 = sc.nextInt();
        int x  = sc.nextInt();

        int l, r;
        int sum = 0;
        int b = 1;
        for( int i = 0; i < N; i++ ) {
            l = d1 + 2 * i * x;
            r = d1 + 2 * i * x + x;
            if( i == 0 ) sum += l + r;
            else         sum += ( l + 3 * r ) * b;
            b *= 2;
        }

        double exp = sum / Math.pow( 2, N );
        System.out.println( exp );

    }
}
