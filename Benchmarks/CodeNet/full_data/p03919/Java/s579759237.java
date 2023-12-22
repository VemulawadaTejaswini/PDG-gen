import java.util.*;

/**
 * B - Exactly N points.
 */
public class Main {

    private static List<Integer> resultList = null;

    public static void main( String[] args ) {

        Scanner scn = new Scanner( System.in );
        int n = scn.nextInt();

        if ( n <= 0 ) {
            System.out.print( "Input is invalid!" );
        }

        for ( int i = 1; i <= n; i++ ) {
            List<Integer> list = new ArrayList<Integer>();
            test( i, list, n );
            if (resultList != null) {
                break;
            }
        }

        for ( Integer num : resultList ) {
            System.out.println( num );
        }
    }

    private static List<Integer> test( int i, List<Integer> list, int n ) {

        int temp = n - i;

        if ( temp == 0 ) {
            list.add( i );
            resultList = list;
        } else if ( temp < 0 ) {
            test( i, list, (n + (i - 1)) );
        } else if ( temp >= i + 1 ) {
            list.add( i );
            test( i + 1, list, temp );
        } else {
            test( i + 1, list, temp );
        }

        return list;

    }

}