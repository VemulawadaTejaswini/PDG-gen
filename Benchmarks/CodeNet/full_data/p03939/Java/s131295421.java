
import java.util.*;

public class Main {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner( System.in );

        int N  = sc.nextInt();
        int d1 = sc.nextInt();
        int x  = sc.nextInt();

        int l, r;
        List<List<Integer>> sums = new ArrayList<>();
        for( int i = 0; i < N; i++ ) {
            List<Integer> s = new ArrayList<>();
            l = d1 + 2 * i * x;
            r = d1 + 2 * i * x + x;
            if( i == 0 ) {
                s.add( l );
                s.add( r );
            } else {
                for( int t : sums.get( i - 1 ) ) {
                    s.add( l );
                    s.add( l + r + l );
                }
            }
            sums.add( s );
        }

        int sum = 0;
        for( List<Integer> a : sums ) for( int b : a ) sum += b;
        double exp = sum / Math.pow( 2, N );
        System.out.println( exp );

    }
}
