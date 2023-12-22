import java.math.BigDecimal;
import java.util.Scanner;

/**
 * A - Odds of Oddness
 * 整数 N が与えられます。
 * 高橋君は、N 以下の正整数の中から等確率で 1 つを選んでa とします。
 * このとき、a が奇数である確率を答えてください。
 */
public class Main {

    public static void main( String[] args ) {
        Scanner sc = new Scanner( System.in );
        // 文字列の入力
        int n = sc.nextInt();
        System.out.println("n:" + n);
        int oddCnt = 0;
        if( n % 2 == 0 ) {
            oddCnt = n / 2;
        } else {
            oddCnt = ( n / 2 ) + 1;
        }
        BigDecimal result = new BigDecimal( oddCnt ).divide( new BigDecimal( n ) );
        System.out.println( result );
//        System.out.println("oddCnt:" +oddCnt);
    }
}