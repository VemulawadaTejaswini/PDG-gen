import java.util.Scanner;

/**
 * C - Replacing Integer
 * 青木君は任意の整数 x に対し、以下の操作を行うことができます。
 * 操作: x を x と K の差の絶対値で置き換える。
 * 整数 N の初期値が与えられます。
 * この整数に上記の操作を 0 回以上好きな回数行った時にとりうる N の最小値を求めてください。
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        // 初期値
        long n = sc.nextLong();
        // x を x と K の差の絶対値
        long k = sc.nextLong();

        long remainder = n % k;

        if( k - remainder > remainder ) {
            System.out.println( remainder );
        }
        else {
            System.out.println( k - remainder );
        }

        sc.close();
    }
}
