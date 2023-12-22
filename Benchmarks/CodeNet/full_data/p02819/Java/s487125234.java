import java.util.Scanner;

/**
 * C - Next Prime
 * X 以上の素数のうち、最小のものを求めよ。
 */
public class Main {

    public static void main( String[] args ) {

        Scanner sc = new Scanner( System.in );
        // 入力値
        int x = sc.nextInt();

        while( !isPrime( x ) ) {
            x++;
        }
        System.out.println( x );

        sc.close();
    }

    // 素数判定
    public static boolean isPrime( int num ) {
        if ( num < 2 ) return false;
        else if ( num == 2 ) return true;
        else if ( num % 2 == 0 ) return false; // 偶数はあらかじめ除く

        double sqrtNum = Math.sqrt( num );
        for ( int i = 3; i <= sqrtNum; i += 2 ) {
            if (num % i == 0) {
                // 素数ではない
                return false;
            }
        }

        return true;
    }
}