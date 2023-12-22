import java.util.Scanner;

/**
 * C - Low Elements
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        // 入力値
        int a = sc.nextInt();
        int p[] = new int[a];
        int result = 1;
        for( int i = 0; i < a; i++ ) {
            p[i] = sc.nextInt();
            if( i != 0 ) {
                if( p[i] <= p[i - 1] ) {
                    result++;
                }
            }
        }

        System.out.println( result );

        sc.close();
    }
}