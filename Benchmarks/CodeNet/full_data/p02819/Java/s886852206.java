import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static boolean isSosu( int x ) {
        boolean result = true;
        for ( int i = 2; i < x; i++) {
            if (x % i == 0) {
                result = false;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] params = in.nextLine().split(" " );
        int x = Integer.parseInt( params[0] );

        while( true ){
            if( isSosu(x) ){
                System.out.println( x );
                break;
            }
            x++;
        }

    }

}
