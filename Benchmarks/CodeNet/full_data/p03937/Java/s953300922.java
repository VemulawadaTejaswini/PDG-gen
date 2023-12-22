
import java.util.*;

public class Main {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner( System.in );

        int H = sc.nextInt();
        int W = sc.nextInt();
        int c = 0;
        for( int i = 0; i < H; i++ ) {
            String s = sc.next();
            for( int j = 0; j < W; j++ )
                if( s.charAt( j ) == '#' ) c++;
        }
        if( c == H + W - 1 ) System.out.println( "Possible" );
        else                 System.out.println( "Impossible" );
    }
}
