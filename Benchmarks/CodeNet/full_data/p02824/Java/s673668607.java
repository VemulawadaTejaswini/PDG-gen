import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] params = in.nextLine().split(" " );
        int n = Integer.parseInt( params[0] );
        int m = Integer.parseInt( params[1] );
        int v = Integer.parseInt( params[2] );
        int p = Integer.parseInt( params[3] );

        params = in.nextLine().split(" " );

        int[] as = new int[n];
        for( int i = 0 ; i < n ; i++ ){
            as[i] = Integer.parseInt( params[i] );
        }

        Arrays.sort( as );

        int[] asBase = as.clone();

        for( int i = n - 1 ; n - v + 1 <= i ; i-- ){
            as[i] += m;
        }

        int i;
        int border = 0;
        for( i = 0 ; i < n ; i++ ){
            if( as[ n - 1 - p ] <= as[i] + m ){
                border = as[i];
                break;
            }
        }

        int ngCount = 0;
        for( int j = 0 ; j < n ; j++ ){
            if( asBase[ j ] + m < border ){
                ngCount++;
            }
            else {
                break;
            }
        }

        System.out.println( n - 2 - ngCount );
    }

}