import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] params = in.nextLine().split(" ");
        int n = Integer.parseInt(params[0]);
        int m = Integer.parseInt(params[1]);

        params = in.nextLine().split(" ");
        Long[] as = new Long[n];
        long ans = 0;
        for( int i = 0 ; i < n ; i++ ){
            as[i] = Long.parseLong( params[i] );
            ans += as[i];
        }

        if( n == 1 ){
            while( 0 < m && as[0] != 0 ){
                as[0] /= 2;
                m--;
            }
            System.out.println(as[0]);
            return;
        }

        Arrays.sort( as , Comparator.reverseOrder());

        while( 0 < m ){

            if( ans == 0 ){
                System.out.println(0);
                return;
            }

            if( as[1] == 0 ){
                while( 0 < m && as[0] != 0 ){
                    as[0] /= 2;
                    m--;
                }
                System.out.println(as[0]);
                return;
            }

            while( 0 < m && as[0] >= as[1] && as[0] != 0 ){
                ans -= as[0] / 2 + ( as[0] != ( as[0] / 2 ) * 2 ? 1 : 0 );
                as[0] /= 2;
                m--;
            }
            if( m == 0 || ans == 0 ){
                break;
            }
            for( int i = 0 ; i < n - 1 ; i++ ){
                if( as[i] < as[i+1]){
                    Long temp = as[i];
                    as[i] = as[i+1];
                    as[i+1] = temp;
                }
                else {
                    break;
                }
            }
        }

        System.out.println( ans );

    }

}